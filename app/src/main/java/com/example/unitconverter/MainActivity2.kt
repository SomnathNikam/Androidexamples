package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

 class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var editText = findViewById<EditText>(R.id.editTextNumber)

        var t3 = findViewById<TextView>(R.id.Value4)
        val btn = findViewById<Button>(R.id.button)



        btn.setOnClickListener {
            val getvaluefromedittext = editText.text.toString()
            val celsius:Float = getvaluefromedittext.toFloat()
            val returntxt = (celsius*9/5)+32
            returntxt.toString()
            t3.setText("Value is $returntxt")
        }
    }


}