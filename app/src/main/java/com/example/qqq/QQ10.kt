package com.example.qqq

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class QQ10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qq10)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("sc", 0)

        val j1: Button =findViewById(R.id.j1)
        val j2: Button =findViewById(R.id.j2)
        val j3: Button =findViewById(R.id.j3)
        val j4: Button =findViewById(R.id.j4)

        j1.setOnClickListener {

            val intent = Intent(this, Final::class.java)
            intent.putExtra("sc",numrand)
            startActivity(intent)
        }

        j2.setOnClickListener {
            val intent = Intent(this, Final::class.java)
            intent.putExtra("sc",numrand+1)
            startActivity(intent)
        }

        j3.setOnClickListener {
            val intent = Intent(this, Final::class.java)
            intent.putExtra("sc",numrand)
            startActivity(intent)
        }
        j4.setOnClickListener {
            val intent = Intent(this, Final::class.java)
            intent.putExtra("sc",numrand)
            startActivity(intent)
        }
    }
}