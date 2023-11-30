package com.example.firstandroidapp_gr2.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.firstandroidapp_gr2.R
import com.example.firstandroidapp_gr2.model.FootballPlayer

class FootballPlayerAdapter(private val context : Context ,private val list : List<FootballPlayer>) : BaseAdapter() {

    val layoutInflater : LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount() = list.size

    override fun getItem(position: Int) = list[position]

    override fun getItemId(position: Int) = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val rowView = layoutInflater.inflate(R.layout.complex_listview_item,parent,false)

        val ivPhoto = rowView.findViewById<ImageView>(R.id.ivFootballPlayerPhoto)
        val tvFirstName = rowView.findViewById<TextView>(R.id.tvFootballPlayerFirstName)
        val tvLastName = rowView.findViewById<TextView>(R.id.tvFootballPlayerLastName)
        val tvAge = rowView.findViewById<TextView>(R.id.tvFootballPlayerAge)

        ivPhoto.setImageResource(list[position].photo)
        tvFirstName.text = list[position].firstName
        tvLastName.text = list[position].lastName
        tvAge.text = list[position].age.toString()

        return rowView
    }
}









