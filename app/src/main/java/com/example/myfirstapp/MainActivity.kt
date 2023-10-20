package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var textView: TextView



    private inner class CustomOnClickListener : View.OnClickListener {
        override fun onClick(view: View?) {
            view?.let {
                if (it is Button) {
                    val toast = Toast.makeText(this@MainActivity, it.text.toString(), Toast.LENGTH_SHORT)
                    toast.show()
                }
                if (it is TextView) {
                    val toast = Toast.makeText(this@MainActivity, it.text.toString(), Toast.LENGTH_SHORT)
                    toast.show()
                }
            }
        }
    }

    private val clickListener: View.OnClickListener = CustomOnClickListener()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        textView = findViewById(R.id.textView1)

        button1.setOnClickListener(clickListener)
        button2.setOnClickListener(clickListener)
        textView.setOnClickListener(clickListener)

    }
}