package ru.vafeen.domain.notificaion

import android.app.Notification

/**
 * Интерфейс для работы с уведомлениями.
 */
interface NotificationService {

    /**
     * Показывает указанное уведомление.
     * @param idOfNotification Идентификтор уведомления
     * @param notification Уведомление, которое нужно отобразить.
     */
    fun showNotification(idOfNotification: Int, notification: Notification)
}
