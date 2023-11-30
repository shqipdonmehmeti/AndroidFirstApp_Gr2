package com.example.firstandroidapp_gr2.layout_activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.firstandroidapp_gr2.R

class SimpleListViewActivity : AppCompatActivity() {
    private lateinit var simpleListView : ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_list_view)
        findViews()
        val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,
            listOf("Messi","Ronaldo","Zhegrova","Neymar"))
        simpleListView.adapter = arrayAdapter
    }

    private fun findViews() {
        simpleListView = findViewById(R.id.lvSimple)
    }
}