package com.miu.assignment5

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_list.view.*

class ElectronicsAdapter(var context: Context, var productList: ArrayList<Product>) :
    RecyclerView.Adapter<ElectronicsAdapter.ProductViewHolder>() {

    inner class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.itemView.playout.apply {
            tv_title.text = productList[position].title
            tv_price.text = productList[position].price.toString()
            tv_color.text = productList[position].color
            imageView.setImageResource((productList[position].image))
        }


        holder.itemView.playout.setOnClickListener {
            val eletronicsDetailIntent = Intent(context, EletronicsDetail::class.java)

            eletronicsDetailIntent.putExtra("title", productList[position].title)
            eletronicsDetailIntent.putExtra("image", productList[position].image)
            eletronicsDetailIntent.putExtra("color", productList[position].color)
            eletronicsDetailIntent.putExtra("desc", productList[position].desc)
            context.startActivity(eletronicsDetailIntent)
        }
    }

    override fun getItemCount(): Int {
        return productList.size
    }
}