package com.example.visualnovel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.imageButton
import kotlinx.android.synthetic.main.activity_main.imageButton2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_VisualNovel)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*showGIF()*/

        //fun clickButton(view:View){
            //val but:ImageButton = findViewById(R.id.imageButton)
            //val intent = Intent(this@MainActivity, MainActivity2::class.java)
            //when(view.id){
            //  R.id.imageButton->startActivity(intent)


            imageButton.setOnClickListener {

                val intent = Intent(this@MainActivity, Glava::class.java)
                startActivity(intent)
                finish()
            }
            // END
        //}
        imageButton2.setOnClickListener{
            val intent = Intent(this@MainActivity, AboutProject::class.java)
            startActivity(intent)
        }

    }
}
    /*fun showGIF() {
        val imageView:ImageView = findViewById(R.id.imageView)
        Glide.with(this).load(R.drawable.mainforest).into(imageView)
    }
    }*/










