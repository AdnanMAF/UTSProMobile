package com.example.myapplication.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.myapplication.R
import com.example.myapplication.data.DataItem

class ItemAdapter(
    private val context: Activity,
    private val arrayList: ArrayList<DataItem>
) : ArrayAdapter<DataItem>(context, R.layout.list_item, arrayList) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater : LayoutInflater = LayoutInflater.from(context)
        val view : View = inflater.inflate(R.layout.list_item, null)

        val imageView : ImageView = view.findViewById(R.id.ProductImage)
        val name : TextView = view.findViewById(R.id.ProductName)
        val price : TextView = view.findViewById(R.id.ProductPrice)

        imageView.setImageResource(arrayList[position].imageId)
        name.text = arrayList[position].name
        price.text = arrayList[position].price

        return view
    }
}