package com.example.mobile_app_finish

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContentView(R.layout.profile)

        val first_btn =findViewById<Button>(R.id.switch_theme)
        val second_btn =findViewById<Button>(R.id.change_language)
        val third_btn =findViewById<Button>(R.id.change_image)
        val fourth_btn =findViewById<Button>(R.id.Logout)

        first_btn.setOnClickListener { startActivity(Intent(this@profile, MainActivity::class.java)) }
        second_btn.setOnClickListener { startActivity(Intent(this@profile, language::class.java)) }
        fourth_btn.setOnClickListener { startActivity(Intent(this@profile, signin::class.java)) }
    }
}