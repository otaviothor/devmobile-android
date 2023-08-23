package com.example.myapp

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog

// this class is an android class
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onTapButton(view: View) {
        println("button tapped")
    }

    fun onTapInOtherButton(event: View) {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("alert")
        builder.setMessage("message")
        builder.show()
    }



}