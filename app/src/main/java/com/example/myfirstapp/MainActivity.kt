package com.example.myfirstapp

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), OnClickListener {

    private lateinit var imageView: ImageView
    private lateinit var cat1: RadioButton
    private lateinit var cat2: RadioButton
    private lateinit var cat3: RadioButton

    private val images = listOf(
        R.drawable.cat_first,
        R.drawable.cat_second,
        R.drawable.cat_third,
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)
        cat1 = findViewById(R.id.cat1)
        cat2 = findViewById(R.id.cat2)
        cat3 = findViewById(R.id.cat3)

        cat1.setOnClickListener(this)
        cat2.setOnClickListener(this)
        cat3.setOnClickListener(this)


    }

    override fun onClick(p0: View?) {
        when {
            cat1.isChecked -> imageView.setImageResource(images[0])
            cat2.isChecked -> imageView.setImageResource(images[1])
            cat3.isChecked -> imageView.setImageResource(images[2])
        }
    }

}