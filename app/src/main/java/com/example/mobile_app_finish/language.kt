package com.example.mobile_app_finish

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.widget.Button

class language : AppCompatActivity() {
    private lateinit var buttonRus: Button
    private lateinit var buttonEng: Button
    private lateinit var buttonChoose: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.language)


        buttonChoose = findViewById(R.id.choosebtn)



        buttonChoose.setOnClickListener { startActivity(Intent(this@language, signin::class.java)) }
    }


}