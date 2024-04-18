package com.example.mobile_app_finish

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class game_tree : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.game_three)

        val check =findViewById<Button>(R.id.check_speech_btn)
        val third_after =findViewById<LinearLayout>(R.id.third_after)
        val micro =findViewById<ImageButton>(R.id.micro)
        val yay =findViewById<Button>(R.id.next)
        check.setOnClickListener {
            third_after.visibility=View.VISIBLE
            check.visibility=View.GONE
            micro.visibility=View.VISIBLE
        }
        micro.setOnClickListener {
            micro.visibility=View.GONE
            yay.visibility=View.VISIBLE
        }
        yay.setOnClickListener { startActivity(Intent(this@game_tree, main_acc::class.java)) }

        val comeback =findViewById<ImageButton>(R.id.back)
        comeback.setOnClickListener { startActivity(Intent(this@game_tree, main_acc::class.java)) }
    }
}