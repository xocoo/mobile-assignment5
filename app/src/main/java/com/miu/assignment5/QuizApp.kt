package com.miu.assignment5

import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_quiz_app.*
import kotlinx.android.synthetic.main.activity_quiz_app.view.*
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

class QuizApp : AppCompatActivity() {
    private var score = 0
    private lateinit var correct: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_app)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun submit(view: View) {
//        Current date and time
        val current = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
        val formatted = current.format(formatter)
//        Score
        if (radio_Encapsulation.isChecked)
            score++
        if (checkBox1.isChecked && checkBox3.isChecked && !checkBox2.isChecked && !checkBox4.isChecked)
            score++
        when (score) {
            1 -> correct = "50%"
            2 -> correct = "100%"
            else -> correct = "0%"
        }

//        Alert Dialog
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Quiz Result")
        builder.setMessage("Congratulations! You submitted on ${formatted}, Your achieved ${correct} score is: ${score}")
        builder.setIcon(R.drawable.quiz_result)

        builder.setNeutralButton("Okay") { dialogInterface, which ->
            dialogInterface.dismiss()
            reset(view)
        }

        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    fun reset(view: View) {
        score = 0
        rg.clearCheck()
        if (checkBox1.isChecked()) {
            checkBox1.setChecked(false);
        }
        if (checkBox2.isChecked()) {
            checkBox2.setChecked(false);
        }
        if (checkBox3.isChecked()) {
            checkBox3.setChecked(false);
        }
        if (checkBox4.isChecked()) {
            checkBox4.setChecked(false);
        }
    }
}