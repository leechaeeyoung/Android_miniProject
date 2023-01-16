package com.example.listview_ex

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListViewAdapter(val List: MutableList<ListViewModel>): BaseAdapter() {
    override fun getCount(): Int {
        return List.size
    }

    override fun getItem(p0: Int): Any {
        return List[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var convertview = p1

        if(convertview == null){
            convertview = LayoutInflater.from(p2?.context).inflate(R.layout.listview_item, p2, false)
        }

        val title = convertview!!.findViewById<TextView>(R.id.listView_item)
        val title2 = convertview.findViewById<TextView>(R.id.listView_item2)
        title.text = List[p0].text1
        title2.text = List[p0].text2

        return convertview
    }
}