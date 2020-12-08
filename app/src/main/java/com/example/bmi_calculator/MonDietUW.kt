package com.example.bmi_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MonDietUW : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mon_diet_u_w)

        val actionBar=supportActionBar

        actionBar!!.title="Monday Diet"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}