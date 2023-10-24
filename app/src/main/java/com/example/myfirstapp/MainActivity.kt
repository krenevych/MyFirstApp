package com.example.myfirstapp

import android.os.Bundle
import android.util.Log
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var toggleButton: ToggleButton


    private val images = listOf(
        R.drawable.cat_first,
        R.drawable.cat_second,
        R.drawable.cat_third,
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)
        toggleButton = findViewById(R.id.cat_pusher)
//        toggleButton.setOnClickListener{
////            Log.d("XXXX", "toggle state: ${toggleButton.isChecked}")
//            val state = toggleButton.isChecked
//            if (state) {
//                imageView.setImageResource(images[2])
//            } else {
//                imageView.setImageResource(images[0])
//            }
//        }


        toggleButton.setOnCheckedChangeListener { button, state ->
            if (state){
                imageView.setImageResource(images[2])
            } else {
                imageView.setImageResource(images[0])
            }
        }



    }



}