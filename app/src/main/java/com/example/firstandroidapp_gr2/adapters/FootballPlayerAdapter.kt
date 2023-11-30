package com.example.firstandroidapp_gr2.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.firstandroidapp_gr2.model.FootballPlayer

class FootballPlayerAdapter(private val context : Context ,private val list : List<FootballPlayer>) : BaseAdapter() {

    val layoutInflater : LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount() = list.size

    override fun getItem(position: Int) = list[position]

    override fun getItemId(position: Int) = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

    }
}