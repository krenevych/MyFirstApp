package com.example.myfirstapp

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
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
        val adapter = CustomAdapter(dataSet).apply {
            clickListener =
                CustomAdapter.CatItemClickListener { view, itemData ->
                    Toast.makeText(this@MainActivity, itemData.name, Toast.LENGTH_SHORT).show()
                    imageView.setImageResource(itemData.resId)
                }
        }

        catsList.adapter = adapter

    }





}