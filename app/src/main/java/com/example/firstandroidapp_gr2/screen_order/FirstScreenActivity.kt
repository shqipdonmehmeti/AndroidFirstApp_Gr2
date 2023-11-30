package com.example.firstandroidapp_gr2.screen_order

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.widget.AppCompatButton
import com.example.firstandroidapp_gr2.R

class FirstScreenActivity : AppCompatActivity() {
    private lateinit var etInput : EditText
    private lateinit var btnGoToNextScreen : AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_screen)
        findViews()
        onClick()
    }

    private fun onClick() {
        btnGoToNextScreen.setOnClickListener {
            val etValue = etInput.text.toString()
            val intent = Intent(this@FirstScreenActivity,SecondScreenActivity::class.java)
            intent.putExtra("firstName",etValue)
            startActivity(intent)
        }
    }

    private fun findViews() {
        etInput = findViewById(R.id.etInput)
        btnGoToNextScreen = findViewById(R.id.btnGoToNextScreen)
    }
}








