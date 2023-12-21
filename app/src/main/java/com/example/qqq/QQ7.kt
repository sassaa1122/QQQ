package com.example.qqq

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class QQ7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qq7)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("sc", 0)

        val g1: Button =findViewById(R.id.g1)
        val g2: Button =findViewById(R.id.g2)
        val g3: Button =findViewById(R.id.g3)
        val g4: Button =findViewById(R.id.g4)

        g1.setOnClickListener {

            val intent = Intent(this, QQ8::class.java)
            intent.putExtra("sc",numrand)
            startActivity(intent)
        }

        g2.setOnClickListener {
            val intent = Intent(this, QQ8::class.java)
            intent.putExtra("sc",numrand)
            startActivity(intent)
        }

        g3.setOnClickListener {
            val intent = Intent(this, QQ8::class.java)
            intent.putExtra("sc",numrand+1)
            startActivity(intent)
        }
        g4.setOnClickListener {
            val intent = Intent(this, QQ8::class.java)
            intent.putExtra("sc",numrand)
            startActivity(intent)
        }
    }
}