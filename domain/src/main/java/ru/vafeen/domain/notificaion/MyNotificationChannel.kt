package ru.vafeen.domain.notificaion

import android.app.NotificationManager

object MyNotificationChannel {
    object FCM : ChannelInfo {
        override val NOTIFICATION_CHANNEL_ID = "FCM-channel"
        override val NOTIFICATION_CHANNEL_NAME = "FCM"
        override val REQUEST_CODE = 200
        override val IMPORTANCE: Int = NotificationManager.IMPORTANCE_HIGH
    }

}