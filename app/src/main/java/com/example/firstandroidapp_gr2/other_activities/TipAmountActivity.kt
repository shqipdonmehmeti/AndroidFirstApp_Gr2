package com.example.firstandroidapp_gr2.other_activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.SwitchCompat
import com.example.firstandroidapp_gr2.R
import kotlin.math.ceil

class TipAmountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tip_amount)
        val etCostOfService : EditText = findViewById(R.id.etCostOfService)
        val rgServiceOptions : RadioGroup = findViewById(R.id.rgServiceOptions)
        val swRoundUp : SwitchCompat = findViewById(R.id.swRoundUpTip)
        val btnCalculate : AppCompatButton = findViewById(R.id.btnCalculate)
        val tvTipAmount : TextView = findViewById(R.id.tvTipAmount)

        btnCalculate.setOnClickListener {
            val costOfServiceValue = etCostOfService.text.toString().toDoubleOrNull()
            var result : Double? = 0.0
            result = when (rgServiceOptions.checkedRadioButtonId) {
                R.id.rbAmazing -> {
                    costOfServiceValue?.times(0.20)
                }
                R.id.rbGood -> {
                    costOfServiceValue?.times(0.18)
                }
                R.id.rbOkay -> {
                    costOfServiceValue?.times(0.15)
                }
                else -> 0.0
            }
            if (swRoundUp.isChecked) {
                tvTipAmount.text = "Tip amount after calculation is ${ceil(result ?: 0.0)}"
            }
            else {
                tvTipAmount.text = "Tip amount after calculation is $result"
            }
        }
    }
}