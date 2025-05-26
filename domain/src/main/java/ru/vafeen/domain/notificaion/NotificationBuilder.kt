package ru.vafeen.domain.notificaion

import android.app.Notification

/**
 * Интерфейс для построения уведомлений.
 */
interface NotificationBuilder {

    /**
     * Создает уведомле о напоминании
     **/
    fun createNotification(
        title: String = "title",
        text: String = "Hello world!",
    ): Notification

}
