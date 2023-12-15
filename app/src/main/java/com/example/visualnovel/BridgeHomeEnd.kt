package com.example.visualnovel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_bridge_home_end.*
import kotlinx.android.synthetic.main.activity_main.imageButton

class BridgeHomeEnd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bridge_home_end)

        buttonNext34.setOnClickListener{

            buttonNext34.visibility= View.INVISIBLE
            textStory3.visibility=View.INVISIBLE
            buttonNext6.visibility=View.VISIBLE
            buttonNext7.visibility=View.VISIBLE
            textStory6.visibility=View.VISIBLE
            textStory7.visibility=View.VISIBLE
        }

        buttonNext6.setOnClickListener {

            val intent = Intent(this@BridgeHomeEnd, Friend::class.java)
            startActivity(intent)
            finish()
        }

        buttonNext7.setOnClickListener {

            val intent = Intent(this@BridgeHomeEnd, KemekoHome::class.java)
            startActivity(intent)
            finish()
        }

    }
}