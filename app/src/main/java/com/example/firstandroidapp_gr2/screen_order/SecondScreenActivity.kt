package com.example.firstandroidapp_gr2.screen_order

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.firstandroidapp_gr2.R

class SecondScreenActivity : AppCompatActivity() {
    private lateinit var tvShowDataFromFirstScreen : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)
        findViews()
        setDataToTextView()
    }

    private fun setDataToTextView() {
        val data = intent.getStringExtra("firstName")
        tvShowDataFromFirstScreen.text = data
    }

    private fun findViews() {
        tvShowDataFromFirstScreen = findViewById(R.id.tvShowDataFromFirstScreen)
    }
}