package com.example.bmi_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TueDietOW : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tue_diet_o_w)

        val actionBar=supportActionBar

        actionBar!!.title="Tuesday Diet"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}