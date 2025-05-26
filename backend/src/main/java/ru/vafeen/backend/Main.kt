package ru.vafeen.backend

import com.google.auth.oauth2.GoogleCredentials
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import com.google.firebase.messaging.FirebaseMessaging
import com.google.firebase.messaging.Message
import com.google.firebase.messaging.Notification
import java.io.FileInputStream

const val token =
    "d_uefvSVQ7ipthwzFAf5c5:APA91bHTByxY-EXEerSNgfuZDmcdR2002t6nUfBZQ1NKBPPGn_IOgK4iOhyhhMfGVK9GNibf4cyEIn65SS0swsrYcH9FRSWzJe_GiCWj5ggj6zdVKqb5OsY"
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
