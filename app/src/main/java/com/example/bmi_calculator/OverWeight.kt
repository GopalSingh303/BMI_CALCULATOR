package com.example.bmi_calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_under_weight.*

class OverWeight : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_over_weight)

        monbtn.setOnClickListener(){
            val intent= Intent(this,MonDietOW::class.java)
            startActivity(intent)
        }

        tuebtn.setOnClickListener(){
            val intent= Intent(this,TueDietOW::class.java)
            startActivity(intent)
        }

        wedbtn.setOnClickListener(){
            val intent= Intent(this,WedDietOW::class.java)
            startActivity(intent)
        }

        thubtn.setOnClickListener(){
            val intent= Intent(this,ThuDietOW::class.java)
            startActivity(intent)
        }

        fribtn.setOnClickListener(){
            val intent= Intent(this,FriDietOW::class.java)
            startActivity(intent)
        }

        satbtn.setOnClickListener(){
            val intent= Intent(this,SatDietOW::class.java)
            startActivity(intent)
        }

        sunbtn.setOnClickListener(){
            val intent= Intent(this,SunDietOW::class.java)
            startActivity(intent)
        }
    }
}