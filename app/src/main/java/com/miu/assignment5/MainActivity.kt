package com.miu.assignment5

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_prob1.setOnClickListener {
            val quizIntent = Intent(this, QuizApp::class.java)
            startActivity(quizIntent)
        }
        btn_prob2_listview.setOnClickListener {
            val shopIntent = Intent(this, ShopCategory::class.java)
            startActivity(shopIntent)
        }
//        btn_prob2_recyclerview.setOnClickListener {
//            val electronicsIntent = Intent(this, Electronics::class.java)
//            startActivity(electronicsIntent)
//        }
    }
}