package com.miu.assignment5

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_clothing.*

class Clothing : AppCompatActivity() {

    private lateinit var clothes: Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clothing)

        clothes = resources.getStringArray(R.array.clothes)
        val adapter =
            ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, clothes)
        lview.adapter = adapter
        lview.setOnItemClickListener { parent, view, position, id ->
            val item = parent?.getItemAtPosition(position).toString()
            Toast.makeText(
                this,
                "You have chosen the $item category of shopping",
                Toast.LENGTH_SHORT
            )
                .show()
        }
    }
}