package com.example.unitconverter

import android.annotation.SuppressLint
import android.content.Intent
import android.os.*
import androidx.appcompat.app.AppCompatActivity

import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.annotation.RequiresApi


class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txt = findViewById<TextView>(R.id.mytxt)

            Handler().postDelayed({
                val a = AnimationUtils.loadAnimation(this, R.anim.alpha)
                txt.startAnimation(a)
                val intent = Intent(this,MainActivity2::class.java)
                startActivity(intent)
            }, 3000)

    }
}