package chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.telas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.R

class CalculadoraNotasMain : AppCompatActivity() {

    lateinit var nota1:EditText
    lateinit var nota2:EditText
    lateinit var faltas:EditText
    lateinit var calcular:Button
    lateinit var limpar:Button
    lateinit var resultado:TextView
    lateinit var notafinal:TextView
    lateinit var numerofaltas:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora_notas_main)

        title = "Calculadora de Notas"

        initViews()

    }

    fun initViews(){

        nota1 = findViewById(R.id.nota1)
        nota2 = findViewById(R.id.nota2)
        faltas = findViewById(R.id.faltas)

        resultado = findViewById(R.id.resultado)
        notafinal = findViewById(R.id.nota_final)
        numerofaltas = findViewById(R.id.numero_faltas)

        limpar = findViewById(R.id.limpar)
        limpar.setOnClickListener {

            nota1.setText("")
            nota2.setText("")
            faltas.setText("")
            resultado.text = ""
            notafinal.text = ""
            numerofaltas.text = ""

        }

        calcular = findViewById(R.id.calcular)
        calcular.setOnClickListener {

            val nota1 = Integer.parseInt(nota1.text.toString())
            val nota2 = Integer.parseInt(nota2.text.toString())
            val faltas = Integer.parseInt(faltas.text.toString())

            val media = (nota1.plus(nota2)) / 2

            if (media >= 6 && faltas <= 10) {

                resultado.text = "Aluno Aprovado"
                resultado.setTextColor(Color.GREEN)
                notafinal.text = "A sua média é de: ${media}"
                numerofaltas.text = "O seu número de faltas foi de: ${faltas} "

            } else {

                resultado.text = "Aluno Reprovado"
                resultado.setTextColor(Color.RED)
                notafinal.text = "A sua média é de: ${media}"
                numerofaltas.text = "O seu número de faltas foi de: ${faltas} "


            }




        }


    }
}