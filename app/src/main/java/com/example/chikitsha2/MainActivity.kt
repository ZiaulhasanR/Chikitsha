package com.example.chikitsha2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val libt = findViewById<Button>(R.id.LoginID)

        libt.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,Home::class.java)

            startActivity(intent)
        })

        val rebt = findViewById<Button>(R.id.RegisTrationID)

        rebt.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,RegistrationPage::class.java)

            startActivity(intent)
        })


    }
}