package com.miu.assignment5

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_shop_category.*

class ShopCategory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop_category)

        img_clothing.setOnClickListener {
            val clothingIntent = Intent(this, Clothing::class.java)
            startActivity(clothingIntent)
        }

        img_electronics.setOnClickListener {
            val electronicsIntent = Intent(this, Electronics::class.java)
            startActivity(electronicsIntent)
        }

    }


}