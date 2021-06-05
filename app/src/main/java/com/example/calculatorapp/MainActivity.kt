package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAdd=findViewById<Button>(R.id.btnAdd)
        val btnSubtruct=findViewById<Button>(R.id.btnSubtract)
        val btnMult=findViewById<Button>(R.id.btnMult)
        var btnModulus=findViewById<Button>(R.id.btnModulus)
        val etNumber=findViewById<EditText>(R.id.etNumber)
        val  etNumber2=findViewById<EditText>(R.id.etNumber2)
        val tvResult=findViewById<TextView>(R.id.tvResults)


        btnAdd.setOnClickListener {
            var number=etNumber.text.toString().toInt()
            var number2=etNumber2.text.toString().toInt()
            var sum=number+number2
            tvResult.text="$sum"

        }
        btnSubtruct.setOnClickListener {
            var number=etNumber.text.toString().toInt()
            var number2=etNumber2.text.toString().toInt()
            var subtract=number-number2
            tvResult.text="$subtract"
        }
        btnMult.setOnClickListener {
            var number=etNumber.text.toString().toInt()
            var number2=etNumber2.text.toString().toInt()
            var mult=number*number2
            tvResult.text="$mult"
        }
        btnModulus.setOnClickListener {
            var number=etNumber.text.toString().toInt()
            var number2=etNumber2.text.toString().toInt()
            var modulus=number%number2
            tvResult.text="$modulus"
        }


        }
    }
