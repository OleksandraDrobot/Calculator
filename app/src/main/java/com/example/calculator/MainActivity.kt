package com.example.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var button: Button? = null
    private var input: EditText? = null
    private var resultOf: TextView? = null
    private val pi = 3.14

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.buttonForSolve1)
        input = findViewById(R.id.EnterNumberOfCircle)
        resultOf = findViewById(R.id.ResultOfWork)

        button?.setOnClickListener {
            val radius = input?.text.toString().toDouble()
            val s = pi*radius*radius

            resultOf?.text = "result = $s"
        }
    }
}