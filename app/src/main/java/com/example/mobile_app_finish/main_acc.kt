package com.example.mobile_app_finish

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class main_acc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_acc)

        val avatar =findViewById<ImageView>(R.id.avatar)
        avatar.setOnClickListener { startActivity(Intent(this@main_acc, profile::class.java)) }
        val first_game =findViewById<LinearLayout>(R.id.first_game)
        first_game.setOnClickListener { startActivity(Intent(this@main_acc, game_one::class.java)) }
        val second_game =findViewById<LinearLayout>(R.id.second_game)
        second_game.setOnClickListener { startActivity(Intent(this@main_acc, game_two::class.java)) }
        val third_game =findViewById<LinearLayout>(R.id.third_game)
        third_game.setOnClickListener { startActivity(Intent(this@main_acc, game_tree::class.java)) }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}