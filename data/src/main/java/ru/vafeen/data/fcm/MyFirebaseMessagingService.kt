package ru.vafeen.data.fcm

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import dagger.hilt.android.AndroidEntryPoint
import ru.vafeen.domain.notificaion.NotificationBuilder
import ru.vafeen.domain.notificaion.NotificationService
import javax.inject.Inject


@AndroidEntryPoint
class MyFirebaseMessagingService : FirebaseMessagingService() {
    @Inject
    lateinit var notificationService: NotificationService

    @Inject
    lateinit var notificationBuilder: NotificationBuilder
    override fun onMessageReceived(message: RemoteMessage) {
        notificationService.showNotification(
            0, notificationBuilder.createNotification(
                title = "${message.notification?.title}",
                text = "${message.notification?.body}"
            )
        )
    }

    override fun onNewToken(token: String) {
        super.onNewToken(token)
        Log.e("fcm", "token=$token")
    }
}
