package chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.telas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.R
import chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.model.MainViewModel

class ViewModelLifecycleMain : AppCompatActivity() {

    private lateinit var textViewcontador:TextView
    private lateinit var dados:Button
    private lateinit var mostrar:Button

    lateinit var mViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_model_lifecycle_main)

        initDados()
        initClick()

        title = "View Model e Lifecycle"

    }

    private fun initDados(){

        mViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        textViewcontador = findViewById(R.id.tv_contador)
        dados = findViewById(R.id.btn_dados)
        mostrar = findViewById(R.id.btn_mostrar)

        mViewModel.mContador.observe(this, Observer { valor ->

            textViewcontador.text = valor

        })

    }


    private fun initClick(){

        dados.setOnClickListener {

            mViewModel.contador()


        }

        mostrar.setOnClickListener { mostrarDados() }

    }


    private fun mostrarDados(){

        Toast.makeText(applicationContext, "O valor do contador é:${mViewModel.mContador.value} ", Toast.LENGTH_SHORT).show()


    }
}