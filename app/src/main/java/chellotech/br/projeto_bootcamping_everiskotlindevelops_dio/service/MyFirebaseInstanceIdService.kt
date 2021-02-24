package chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.service

import android.util.Log
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.FirebaseInstanceIdService

/**
 * Projeto-Bootcamping-EverisKotlinDevelops-DIO
 * @author Marcelo Alves
 * 24/02/2021
 */
class MyFirebaseInstanceIdService : FirebaseInstanceIdService() {

    override fun onTokenRefresh() {
        Log.i("**newTokenService", FirebaseInstanceId.getInstance().token.toString())
    }
}