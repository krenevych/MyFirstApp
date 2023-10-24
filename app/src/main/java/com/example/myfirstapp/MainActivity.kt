package com.example.myfirstapp

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var cat1: CheckBox
    private lateinit var cat2: CheckBox
    private lateinit var cat3: CheckBox

    private val images = listOf(
        R.drawable.cat_first,
        R.drawable.cat_second,
        R.drawable.cat_third,
    )
    private var curImageIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById<ImageView?>(R.id.imageView).apply {
            visibility = View.INVISIBLE
        }
        cat1 = findViewById(R.id.checkBoxCat1)
        cat2 = findViewById(R.id.checkBoxCat2)
        cat3 = findViewById(R.id.checkBoxCat3)

        cat1.setOnClickListener {
            if (cat1.isChecked){
                imageView.visibility = View.VISIBLE
                imageView.setImageResource(images[0])

                cat2.isChecked = false
                cat3.isChecked = false
            }else {
                imageView.visibility = View.INVISIBLE
            }
        }

        cat2.setOnClickListener {
            if (cat2.isChecked){
                with(imageView){
                    setImageResource(images[1])
                    visibility = View.VISIBLE
                }
                cat1.isChecked = false
                cat3.isChecked = false
            } else {
                imageView.visibility = View.INVISIBLE
            }
        }

        cat3.setOnClickListener {
            if (cat3.isChecked){
                with(imageView){
                    setImageResource(images[2])
                    visibility = View.VISIBLE
                }
                cat1.isChecked = false
                cat2.isChecked = false
            }else {
                imageView.visibility = View.INVISIBLE
            }
        }

    }

}