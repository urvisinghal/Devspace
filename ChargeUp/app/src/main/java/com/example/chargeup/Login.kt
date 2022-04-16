package com.example.chargeup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun nextPage(view: android.view.View) {
        val intent = Intent(this, SignUp::class.java)
        startActivity(intent)
    }

    fun menuPage(view: android.view.View) {
        val intent = Intent(this, Menu::class.java)
        startActivity(intent)
    }
}