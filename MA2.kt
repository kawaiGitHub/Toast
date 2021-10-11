package com.test.toastapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MA2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ma2)

        val tvName : TextView = findViewById(R.id.tvName)
        val btnBack: Button = findViewById(R.id.btnBack)

        val myName =intent.getStringExtra("MY_NAME")
        tvName.text =myName + "さん"

        btnBack.setOnClickListener{
            finish()
        }
    }
}