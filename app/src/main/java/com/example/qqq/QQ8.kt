package com.example.qqq

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class QQ8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qq8)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("sc", 0)

        val h1: Button =findViewById(R.id.h1)
        val h2: Button =findViewById(R.id.h2)
        val h3: Button =findViewById(R.id.h3)
        val h4: Button =findViewById(R.id.h4)

        h1.setOnClickListener {

            val intent = Intent(this, QQ9::class.java)
            intent.putExtra("sc",numrand)
            startActivity(intent)
        }

        h2.setOnClickListener {
            val intent = Intent(this, QQ9::class.java)
            intent.putExtra("sc",numrand)
            startActivity(intent)
        }

        h3.setOnClickListener {
            val intent = Intent(this, QQ9::class.java)
            intent.putExtra("sc",numrand)
            startActivity(intent)
        }
        h4.setOnClickListener {
            val intent = Intent(this, QQ9::class.java)
            intent.putExtra("sc",numrand+1)
            startActivity(intent)
        }
    }
}