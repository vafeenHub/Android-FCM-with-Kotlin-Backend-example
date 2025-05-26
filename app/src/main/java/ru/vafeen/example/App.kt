package ru.vafeen.example

import android.app.Application
import android.app.NotificationManager
import com.google.firebase.FirebaseApp
import dagger.hilt.android.HiltAndroidApp
import ru.vafeen.domain.notificaion.MyNotificationChannel
import ru.vafeen.domain.notificaion.createNotificationChannelKClass
import javax.inject.Inject

@HiltAndroidApp
internal class App : Application() {
    @Inject
    lateinit var notificationManager: NotificationManager
    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this@App)

        notificationManager.createNotificationChannel(
            MyNotificationChannel.FCM.createNotificationChannelKClass()
        )
    }
}