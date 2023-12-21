package com.example.qqq

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class QQ3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qq3)


        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("sc", 0)

        val c1: Button =findViewById(R.id.c1)
        val c2: Button =findViewById(R.id.c2)
        val c3: Button =findViewById(R.id.c3)
        val c4: Button =findViewById(R.id.c4)

        c1.setOnClickListener {

            val intent = Intent(this, QQ4::class.java)
            intent.putExtra("sc",numrand)
            startActivity(intent)
        }

        c2.setOnClickListener {
            val intent = Intent(this, QQ4::class.java)
            intent.putExtra("sc",numrand)
            startActivity(intent)
        }

        c3.setOnClickListener {
            val intent = Intent(this, QQ4::class.java)
            intent.putExtra("sc",numrand+1)
            startActivity(intent)
        }
        c4.setOnClickListener {
            val intent = Intent(this, QQ4::class.java)
            intent.putExtra("sc",numrand)
            startActivity(intent)
        }
    }
}