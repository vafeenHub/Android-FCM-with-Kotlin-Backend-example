package ru.vafeen.data.fcm

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService : FirebaseMessagingService() {

    override fun onMessageReceived(message: RemoteMessage) {
        Log.e(
            "fcm",
            "title=${message.notification?.title}" +
                    "\ntext=${message.notification?.body}"
        )
    }

    override fun onNewToken(token: String) {
        super.onNewToken(token)
        Log.e("fcm", "token=$token")
    }
}