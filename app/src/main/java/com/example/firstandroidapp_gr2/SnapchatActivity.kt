package com.example.firstandroidapp_gr2

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class SnapchatActivity : AppCompatActivity() {
    private lateinit var btnLogin: AppCompatButton
    private lateinit var btnSignup: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snapchat)
        findViews()
        onButtonClicks()

    }

    private fun onButtonClicks() {
        btnLogin.setOnClickListener {
            Toast.makeText(this, "Login was clicked", Toast.LENGTH_LONG).show()
        }
        btnSignup.setOnClickListener {
            Toast.makeText(this, "Sign up was clicked", Toast.LENGTH_LONG).show()
        }
    }

    private fun findViews() {
        btnLogin = findViewById(R.id.btnSnapLogin)
        btnSignup = findViewById(R.id.btnSnapSignUp)
    }
}