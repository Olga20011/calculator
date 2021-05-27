package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnPlus = findViewById<Button>(R.id.btnPlus)
        var btnMinus = findViewById<Button>(R.id.btnMinus)
        var btnProduct = findViewById<Button>(R.id.btnProduct)
        var btnDivide = findViewById<Button>(R.id.btnDivide)
        var etNumber1 = findViewById<EditText>(R.id.etNumber1)
        var etNumber2 = findViewById<EditText>(R.id.etNumber2)
        var tvAnswer = findViewById<TextView>(R.id.tvAnswer)


        btnPlus.setOnClickListener {
            if (etNumber1.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()
            } else if (etNumber2.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()
            } else {
                var number1 = etNumber1.text.toString().toInt()
                var number2 = etNumber2.text.toString().toInt()
                var addition = number1 + number2
                tvAnswer.text = "Ans: ${addition}"
            }

        }

        btnMinus.setOnClickListener {
            if (etNumber1.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()
            } else if (etNumber2.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()
            } else {
                var number1 = etNumber1.text.toString().toInt()
                var number2 = etNumber2.text.toString().toInt()
                var subtraction = number1 - number2
                tvAnswer.text = "Ans: ${subtraction}"
            }

        }

        btnProduct.setOnClickListener {
            if (etNumber1.text.toString() == "") {
            Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()
            } else if (etNumber2.text.toString() == "") {
            Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()
            } else {
                 var number1 = etNumber1.text.toString().toInt()
                 var number2 = etNumber2.text.toString().toInt()
                 var multiply = number1 * number2
                 tvAnswer.text = "Ans: ${multiply}"
        }

    }
    btnDivide.setOnClickListener {
        if(etNumber1.text.toString() == ""){
        Toast.makeText(baseContext,"Enter a number",Toast.LENGTH_LONG).show()
        }else if (etNumber2.text.toString() == ""){
        Toast.makeText(baseContext ,"Enter a number", Toast.LENGTH_LONG).show()
        }else{
           var number1=etNumber1.text.toString().toInt()
           var number2=etNumber2.text.toString().toInt()
           var remainder=number1%number2
           tvAnswer.text="Ans: ${remainder}"
    }

}
    }
    }

