package com.example.visualnovel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlin.system.exitProcess

class Bridge2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bridge2)

    }


    fun click(view: View){
        val intent =
            Intent(this@Bridge2, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

}