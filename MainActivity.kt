package com.test.toastapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et: EditText =findViewById(R.id.et)
        val btnStart: Button = findViewById(R.id.btnStart)

        btnStart.setOnClickListener {
            if(et.text.toString()==("")){

                Toast.makeText(this,"入力してください",Toast.LENGTH_LONG).show()

            }else{
                val intent = Intent(this,MA2::class.java)

                intent.putExtra("MY_NAME",et.text.toString())

                startActivity(intent)
            }


        }
    }
}