package com.example.qqq

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class QQ6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qq6)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("sc", 0)

        val f1: Button =findViewById(R.id.f1)
        val f2: Button =findViewById(R.id.f2)
        val f3: Button =findViewById(R.id.f3)
        val f4: Button =findViewById(R.id.f4)

        f1.setOnClickListener {

            val intent = Intent(this, QQ7::class.java)
            intent.putExtra("sc",numrand)
            startActivity(intent)
        }

        f2.setOnClickListener {
            val intent = Intent(this, QQ7::class.java)
            intent.putExtra("sc",numrand+1)
            startActivity(intent)
        }

        f3.setOnClickListener {
            val intent = Intent(this, QQ7::class.java)
            intent.putExtra("sc",numrand)
            startActivity(intent)
        }
        f4.setOnClickListener {
            val intent = Intent(this, QQ7::class.java)
            intent.putExtra("sc",numrand)
            startActivity(intent)
        }
    }
}