package com.example.bmi_calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_under_weight.*

class UnderWeight : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_under_weight)

            monbtn.setOnClickListener(){
            val intent= Intent(this,MonDietUW::class.java)
            startActivity(intent)
        }

        tuebtn.setOnClickListener(){
            val intent= Intent(this,TueDietUW::class.java)
            startActivity(intent)
        }

        wedbtn.setOnClickListener(){
            val intent= Intent(this,WedDietUW::class.java)
            startActivity(intent)
        }

        thubtn.setOnClickListener(){
            val intent= Intent(this,ThuDietUW::class.java)
            startActivity(intent)
        }

        fribtn.setOnClickListener(){
            val intent= Intent(this,FriDietUW::class.java)
            startActivity(intent)
        }

        satbtn.setOnClickListener(){
            val intent= Intent(this,SatDietUW::class.java)
            startActivity(intent)
        }

        sunbtn.setOnClickListener(){
            val intent= Intent(this,SunDietUW::class.java)
            startActivity(intent)
        }

    }
}