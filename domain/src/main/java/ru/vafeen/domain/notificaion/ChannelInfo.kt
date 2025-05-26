package ru.vafeen.domain.notificaion


import android.app.NotificationChannel

interface ChannelInfo {
    val NOTIFICATION_CHANNEL_ID: String
    val NOTIFICATION_CHANNEL_NAME: String
    val REQUEST_CODE: Int
    val IMPORTANCE: Int
}

fun ChannelInfo.createNotificationChannelKClass(): NotificationChannel =
    NotificationChannel(
        NOTIFICATION_CHANNEL_ID,
        NOTIFICATION_CHANNEL_NAME,
        IMPORTANCE
    )