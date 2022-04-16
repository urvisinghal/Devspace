package com.example.chargeup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Starbucks : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_starbucks)
    }

    fun menuPage(view: android.view.View) {
        val intent = Intent(this, Menu::class.java)
        startActivity(intent)
    }
}