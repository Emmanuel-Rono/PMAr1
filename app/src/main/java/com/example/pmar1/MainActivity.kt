package com.example.pmar1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var   recycleriew:RecyclerView
    lateinit var itemslist:ArrayList<items>
    lateinit var   itemsadpter:itemsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycleriew=findViewById(R.id.ReyclerView)
        recycleriew.setHasFixedSize(true)
        recycleriew.layoutManager=LinearLayoutManager(this)
        //the data
        itemslist= ArrayList()
        itemslist.add(items(R.drawable.im6, "Emmanuel"))
        itemslist.add(items(R.drawable.im6, "Emmanuel"))
        itemslist.add(items(R.drawable.im6, "Emmanuel"))
        itemslist.add(items(R.drawable.im6, "Emmanuel"))
        itemsadpter=itemsAdapter(itemslist)//Pass the data to Adapter class
        recycleriew.adapter=itemsadpter //set the Adapter.

    }
}
