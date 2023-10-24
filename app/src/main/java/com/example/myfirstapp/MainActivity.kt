package com.example.myfirstapp

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener {

    private lateinit var imageView: ImageView
    private lateinit var catsList: ListView

    private val images = listOf(
        R.drawable.cat_first,
        R.drawable.cat_second,
        R.drawable.cat_third,
        R.drawable.cat_4,
        R.drawable.cat_5,
        R.drawable.cat_first,
        R.drawable.cat_second,
        R.drawable.cat_third,
        R.drawable.cat_4,
        R.drawable.cat_5,
        R.drawable.cat_first,
        R.drawable.cat_second,
        R.drawable.cat_third,
        R.drawable.cat_4,
        R.drawable.cat_5,
        R.drawable.cat_first,
        R.drawable.cat_second,
        R.drawable.cat_third,
        R.drawable.cat_4,
        R.drawable.cat_5,
        R.drawable.cat_first,
        R.drawable.cat_second,
        R.drawable.cat_third,
        R.drawable.cat_4,
        R.drawable.cat_5,
        R.drawable.cat_first,
        R.drawable.cat_second,
        R.drawable.cat_third,
        R.drawable.cat_4,
        R.drawable.cat_5,
    )

    private val listItems = listOf(
        "Cat first",
        "Cat second",
        "Cat third",
        "Cat 4",
        "Cat 5",
        "Cat first",
        "Cat second",
        "Cat third",
        "Cat 4",
        "Cat 5",
        "Cat first",
        "Cat second",
        "Cat third",
        "Cat 4",
        "Cat 5",
        "Cat first",
        "Cat second",
        "Cat third",
        "Cat 4",
        "Cat 5",
        "Cat first",
        "Cat second",
        "Cat third",
        "Cat 4",
        "Cat 5",
        "Cat first",
        "Cat second",
        "Cat third",
        "Cat 4",
        "Cat 5",
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)

        catsList = findViewById(R.id.catsList)
        val adapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            listItems)
        catsList.adapter = adapter
        catsList.onItemClickListener = this

    }


    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val item = parent?.getItemAtPosition(position)
        if (item != null) {
            imageView.setImageResource(images[position])
        }
        Toast.makeText(this, "Selected item $item", Toast.LENGTH_SHORT).show()
    }


}