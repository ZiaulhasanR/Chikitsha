package com.example.chikitsha2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val casb = findViewById<Button>(R.id.ConsultSpecialistID)

        casb.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,ConsultSpecialist::class.java)
            startActivity(intent)
        })

        val hanb = findViewById<Button>(R.id.nurseID)

        hanb.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,HireANurse::class.java)
            startActivity(intent)
        })

        val phb = findViewById<Button>(R.id.FindPharmacyID)

        phb.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,HireANurse::class.java)
            startActivity(intent)
        })
    }
}