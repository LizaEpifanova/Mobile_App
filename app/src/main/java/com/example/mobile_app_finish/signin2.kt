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

class signin2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signin2)
        val fabricate_button =findViewById<Button>(R.id.fabricate_button)
        fabricate_button.setOnClickListener { startActivity(Intent(this@signin2, signin3::class.java)) }
        val login_link =findViewById<TextView>(R.id.login_link)
        login_link.setOnClickListener { startActivity(Intent(this@signin2, signin::class.java)) }
        val comeback =findViewById<ImageButton>(R.id.obscure_button)
        comeback.setOnClickListener { startActivity(Intent(this@signin2, signin::class.java)) }
    }
}