package com.example.firstandroidapp_gr2.layout_activities

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.firstandroidapp_gr2.R
import com.example.firstandroidapp_gr2.adapters.FootballPlayerAdapter
import com.example.firstandroidapp_gr2.model.FootballPlayer

class ComplexListViewActivity : AppCompatActivity() {
    private lateinit var complexListView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_complex_list_view)
        complexListView = findViewById(R.id.lvComplex)
        val listOfFootballPlayer = listOf(
            FootballPlayer(R.drawable.messi, "Lionel", "Messi", 36,"8 times ballon d'or winner"),
            FootballPlayer(R.drawable.ronaldo, "Cristiano", "Ronaldo", 38, "5 times ballon d'or winner"),
            FootballPlayer(R.drawable.mbappe, "Kylian", "Mbappe", 24, "world cup winner"),
            FootballPlayer(R.drawable.neymar, "Neymar", "Da silva", 31, "fast runner"),
            FootballPlayer(R.drawable.zhegrova, "Edon", "Zhegrova", 24 , "luan ipko superliga")
        )
        val footballPlayerAdapter = FootballPlayerAdapter(this,listOfFootballPlayer)
        complexListView.adapter = footballPlayerAdapter

        complexListView.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this@ComplexListViewActivity,FootballPlayerDetailsActivity::class.java)
            intent.putExtra("photo",listOfFootballPlayer[position].photo)
            intent.putExtra("desc",listOfFootballPlayer[position].description)
            startActivity(intent)
//            Toast.makeText(this,"Player that was clicked is ${listOfFootballPlayer[position].firstName}",Toast.LENGTH_LONG).show()
        }
    }
}





