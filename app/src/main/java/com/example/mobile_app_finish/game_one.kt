package com.example.mobile_app_finish


import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.core.content.ContextCompat
import java.security.AccessController.getContext

class game_one : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.game_one)
        val comeback =findViewById<ImageButton>(R.id.back)
        val next =findViewById<Button>(R.id.next)
        val again =findViewById<Button>(R.id.again)
        val imageView3 =findViewById<ImageView>(R.id.imageView3)
        val layout =findViewById<LinearLayout>(R.id.third_after)
        val check =findViewById<Button>(R.id.check)
        val text_yay1 =findViewById<TextView>(R.id.text_yay1)
        val text_yay2 =findViewById<TextView>(R.id.text_yay2)
        val again1 =findViewById<TextView>(R.id.again1)
        val again2 =findViewById<TextView>(R.id.again2)
        var clickCount = 0
        comeback.setOnClickListener { startActivity(Intent(this@game_one, main_acc::class.java)) }


        check.setOnClickListener {
            next.visibility=View.VISIBLE
            check.visibility=View.GONE
            imageView3.visibility=View.GONE
            layout.visibility=View.GONE
            text_yay1.visibility=View.VISIBLE
            text_yay2.visibility=View.VISIBLE
        }
        next.setOnClickListener {
            clickCount++
            if (clickCount == 1) {
                text_yay1.visibility=View.GONE
                text_yay2.visibility=View.GONE
                again.visibility=View.VISIBLE
                again1.visibility=View.VISIBLE
                again2.visibility=View.VISIBLE
            }
            if (clickCount == 2) {
                startActivity(Intent(this@game_one, main_acc::class.java))
            }

        }


        again.setOnClickListener {
            again.visibility=View.GONE
            again1.visibility=View.GONE
            again2.visibility=View.GONE
            next.visibility=View.GONE
            check.visibility=View.VISIBLE
            imageView3.visibility=View.VISIBLE
            layout.visibility=View.VISIBLE
            comeback.backgroundTintList = getColorStateList(R.color.blue)
        }
    }
}