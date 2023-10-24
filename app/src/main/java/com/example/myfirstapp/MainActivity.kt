package com.example.myfirstapp

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    private lateinit var imageView: ImageView
//    https://developer.android.com/develop/ui/views/components/spinner
    private lateinit var spinner: Spinner


    private val images = listOf(
        R.drawable.cat_first,
        R.drawable.cat_second,
        R.drawable.cat_third,
        R.drawable.cat_4,
        R.drawable.cat_5,
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)
        spinner = findViewById(R.id.catSpinner)
        val spinnerAdapter = ArrayAdapter.createFromResource(
            this,
            R.array.cats,
            android.R.layout.simple_spinner_item
        )
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = spinnerAdapter
        spinner.onItemSelectedListener = this
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
//        val item = parent?.adapter?.getItem(position)
        val item = parent?.getItemAtPosition(position)
        Log.d("XXXX", "selected $item")
        if (item != null){
            imageView.setImageResource(images[position])
        }
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
    }


}