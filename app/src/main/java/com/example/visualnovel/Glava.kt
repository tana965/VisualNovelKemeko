package com.example.visualnovel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_glava.button3
import kotlinx.android.synthetic.main.activity_glava.button5
import kotlinx.android.synthetic.main.activity_main.imageButton

class Glava : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_glava)


        button3.setOnClickListener {

            val intent = Intent(this@Glava, MainActivity2::class.java)
            startActivity(intent)
            finish()
        }

        button5.setOnClickListener {

            val intent = Intent(this@Glava, SceneYarm1::class.java)
            startActivity(intent)
            finish()
        }

    }
}