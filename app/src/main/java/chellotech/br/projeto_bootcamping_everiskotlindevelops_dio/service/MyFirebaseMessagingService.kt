package chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.service

import android.util.Log
import chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.outros.showNotification
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

/**
 * Projeto-Bootcamping-EverisKotlinDevelops-DIO
 * @author Marcelo Alves
 * 24/02/2021
 */
class MyFirebaseMessagingService : FirebaseMessagingService() {

    private val tag = "FirebaseMService"
    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        Log.i(tag, remoteMessage.from.toString())

        if(remoteMessage.notification != null){

            this.showNotification("1234", remoteMessage.notification?.title.toString(),
                remoteMessage.notification?.body.toString())

        }

        Log.i("**newToken", FirebaseInstanceId.getInstance().token.toString())

    }
}