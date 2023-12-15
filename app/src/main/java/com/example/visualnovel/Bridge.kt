package com.example.visualnovel

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat


class Bridge : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bridge)

        val image = findViewById<ImageView>(R.id.imageView4)
        val image2= findViewById<ImageView>(R.id.imageView5)
        val myVectorIcon = AnimatedVectorDrawableCompat.create(
            this,
            R.drawable.tria,
        )
        val myVectorIcon2 = AnimatedVectorDrawableCompat.create(
            this,
            R.drawable.trial,
        )
        image.setImageDrawable(myVectorIcon)
        image2.setImageDrawable(myVectorIcon2)
        myVectorIcon?.start()
        myVectorIcon2?.start()

    }

    fun click1(view: View){
            val intent = Intent(this@Bridge, Scene2::class.java)
            startActivity(intent)
        finish()

    }

    fun click2(view: View){
        val intent2 = Intent(this@Bridge, Scene21::class.java)
        startActivity(intent2)
finish()
    }

}