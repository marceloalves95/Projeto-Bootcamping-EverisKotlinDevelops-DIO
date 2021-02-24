package chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.R
import chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.model.Product
import com.bumptech.glide.Glide

/**
 * Projeto-Bootcamping-EverisKotlinDevelops-DIO
 * @author Marcelo Alves
 * 24/02/2021
 */
class ProductAdapter (
    private val context:Context,
    private val productList: List<Product>
):RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder =
        ProductViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.product_item,parent,false))

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {

        val item = productList[position]
        holder.productName.text = item.prName
        holder.productPrice.text = item.prPrice

        Glide.with(context).load(item.prImage).into(holder.productImage)

    }

    override fun getItemCount(): Int = productList.size

    class ProductViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {

        val productImage:ImageView = itemView.findViewById(R.id.prod_image)
        val productName:TextView = itemView.findViewById(R.id.produc_name)
        val productPrice:TextView = itemView.findViewById(R.id.produc_price)



    }


}