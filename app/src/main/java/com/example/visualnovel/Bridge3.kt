package com.example.visualnovel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlin.system.exitProcess

class Bridge3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bridge3)
    }

    fun click(view: View){
        val intent =
            Intent(this@Bridge3, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}