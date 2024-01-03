package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class Recycler_View_Adapter(val itemList: ArrayList<Model>) : RecyclerView.Adapter<Recycler_View_Adapter.ModelViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModelViewHolder {
       val v = LayoutInflater.from(parent.context).inflate(R.layout.row_items,parent,false)
        return ModelViewHolder(v)
    }

    override fun onBindViewHolder(holder: ModelViewHolder, position: Int) {
        holder.ItemImage.setImageResource(itemList[position].image)
        holder.ItemText.setText(itemList[position].description)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
    inner class ModelViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var ConstraintLayt : ConstraintLayout
        var ItemImage : ImageView
        var ItemText : TextView


        init {
            ConstraintLayt=itemView.findViewById(R.id.constraint_layout_recycler_view) as ConstraintLayout
            ItemImage = itemView.findViewById(R.id.image_view_recycler_view) as ImageView
            ItemText = itemView.findViewById(R.id.text_view_recycler_view) as TextView
        }

    }

}