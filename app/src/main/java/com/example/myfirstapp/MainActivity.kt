package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var textView: TextView
    private lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button1)
        textView = findViewById(R.id.textView)
        editText = findViewById(R.id.editTextText)

        button.setOnClickListener {
            val name = editText.text.toString()
            textView.text = "Hello, $name!"
        }

    }
}