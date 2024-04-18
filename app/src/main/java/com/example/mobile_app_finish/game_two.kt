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
import androidx.activity.enableEdgeToEdge


class game_two : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.game_two)

        val first_btn =findViewById<Button>(R.id.first_btn_1)
        val second_btn =findViewById<Button>(R.id.first_btn_2)
        val third_btn =findViewById<Button>(R.id.first_btn_3)
        val fourth_btn =findViewById<Button>(R.id.first_btn_4)
        val check =findViewById<Button>(R.id.choosebtn)
        val next =findViewById<Button>(R.id.next)
        check.setOnClickListener {
            check.visibility=View.GONE
            next.visibility=View.VISIBLE
            second_btn.backgroundTintList = getColorStateList(R.color.green)
            if (first_btn.backgroundTintList == getColorStateList(R.color.bluee)) {
                first_btn.backgroundTintList == getColorStateList(R.color.language_background_true)
            }
            if (third_btn.backgroundTintList == getColorStateList(R.color.bluee)) {
                third_btn.backgroundTintList == getColorStateList(R.color.language_background_true)
            }
            if (fourth_btn.backgroundTintList == getColorStateList(R.color.bluee)) {
                fourth_btn.backgroundTintList == getColorStateList(R.color.language_background_true)
            }
        }
        next.setOnClickListener {
            startActivity(Intent(this@game_two, main_acc::class.java))
        }

        first_btn.setOnClickListener {
            if (next.visibility!=View.VISIBLE){
                first_btn.backgroundTintList = getColorStateList(R.color.bluee)
                second_btn.backgroundTintList = getColorStateList(R.color.button_background)
                third_btn.backgroundTintList = getColorStateList(R.color.button_background)
                fourth_btn.backgroundTintList = getColorStateList(R.color.button_background)
            }
        }
        second_btn.setOnClickListener {
            if (next.visibility!=View.VISIBLE){
                first_btn.backgroundTintList = getColorStateList(R.color.button_background)
                second_btn.backgroundTintList = getColorStateList(R.color.bluee)
                third_btn.backgroundTintList = getColorStateList(R.color.button_background)
                fourth_btn.backgroundTintList = getColorStateList(R.color.button_background)
            }
        }
        third_btn.setOnClickListener {
            if (next.visibility!=View.VISIBLE){
                first_btn.backgroundTintList = getColorStateList(R.color.button_background)
                second_btn.backgroundTintList = getColorStateList(R.color.button_background)
                third_btn.backgroundTintList = getColorStateList(R.color.bluee)
                fourth_btn.backgroundTintList = getColorStateList(R.color.button_background)
            }
        }
        fourth_btn.setOnClickListener {
            if (next.visibility!=View.VISIBLE) {
                first_btn.backgroundTintList = getColorStateList(R.color.button_background)
                second_btn.backgroundTintList = getColorStateList(R.color.button_background)
                third_btn.backgroundTintList = getColorStateList(R.color.button_background)
                fourth_btn.backgroundTintList = getColorStateList(R.color.bluee)
            }
        }

        val comeback =findViewById<ImageButton>(R.id.back)
        comeback.setOnClickListener { startActivity(Intent(this@game_two, main_acc::class.java)) }
    }
}