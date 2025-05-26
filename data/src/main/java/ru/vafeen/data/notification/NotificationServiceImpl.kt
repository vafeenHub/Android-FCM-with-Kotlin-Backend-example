package ru.vafeen.data.notification

import android.app.Notification
import android.app.NotificationManager
import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import ru.vafeen.domain.notificaion.NotificationService
import javax.inject.Inject

/**
 * Реализация сервиса уведомлений для отображения уведомлений в приложении.
 *
 * @property context Контекст приложения, используемый для доступа к системным службам.
 */
internal class NotificationServiceImpl @Inject constructor(
    @ApplicationContext private val context: Context,
    private val notificationManager: NotificationManager
) : NotificationService {


    /**
     * Отображает уведомление.
     *
     * @param notification Уведомление, которое будет показано пользователю.
     * Уведомление будет отображено с уникальным идентификатором, сгенерированным случайным образом.
     */
    override fun showNotification(idOfNotification: Int, notification: Notification) {
        notificationManager.notify(
            idOfNotification,
            notification
        ) // Показываем уведомление с уникальным ID
    }
}
