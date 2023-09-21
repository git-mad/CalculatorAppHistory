package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var textView:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val plus = findViewById<Button>(R.id.btnAdd);
        val minus = findViewById<Button>(R.id.btnSub);

        textView = findViewById<TextView>(R.id.textView);

        val num1 = findViewById<EditText>(R.id.etNum1);
        val num2 = findViewById<EditText>(R.id.etNum2);
        val history = findViewById<Button>(R.id.btnHistory)

        plus.setOnClickListener {
            var result = num1.text.toString().toDouble() + num2.text.toString().toDouble()
            textView.setText(result.toString())
        }

        minus.setOnClickListener {
            var result = num1.text.toString().toDouble() - num2.text.toString().toDouble()
            textView.setText(result.toString())
        }

        history.setOnClickListener{
            Toast.makeText(this, "Implement History", Toast.LENGTH_SHORT).show()
        }

    }

}