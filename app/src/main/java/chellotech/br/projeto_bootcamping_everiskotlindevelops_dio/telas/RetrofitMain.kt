package chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.telas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.R
import chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.adapter.ProductAdapter
import chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.api.MyRetrofit
import chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.model.Product
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RetrofitMain : AppCompatActivity() {

    lateinit var recyclerProducts:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retrofit_main)

        title = "Retrofit"

        recyclerProducts = findViewById(R.id.recycler_products)
        recyclerProducts.layoutManager = LinearLayoutManager(this)
        getData()
    }

    private fun getData(){

        val call:Call<List<Product>> =
            MyRetrofit.instance?.productApi()?.getProductApi() as Call<List<Product>>
        call.enqueue(object : Callback<List<Product>>{

            override fun onResponse(call: Call<List<Product>>, response: Response<List<Product>>) {
                val adapter = ProductAdapter(this@RetrofitMain, response.body() as List<Product>)
                recyclerProducts.adapter = adapter
            }

            override fun onFailure(call: Call<List<Product>>, t: Throwable) {
                Toast.makeText(this@RetrofitMain, t.message, Toast.LENGTH_LONG).show()
            }


        })

    }
}