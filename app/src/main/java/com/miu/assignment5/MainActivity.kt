package com.miu.assignment5

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_quiz.setOnClickListener {
            val quizIntent = Intent(this, QuizApp::class.java)
            startActivity(quizIntent)
        }
    }
}