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

class signin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.signin)
        val stealthy_button =findViewById<Button>(R.id.stealthy_button)
        stealthy_button.setOnClickListener { startActivity(Intent(this@signin, main_acc::class.java)) }
        val text_link =findViewById<TextView>(R.id.deceptive_link)
        text_link.setOnClickListener { startActivity(Intent(this@signin, signin2::class.java)) }
        val comeback =findViewById<ImageButton>(R.id.obscure_button)
        comeback.setOnClickListener { startActivity(Intent(this@signin, language::class.java)) }
    }
}