package com.example.chikitsha2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class RegistrationPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration_page)

        val smbt = findViewById<Button>(R.id.Submit)

        smbt.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,Home::class.java)
            startActivity(intent)
        })
    }
}