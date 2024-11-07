package com.example.myfirstapp

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.myfirstapp.databinding.CatItemBinding

class CustomAdapter(
//    private val context: Context,
    private val dataSet: List<ItemData>,
) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder)
     */
    class ViewHolder(binding: CatItemBinding) : RecyclerView.ViewHolder(binding.root) {

        val imageViewCat: ImageView = binding.imageViewCat
        val textViewCat: TextView = binding.nameCat
        val catCardView: CardView = binding.catCardView
        val id = curId++

        init {
            Log.d("XXXXX", "ViewHolder id = $id")
        }
    }

    companion object {
        var curId = 0
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val binding: CatItemBinding = CatItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount() = dataSet.size

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        holder.imageViewCat.setImageResource(dataSet[position].resId)
        holder.textViewCat.text = dataSet[position].name
//        holder.catCardView.setOnClickListener{
//            Toast.makeText(holder.catCardView.context, dataSet[position].name, Toast.LENGTH_SHORT).show()
//        }
//        holder.catCardView.setOnClickListener(clickListener)
        holder.catCardView.setOnClickListener {
            clickListener?.onClick(holder.catCardView, dataSet[position])
        }

        Log.d("XXXXX", "onBindViewHolder (${holder.id})")
    }

//    var clickListener: View.OnClickListener? = null

    fun interface CatItemClickListener {
        fun onClick(view: View?, itemData: ItemData)
    }

    var clickListener: CatItemClickListener? = null

}
