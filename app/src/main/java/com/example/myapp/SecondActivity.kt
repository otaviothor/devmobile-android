package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    fun onTapOpenPassParamButton(view: View) {
        val inputRGM = findViewById<EditText>(R.id.inputRGM)
        val RGM = inputRGM.text.toString()
        val intent = Intent(this, PassParamActivity::class.java).apply {
            putExtra("RGM", RGM)
        }
        startActivity(intent);
    }
}