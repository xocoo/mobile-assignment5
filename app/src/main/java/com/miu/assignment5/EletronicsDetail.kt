package com.miu.assignment5

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_eletronics_detail.*

class EletronicsDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eletronics_detail)

        if (intent.hasExtra("title") && intent.hasExtra("image") && intent.hasExtra("color") && intent.hasExtra(
                "desc"
            )
        ) {
            var title = intent.getStringExtra("title")
            var img = intent.getIntExtra("image", 0)
            var color = intent.getStringExtra("color")
            var desc = intent.getStringExtra("desc")
            tv_product_title_detail.text = title.toString()
            tv_product_color_detail.text = color.toString()
            tv_product_desc_detail.text = desc.toString()
            img_product_detail.setImageResource(img)
        } else
            Toast.makeText(this, "Aldaa", Toast.LENGTH_LONG).show()
    }
}