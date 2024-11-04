package com.example.myfirstapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myfirstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val dataSet: List<ItemData> = listOf(
        ItemData( "Cat first", R.drawable.cat_first),
        ItemData( "Cat second", R.drawable.cat_second),
        ItemData( "Cat third", R.drawable.cat_third),
        ItemData( "Cat 4", R.drawable.cat_4),
        ItemData( "Cat 5", R.drawable.cat_5),
        ItemData( "Cat 29", R.drawable.cat_2934720_640),
        ItemData( "Cat 30", R.drawable.cat_300572_640),
        ItemData( "Cat 31", R.drawable.cat_3169476_640),
        ItemData( "Cat 70", R.drawable.cat_7094808_640),
        ItemData( "Cat 81", R.drawable.cat_8157889_640),
        ItemData( "Cat 819", R.drawable.cat_8197577_640),
        ItemData( "Cat 84", R.drawable.cat_8436848_640),
        ItemData( "Cats", R.drawable.cats),
        ItemData( "Maine coon", R.drawable.cat_maine_coon_694730_640),
        ItemData( "Gpt 01", R.drawable.gpt_01),
        ItemData( "Gpt 02", R.drawable.gpt_02),
        ItemData( "Gpt 03", R.drawable.gpt_03),
        ItemData( "Gpt 04", R.drawable.gpt_04),
        ItemData( "Gpt 05", R.drawable.gpt_05),
        ItemData( "Gpt 06", R.drawable.gpt_06),
        ItemData( "Gpt 07", R.drawable.gpt_07),
        ItemData( "Gpt 08", R.drawable.gpt_08),
        ItemData( "Gpt 09", R.drawable.gpt_09),
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.catsList.layoutManager = LinearLayoutManager(this)
        val adapter = CustomAdapter(dataSet).apply {
            clickListener =
                CustomAdapter.CatItemClickListener { view, itemData ->
                    Toast.makeText(this@MainActivity, itemData.name, Toast.LENGTH_SHORT).show()
                    binding.imageView.setImageResource(itemData.resId)
                }
        }

        binding.catsList.adapter = adapter

    }

}