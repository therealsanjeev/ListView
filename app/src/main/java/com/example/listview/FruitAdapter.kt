package com.example.listview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_fruit_items.view.*

class FruitAdapter(
    val fruits:ArrayList<Fruit>
) : RecyclerView.Adapter<FruitAdapter.FruitViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {

        val itemView=LayoutInflater.from(parent.context).inflate(
            R.layout.list_fruit_items,parent,false
        )
        return FruitViewHolder(itemView)

    }

    override fun getItemCount(): Int = fruits.size

    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {

        holder.itemView.tvFruit.text=fruits[position].name
        holder.itemView.tvOrigin.text=fruits[position].origin
        holder.itemView.tvQuantity.text=fruits[position].quantity.toString()
    }

    class FruitViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
}