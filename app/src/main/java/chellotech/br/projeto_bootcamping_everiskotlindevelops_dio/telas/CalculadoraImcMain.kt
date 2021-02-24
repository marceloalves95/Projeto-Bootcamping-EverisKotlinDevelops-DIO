package chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.telas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.R

class CalculadoraImcMain : AppCompatActivity() {

    lateinit var calcular:Button
    lateinit var limpar:Button
    lateinit var altura:EditText
    lateinit var peso:EditText
    lateinit var calculo_imc:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora_imc_main)

        initViews()
        title = "Calculadora de IMC"

    }

    fun initViews(){

        calcular = findViewById(R.id.calcular)
        limpar = findViewById(R.id.limpar)
        altura = findViewById(R.id.altura)
        peso = findViewById(R.id.peso)
        calculo_imc = findViewById(R.id.calculo_imc)
        calcular.setOnClickListener { calcularIMC(altura.text.toString(),peso.text.toString() ) }
        limpar.setOnClickListener { limparCampos()  }

    }

    fun calcularIMC(altura:String, peso:String){

        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull()
        if(peso != null && altura != null){

            val resultado_imc =  peso / (altura * altura)
            calculo_imc.text = "O seu IMC é: %.2f".format(resultado_imc)

        }


    }

    fun limparCampos(){

        peso.setText("")
        altura.setText("")
        calculo_imc.text = ""

    }
}