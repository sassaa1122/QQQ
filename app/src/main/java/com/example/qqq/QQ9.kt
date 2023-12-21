package com.example.qqq

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class QQ9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qq9)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("sc", 0)

        val i1: Button =findViewById(R.id.i2)
        val i2: Button =findViewById(R.id.i2)
        val i3: Button =findViewById(R.id.i3)
        val i4: Button =findViewById(R.id.i4)

        i1.setOnClickListener {

            val intent = Intent(this, QQ10::class.java)
            intent.putExtra("sc",numrand+1)
            startActivity(intent)
        }

        i2.setOnClickListener {
            val intent = Intent(this, QQ10::class.java)
            intent.putExtra("sc",numrand)
            startActivity(intent)
        }

        i3.setOnClickListener {
            val intent = Intent(this, QQ10::class.java)
            intent.putExtra("sc",numrand)
            startActivity(intent)
        }
        i4.setOnClickListener {
            val intent = Intent(this, QQ10::class.java)
            intent.putExtra("sc",numrand)
            startActivity(intent)
        }
    }
}