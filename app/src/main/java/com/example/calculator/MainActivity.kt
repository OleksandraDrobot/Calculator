package com.example.calculator

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

private var button: Button? = null

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.buttonForSolve)

        fun setTextFields(str: String){
    }
    }
}