package com.example.calculatorapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textView:TextView
    private var historyList = mutableListOf<Double>()

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
            historyList.add(result)
        }

        minus.setOnClickListener {
            var result = num1.text.toString().toDouble() - num2.text.toString().toDouble()
            textView.setText(result.toString())
            historyList.add(result)
        }

        history.setOnClickListener{
            val intent = Intent(this, History::class.java)
            intent.putExtra("RESULT", historyList.toString())
            startActivity(intent)
        }

    }

}