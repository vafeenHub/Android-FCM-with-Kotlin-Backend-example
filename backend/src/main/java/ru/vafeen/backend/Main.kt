package ru.vafeen.backend

import com.google.auth.oauth2.GoogleCredentials
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import com.google.firebase.messaging.FirebaseMessaging
import com.google.firebase.messaging.Message
import com.google.firebase.messaging.Notification
import java.io.FileInputStream

const val token =
    "fL8De1-bSuiZVLp0dO-wZv:APA91bFrXL4CUS_P8V2peGOo9CB1ivlk-zs_XalcE4DHOcaQwaacnhQOep9hjFygbBxUm862Ubfrp-Di-en8B9NGRxJRxpVrVEqXywQctQlDbrFU_dj7MTw"

fun main() {
    initialFirebase()
    val fcm = FirebaseMessaging.getInstance()
    val message = Message.builder().setNotification(
        Notification.builder().setTitle("test sdk title").setBody("test sdk text").build()
    ).setToken(token).build()
    println(fcm.send(message))
}

fun initialFirebase() {
    val serviceAccount =
        FileInputStream("C:\\Users\\A\\my-app-51280-firebase-adminsdk-fbsvc-b379f61dac.json")

    val options = FirebaseOptions.builder()
        .setCredentials(GoogleCredentials.fromStream(serviceAccount))
        .build()

    FirebaseApp.initializeApp(options)

}
