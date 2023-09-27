package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ShowDataFromListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_data_from_list)

        val full_name = intent.getStringExtra("full_name")
        println(full_name)
    }
}