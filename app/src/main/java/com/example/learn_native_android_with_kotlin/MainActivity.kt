package com.example.learn_native_android_with_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val ageValue = findViewById<EditText>(R.id.age_EditText)
        val ageView = findViewById<TextView>(R.id.age_textView)
        val calAgeBTN = findViewById<Button>(R.id.cal_age_BTN)

        calAgeBTN.setOnClickListener{
            val enteredAgeText = ageValue.editableText.toString()
            val  age = 2024 - enteredAgeText.toInt()
            ageView.text = age.toString()
        }

    }
}