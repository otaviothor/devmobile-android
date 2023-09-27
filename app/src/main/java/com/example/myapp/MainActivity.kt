package com.example.myapp

import android.content.Intent
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

    fun onTapOpenDynamicWebButton(view: View) {
        val intent = Intent(this, DynamicWebviewActivity::class.java).apply {}
        startActivity(intent);
    }

    fun onTapOpenStaticWebButton(view: View) {
        val intent = Intent(this, StaticWebviewActivity::class.java).apply {}
        startActivity(intent);
    }

    fun onTapOpenPassParamButton(view: View) {
        val intent = Intent(this, SecondActivity::class.java).apply {}
        startActivity(intent);
    }

    fun onTapOpenPassParamWithListButton(view: View) {
        val intent = Intent(this, PassParamWithListActivity::class.java).apply {}
        startActivity(intent);
    }

    fun onTapInOtherButton(event: View) {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("alert")
        builder.setMessage("message")
        builder.show()
    }
}