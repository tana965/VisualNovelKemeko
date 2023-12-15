package com.example.visualnovel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_vai.buttonNext4
import kotlinx.android.synthetic.main.activity_vai.*
import kotlinx.android.synthetic.main.activity_vai.imageWall4
import kotlinx.android.synthetic.main.activity_vai.textStory4

class Vai : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vai)


        buttonNext4.setOnClickListener{
            buttonNext4.visibility=View.INVISIBLE
            textStory4.visibility=View.INVISIBLE
            imageWall4.visibility=View.INVISIBLE

        }

        button9.setOnClickListener{

            val intent = Intent(this@Vai, TableRoom::class.java)
            startActivity(intent)
            finish()
        }

    }

    fun click (view: View) {
        val a = "б"
        val b = "к"
        val c = "ь"
        if (editTextText2.text.toString() == b && editTextText3.text.toString() == a && editTextText4.text.toString() == c) {
            editTextText2.isEnabled=false
            editTextText3.isEnabled=false
            editTextText4.isEnabled=false
            button9.visibility = View.VISIBLE
        }
    }
}