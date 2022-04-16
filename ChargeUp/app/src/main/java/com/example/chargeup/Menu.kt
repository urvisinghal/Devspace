package com.example.chargeup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }

    fun kfcPage(view: android.view.View) {
        val intent = Intent(this, Kfc::class.java)
        startActivity(intent)
    }

    fun subwayPage(view: android.view.View) {
        val intent = Intent(this, Subway::class.java)
        startActivity(intent)
    }

    fun starPage(view: android.view.View) {
        val intent = Intent(this, Starbucks::class.java)
        startActivity(intent)
    }

    fun mcPage(view: android.view.View) {
        val intent = Intent(this, Mcd::class.java)
        startActivity(intent)
    }
}