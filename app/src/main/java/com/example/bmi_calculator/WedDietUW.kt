package com.example.bmi_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class WedDietUW : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wed_diet_u_w)
        val actionBar=supportActionBar

        actionBar!!.title="Wednusday Diet"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}