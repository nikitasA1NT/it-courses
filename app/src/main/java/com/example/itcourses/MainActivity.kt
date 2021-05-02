package com.example.itcourses

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.itcourses.calculator.ui.CalculatorActivity

class MainActivity : AppCompatActivity() {

    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        setListeners()
    }

    private fun initViews() {
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
    }

    private fun setListeners() {
        button1.setOnClickListener {
            val intent = Intent(this, CalculatorActivity::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            Toast.makeText(this, "Button 1", Toast.LENGTH_SHORT).show()
        }

        button3.setOnClickListener {
            Toast.makeText(this, "Button 2", Toast.LENGTH_SHORT).show()
        }
    }
}
