package chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * Projeto-Bootcamping-EverisKotlinDevelops-DIO
 * @author Marcelo Alves
 * 24/02/2021
 */
class MainViewModel  : ViewModel(){

    var mContador = MutableLiveData<String>().apply { value = contador.toString() }
    private var contador: Int = 0

    private fun setContador() {
        mContador.value = contador.toString()
    }

    private fun validarContador() {

        contador++
        if (contador > 5) {

            contador = 0

        }

        setContador()
    }
    fun contador(){
        validarContador()
    }
}