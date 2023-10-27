package com.example.myfirstapp

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var catsList: RecyclerView

    private val dataSet: List<ItemData> = listOf(
        ItemData( "Cat first", R.drawable.cat_first),
        ItemData( "Cat second", R.drawable.cat_second),
        ItemData( "Cat third", R.drawable.cat_third),
        ItemData( "Cat 4", R.drawable.cat_4),
        ItemData( "Cat 5", R.drawable.cat_5),
        ItemData( "Cat first", R.drawable.cat_first),
        ItemData( "Cat second", R.drawable.cat_second),
        ItemData( "Cat third", R.drawable.cat_third),
        ItemData( "Cat 4", R.drawable.cat_4),
        ItemData( "Cat 5", R.drawable.cat_5),
        ItemData( "Cat first", R.drawable.cat_first),
        ItemData( "Cat second", R.drawable.cat_second),
        ItemData( "Cat third", R.drawable.cat_third),
        ItemData( "Cat 4", R.drawable.cat_4),
        ItemData( "Cat 5", R.drawable.cat_5),
        ItemData( "Cat first", R.drawable.cat_first),
        ItemData( "Cat second", R.drawable.cat_second),
        ItemData( "Cat third", R.drawable.cat_third),
        ItemData( "Cat 4", R.drawable.cat_4),
        ItemData( "Cat 5", R.drawable.cat_5),
        ItemData( "Cat first", R.drawable.cat_first),
        ItemData( "Cat second", R.drawable.cat_second),
        ItemData( "Cat third", R.drawable.cat_third),
        ItemData( "Cat 4", R.drawable.cat_4),
        ItemData( "Cat 5", R.drawable.cat_5),
        ItemData( "Cat first", R.drawable.cat_first),
        ItemData( "Cat second", R.drawable.cat_second),
        ItemData( "Cat third", R.drawable.cat_third),
        ItemData( "Cat 4", R.drawable.cat_4),
        ItemData( "Cat 5", R.drawable.cat_5),
        ItemData( "Cat first", R.drawable.cat_first),
        ItemData( "Cat second", R.drawable.cat_second),
        ItemData( "Cat third", R.drawable.cat_third),
        ItemData( "Cat 4", R.drawable.cat_4),
        ItemData( "Cat 5", R.drawable.cat_5),
        ItemData( "Cat first", R.drawable.cat_first),
        ItemData( "Cat second", R.drawable.cat_second),
        ItemData( "Cat third", R.drawable.cat_third),
        ItemData( "Cat 4", R.drawable.cat_4),
        ItemData( "Cat 5", R.drawable.cat_5),
        ItemData( "Cat first", R.drawable.cat_first),
        ItemData( "Cat second", R.drawable.cat_second),
        ItemData( "Cat third", R.drawable.cat_third),
        ItemData( "Cat 4", R.drawable.cat_4),
        ItemData( "Cat 5", R.drawable.cat_5),
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)
        catsList = findViewById(R.id.catsList)
        catsList.layoutManager = LinearLayoutManager(this)
        val adapter = CustomAdapter(
//            this,
            dataSet)
        catsList.adapter = adapter
    }





}