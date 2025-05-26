package ru.vafeen.data.notification

import android.app.Notification
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.media.RingtoneManager
import androidx.core.app.NotificationCompat
import dagger.hilt.android.qualifiers.ApplicationContext
import ru.vafeen.domain.notificaion.MyNotificationChannel
import ru.vafeen.domain.notificaion.NotificationBuilder
import javax.inject.Inject

internal class NotificationBuilderImpl @Inject constructor(
    @ApplicationContext private val context: Context,
) : NotificationBuilder {
    override fun createNotification(title: String, text: String): Notification {
        val pendingIntent = PendingIntent.getActivity(
            context,
            MyNotificationChannel.FCM.REQUEST_CODE,
            Intent(),
            PendingIntent.FLAG_IMMUTABLE or PendingIntent.FLAG_UPDATE_CURRENT // Обновляем текущий интент.
        )

        return NotificationCompat.Builder(
            context,
            MyNotificationChannel.FCM.NOTIFICATION_CHANNEL_ID // Используем ID канала.
        )
            .setSmallIcon(ru.vafeen.data.R.drawable.ic_launcher_foreground)
            .setContentTitle(title)
            .setContentText(text)
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)) // Устанавливаем звук.
            .setContentIntent(pendingIntent)
            .build()
    }
}