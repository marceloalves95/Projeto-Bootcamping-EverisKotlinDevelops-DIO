package chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.model

import com.google.gson.annotations.SerializedName

/**
 * Projeto-Bootcamping-EverisKotlinDevelops-DIO
 * @author Marcelo Alves
 * 24/02/2021
 */
data class Product(

    @SerializedName("id")
    val id: String,

    @SerializedName("prname")
    val prName: String,

    @SerializedName("primage")
    val prImage: String,

    @SerializedName("prprice")
    val prPrice: String
)