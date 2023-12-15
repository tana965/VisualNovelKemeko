package com.example.visualnovel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_about_project.imageButton3
import kotlinx.android.synthetic.main.activity_main.imageButton2

class AboutProject : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_project)

        imageButton3.setOnClickListener{
            val intent = Intent(this@AboutProject, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}