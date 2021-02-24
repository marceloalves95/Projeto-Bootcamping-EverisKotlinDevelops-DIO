package chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.api

import chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.interfaces.ProductApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Projeto-Bootcamping-EverisKotlinDevelops-DIO
 * @author Marcelo Alves
 * 24/02/2021
 */
class MyRetrofit {

    private val retrofit:Retrofit =
        Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()

    fun productApi():ProductApi{
        return retrofit.create(ProductApi::class.java)
    }

    companion object{

        private const val BASE_URL = "https://uniqueandrocode.000webhostapp.com.br/hiren/androidtutorial/mycart/"

        var myretrofit:MyRetrofit? = null
        @get:Synchronized
        val instance:MyRetrofit?
            get() {
                if(myretrofit == null){

                    myretrofit = MyRetrofit()

                }
                return myretrofit
            }

    }
}