package com.example.firstandroidapp_gr2

import android.os.Bundle
import android.widget.DatePicker
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputLayout

class TwitchActivity : AppCompatActivity() {
    private lateinit var txtInputLayoutPassword: TextInputLayout
    private lateinit var datePicker: DatePicker
    private lateinit var btnSignup: MaterialButton
    private lateinit var tvShowAllData: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_twitch)
        findViews()
        onClick()
    }

    private fun onClick() {
        btnSignup.setOnClickListener {
            val etPasswordValue = txtInputLayoutPassword.editText?.text.toString()
            val month = datePicker.month
            val year = datePicker.year
            val day = datePicker.dayOfMonth

            tvShowAllData.text = "Password value is $etPasswordValue, date :$year- $month - $day "

        }
    }

    private fun findViews() {
        txtInputLayoutPassword = findViewById(R.id.txtInputLayoutPassword)
        datePicker = findViewById(R.id.datePicker)
        btnSignup = findViewById(R.id.btnTwitchSignUp)
        tvShowAllData = findViewById(R.id.tvShowAllData)
    }
}