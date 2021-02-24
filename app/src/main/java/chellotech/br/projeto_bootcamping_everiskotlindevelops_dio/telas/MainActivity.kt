package chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.telas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.R

class MainActivity : AppCompatActivity() {

    lateinit var btnCalculadoraNotas:Button
    lateinit var btnCalculadoraIMC:Button
    lateinit var btnViewModelLifecycle:Button
    lateinit var btnContentProviderServidor:Button
    lateinit var btnNotification:Button
    lateinit var btnRetrofit:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }

    fun initViews(){

        btnCalculadoraNotas = findViewById(R.id.calculadora_notas)
        btnCalculadoraIMC = findViewById(R.id.calculadora_imc)
        btnViewModelLifecycle = findViewById(R.id.view_model_lifecycle)
        btnContentProviderServidor = findViewById(R.id.content_provider)
        btnNotification = findViewById(R.id.notifications)
        btnRetrofit = findViewById(R.id.retrofit)

        btnCalculadoraNotas.setOnClickListener {
          val intent = Intent(this@MainActivity, CalculadoraNotasMain::class.java)
            startActivity(intent)
        }
        btnCalculadoraIMC.setOnClickListener {
            val intent = Intent(this@MainActivity, CalculadoraImcMain::class.java)
            startActivity(intent)
        }
        btnViewModelLifecycle.setOnClickListener {
            val intent = Intent(this@MainActivity, ViewModelLifecycleMain::class.java)
            startActivity(intent)
        }
        btnContentProviderServidor.setOnClickListener {
            val intent = Intent(this@MainActivity, ContentProviderServidorMain::class.java)
            startActivity(intent)
        }

        btnNotification.setOnClickListener {
            val intent = Intent(this@MainActivity, NotificationsMain::class.java)
            startActivity(intent)
        }
        btnRetrofit.setOnClickListener {
            val intent = Intent(this@MainActivity, RetrofitMain::class.java)
            startActivity(intent)
        }



    }
}