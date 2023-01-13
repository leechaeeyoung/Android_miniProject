package com.example.listview_ex

import ListViewAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list_Item = mutableListOf<ListViewModel>()
        list_Item.add(ListViewModel("a","b"))
        list_Item.add(ListViewModel("b","c"))
        list_Item.add(ListViewModel("d","e"))

        val listView = findViewById<ListView>(R.id.mainListView)
        val adapter = ListViewAdapter(list_Item)

        listView.adapter = adapter


    }
}