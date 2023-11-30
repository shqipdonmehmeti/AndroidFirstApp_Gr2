package com.example.firstandroidapp_gr2.layout_activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.firstandroidapp_gr2.R

class FootballPlayerDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_football_player_details)
        val ivFootballPlayerPhoto = findViewById<ImageView>(R.id.ivFootballPlayerPhotoDetails)
        val tvFootballPlayerDesc : TextView = findViewById(R.id.tvFootballPlayerDescriptionDetails)

        val photoValue = intent.getIntExtra("photo",0)
        val descValue = intent.getStringExtra("desc")

        ivFootballPlayerPhoto.setImageResource(photoValue)
        tvFootballPlayerDesc.text = descValue
    }
}