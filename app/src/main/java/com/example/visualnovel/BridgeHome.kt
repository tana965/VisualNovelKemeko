package com.example.visualnovel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bridge_home.adehi
import kotlinx.android.synthetic.main.activity_bridge_home.vai
import kotlinx.android.synthetic.main.activity_main.imageButton

class BridgeHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bridge_home)


        vai.setOnClickListener {

            val intent = Intent(this@BridgeHome, Vai::class.java)
            startActivity(intent)
            finish()
        }


        adehi.setOnClickListener {

            val intent = Intent(this@BridgeHome, TableRoom::class.java)
            startActivity(intent)
            finish()
        }

    }
}