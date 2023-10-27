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

class CustomAdapter(
//    private val context: Context,
                    private val dataSet: List<ItemData>,
):
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder)
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageViewCat: ImageView = view.findViewById(R.id.imageViewCat)
        val textViewCat: TextView = view.findViewById(R.id.nameCat)
        val catCardView: CardView = view.findViewById(R.id.catCardView)
        val id = curId++

        init {
            Log.d("XXXXX", "ViewHolder id = $id")
        }
    }

    companion object {
        var curId = 0
    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.cat_item, parent, false)

        Log.d("XXXXX", "onCreateViewHolder")

        return ViewHolder(view)
    }

    override fun getItemCount() = dataSet.size

    override fun onBindViewHolder(holder: ViewHolder,
                                  position: Int) {
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
