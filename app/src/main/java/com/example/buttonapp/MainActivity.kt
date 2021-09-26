package com.example.buttonapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var counter_txt : TextView
    lateinit var plus_btn : Button
    lateinit var minus_btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        counter_txt = findViewById(R.id.textView)
        plus_btn = findViewById(R.id.plus_button)
        minus_btn = findViewById(R.id.minus_button)

        plus_btn.setOnClickListener { Increment() }
        minus_btn.setOnClickListener { Decrement() }


    }

    fun Increment(){
        var counter_value = counter_txt.getText().toString()!!.toInt() + 1
        if(counter_value > 0 )
            counter_txt.setTextColor(Color.parseColor("green"))
        else if(counter_value == 0)
            counter_txt.setTextColor(Color.parseColor("black"))
        else
            counter_txt.setTextColor(Color.parseColor("red"))
        counter_txt.text ="$counter_value"
    }

    fun Decrement(){
        var counter_value = counter_txt.getText().toString()!!.toInt() - 1
        if(counter_value > 0 )
            counter_txt.setTextColor(Color.parseColor("green"))
        else if(counter_value == 0)
            counter_txt.setTextColor(Color.parseColor("black"))
        else
            counter_txt.setTextColor(Color.parseColor("red"))
        counter_txt.text ="$counter_value"
    }
}