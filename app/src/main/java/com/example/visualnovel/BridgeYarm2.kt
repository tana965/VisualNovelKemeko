package com.example.visualnovel

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat

class BridgeYarm2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bridge_yarm2)

        val image = findViewById<ImageView>(R.id.imageViewY)
        val image2= findViewById<ImageView>(R.id.imageViewY2)
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
        val intent = Intent(this@BridgeYarm2, SceneYarmP::class.java)
        startActivity(intent)
        finish()

    }

    fun click2(view: View){
        val intent2 = Intent(this@BridgeYarm2, SceneYarmL::class.java)
        startActivity(intent2)
        finish()
    }
}