package ru.vafeen.example

import android.app.Application
import com.google.firebase.FirebaseApp

internal class App : Application() {
    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this@App)
    }
}