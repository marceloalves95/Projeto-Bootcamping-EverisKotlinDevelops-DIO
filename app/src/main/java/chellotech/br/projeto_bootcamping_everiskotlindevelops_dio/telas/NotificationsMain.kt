package chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.telas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.R
import chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.outros.showNotification

class NotificationsMain : AppCompatActivity() {

    lateinit var btnSend:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifications_main)

        title = "Notifications com Firebase"
        btnSend = findViewById(R.id.button_send_notification)
        btnSend.setOnClickListener {

            this.showNotification("1234", "bootcamping Android", "Kotlin Android Curso")

        }
    }
}