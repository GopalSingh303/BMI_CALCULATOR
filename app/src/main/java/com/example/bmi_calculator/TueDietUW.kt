package com.example.bmi_calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_under_weight.*

class TueDietUW : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tue_diet_u_w)

        val actionBar=supportActionBar

        actionBar!!.title="Tuesday Diet"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}