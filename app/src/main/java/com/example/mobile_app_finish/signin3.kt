package com.example.mobile_app_finish

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class signin3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signin3)
        val registration_button =findViewById<Button>(R.id.registration_button)
        registration_button.setOnClickListener { startActivity(Intent(this@signin3, signin::class.java)) }
        val login_link =findViewById<TextView>(R.id.sign_in_link)
        login_link.setOnClickListener { startActivity(Intent(this@signin3, signin::class.java)) }
        val comeback =findViewById<ImageButton>(R.id.obscure_button)
        comeback.setOnClickListener { startActivity(Intent(this@signin3, signin2::class.java)) }
    }
}