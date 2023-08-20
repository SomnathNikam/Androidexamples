package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

public class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
         val t1 = findViewById<TextView>(R.id.txt2)
        var editText = findViewById<EditText>(R.id.editTextNumber)
        val t2 = findViewById<TextView>(R.id.Pound3)
        var t3 = findViewById<TextView>(R.id.Value4)
        val btn = findViewById<Button>(R.id.button)



        btn.setOnClickListener {
            val getvaluefromedittext = editText.text.toString()
            val pound:Float = getvaluefromedittext.toFloat()
            val returntxt = pound*2.205
            returntxt.toString()
            t3.setText("Value is "+returntxt)
        }
    }


}