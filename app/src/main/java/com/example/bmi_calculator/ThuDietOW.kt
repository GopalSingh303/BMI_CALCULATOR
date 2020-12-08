package com.example.bmi_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ThuDietOW : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thu_diet_o_w)

        val actionBar=supportActionBar

        actionBar!!.title="Thusday Diet"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}