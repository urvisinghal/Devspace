package com.example.chargeup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun nextPage(view: android.view.View) {
        val intent = Intent(this, Login::class.java)
        startActivity(intent)
    }
}