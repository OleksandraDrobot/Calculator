package com.example.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private var button: Button? = null
    private var input: EditText? = null
    private var resultOf: TextView? = null
    private val pi = 3.14

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: ConstraintLayout = binding.root
        setContentView(view)

        button = findViewById(R.id.buttonForSolveCircle)
        input = findViewById(R.id.enterNumberOfCircle)
        resultOf = findViewById(R.id.resultOfWorkForCircle)

        button?.setOnClickListener {
            val radius = input?.text.toString().toDouble()
            val s = pi*radius*radius
            resultOf?.text = "result = $s"
        }

        binding.buttonForSolveSquare.setOnClickListener {
            val side_a = binding.enterNumberOfSquare.text.toString().toDouble()
            val s = side_a*side_a
            binding.resultOfWorkForSquare.text = "result = $s"
        }

        binding.buttonForSolveRectangle.setOnClickListener {
            val side_a = binding.enterNumberOfRectangleSideA.text.toString().toDouble()
            val side_b = binding.enterNumberOfRectangleSideB.text.toString().toDouble()
            val s = side_a*side_b
            binding.resultOfWorkForRectangle.text = "result = $s"
        }
    }
}