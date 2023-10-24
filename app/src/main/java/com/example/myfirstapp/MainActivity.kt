package com.example.myfirstapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var button1: Button
    private lateinit var imageView: ImageView
    private val images = listOf(
        R.drawable.cat_first,
        R.drawable.cat_second,
        R.drawable.cat_third,
    )
    private var curImageIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1 = findViewById(R.id.button1)
        imageView = findViewById(R.id.imageView)
        button1.setOnClickListener {
            curImageIndex = (curImageIndex + 1) % images.size
            val imageRes = images[curImageIndex]
            imageView.setImageResource(imageRes)
        }
    }

}