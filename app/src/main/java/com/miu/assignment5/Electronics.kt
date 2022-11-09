package com.miu.assignment5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_electronics.*

class Electronics : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_electronics)

        val products = ArrayList<Product>()
        products.add(
            Product(
                "Samsung Galaxy Tab S8",
                99.99,
                "Graphite",
                R.drawable.tablet,
                "The tablet that’s made for multitaskers on the go, Galaxy Tab S8 helps you do more with the 2-in-1 capabilities of a tablet and a PC. Samsung DeX creates a desktop experience right there on your tablet, mirroring the display and navigation on a laptop to let you work on multiple windows. "
            )
        )
        products.add(
            Product(
                "Surface Laptop Studio",
                1399.99,
                "Silver",
                R.drawable.laptop,
                "Build apps, edit video, render animations, and enjoy smooth gameplay without breaking a sweat. Bring ideas to life with quad-core powered processors and incredible graphics. Keep your cool under pressure thanks to passive cooling and industry-leading thermal design."
            )
        )
        products.add(
            Product(
                "TCL 55\" Class 4-Series 4K UHD HDR Smart Roku TV - 55S41",
                188.00,
                "Black",
                R.drawable.tv,
                "The TCL 4-Series Roku TV offers stunning 4K picture quality with four times the resolution of Full HD for enhanced clarity and detail, as well as endless entertainment with thousands of streaming channels. High dynamic range (HDR) technology delivers bright and accurate colors for a lifelike viewing experience. In addition, your favorite HD shows, movies, and sporting events are enhanced to near Ultra HD resolution with 4K Upscaling."
            )
        )
        products.add(
            Product(
                "Epson EcoTank Photo ET‑8500",
                699.99,
                "Gray",
                R.drawable.printer,
                "With built-in wireless printing, including native Apple® iPhone® and iPad® support, it's never been easier for Creatives, Photographers, Designers, and Artists to work the way they want to."
            )
        )

        val adapter = ElectronicsAdapter(this, products)
        rv.adapter = adapter
        rv.layoutManager = LinearLayoutManager(this)
    }
}