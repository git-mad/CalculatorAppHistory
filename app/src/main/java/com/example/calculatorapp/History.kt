package com.example.calculatorapp

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView

class History : AppCompatActivity() {
    private lateinit var tvHistory:TextView
    private  lateinit var btBack: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)
        btBack = findViewById(R.id.btnBack)
        tvHistory = findViewById(R.id.tvHistory)

        btBack.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
        val item = intent.getStringExtra("RESULT")

        tvHistory.setText(item)
    }
}