package com.example.bmi_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SunDietOW : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sun_diet_o_w)

        val actionBar=supportActionBar

        actionBar!!.title="Sunday Diet"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}