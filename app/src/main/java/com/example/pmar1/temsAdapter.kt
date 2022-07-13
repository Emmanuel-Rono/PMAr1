package com.example.pmar1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.AdapterListUpdateCallback
import androidx.recyclerview.widget.RecyclerView

class itemsAdapter(private val itemslist:ArrayList<items> ):
    RecyclerView.Adapter<itemsAdapter.ItemsViewHolder>()
//Adapter gets data and render it to a recyclerviews
//The viewholder creates and holds the view.


{
    class ItemsViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView)
    {
        //view holder creates the views
        //views designed #itemslayout
        val Image:ImageView=itemView.findViewById(R.id.imageView)
        val Text:TextView=itemView.findViewById(R.id.textView)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemsViewHolder
    {

//set the layout.
        //val view=LayoutInflater.from(parent.context).inflate(R.layout.items_layout,parent,false  )
        val  view=LayoutInflater.from(parent.context).inflate(R.layout.items_layout,parent,false)
        return ItemsViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemsViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
       //return the size of data
        return itemslist.size
    }

}