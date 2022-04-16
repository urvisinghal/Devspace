package com.example.chargeup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up2)

        val spinner: Spinner = findViewById(R.id.spinner2)
        ArrayAdapter.createFromResource(
            this,
            R.array.college_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner.adapter = adapter
        }
    }

    fun menuPage(view: android.view.View) {
        val intent = Intent(this, Menu::class.java)
        startActivity(intent)
    }

    fun loginPage(view: android.view.View) {
        val intent = Intent(this, Login::class.java)
        startActivity(intent)
    }
}