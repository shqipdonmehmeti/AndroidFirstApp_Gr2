package com.example.firstandroidapp_gr2.social_network_activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import com.example.firstandroidapp_gr2.R
import com.google.android.material.textfield.TextInputLayout

class InstagramActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instagram)
        val btnSignIn : AppCompatButton = findViewById(R.id.btnSignIn)
        val etUsername : TextInputLayout = findViewById(R.id.username)
        val etPassword : TextInputLayout = findViewById(R.id.password)
        btnSignIn.setOnClickListener {
            val usernameValue = etUsername.editText?.text.toString()
            val passwordValue = etPassword.editText?.text.toString()
            if (usernameValue.isNullOrEmpty() || passwordValue.isNullOrEmpty()) {
                Toast.makeText(this,"Invalid login",Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this,"Valid login",Toast.LENGTH_LONG).show()
            }

        }
    }
}