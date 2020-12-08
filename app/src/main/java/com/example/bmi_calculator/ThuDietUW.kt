package com.example.bmi_calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_under_weight.*

class ThuDietUW : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thu_diet_u_w)

        val actionBar=supportActionBar

        actionBar!!.title="Thusday Diet"

        actionBar.setDisplayHomeAsUpEnabled(true)

    }
}