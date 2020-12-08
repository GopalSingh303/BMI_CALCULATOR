package com.example.bmi_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SatDietOW : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sat_diet_o_w)

        val actionBar=supportActionBar

        actionBar!!.title="Saturday Diet"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}