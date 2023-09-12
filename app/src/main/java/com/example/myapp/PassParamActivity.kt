package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PassParamActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pass_param)

        val waitingRGM = findViewById<TextView>(R.id.txtViewWaitingRGM)
        val RGM = intent.getStringExtra("RGM")

        if (RGM != "") {
            waitingRGM.text = RGM
        } else {
            waitingRGM.text = "Aguardando RGM"
        }
    }
}