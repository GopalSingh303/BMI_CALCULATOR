package com.example.bmi_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FriDietOW : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fri_diet_o_w)

        val actionBar=supportActionBar

        actionBar!!.title="Friday Diet"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}