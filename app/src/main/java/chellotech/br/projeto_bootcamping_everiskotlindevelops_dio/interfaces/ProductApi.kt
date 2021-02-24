package chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.interfaces

import chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.model.Product
import retrofit2.Call
import retrofit2.http.GET

/**
 * Projeto-Bootcamping-EverisKotlinDevelops-DIO
 * @author Marcelo Alves
 * 24/02/2021
 */
interface ProductApi {

    @GET("getdata.php")
    fun getProductApi(): Call<List<Product>>
}