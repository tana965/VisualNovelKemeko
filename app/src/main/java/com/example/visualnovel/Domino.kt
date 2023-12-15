package com.example.visualnovel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_domino.button6
import kotlinx.android.synthetic.main.activity_domino.fourfour
import kotlinx.android.synthetic.main.activity_domino.freefour
import kotlinx.android.synthetic.main.activity_domino.freefree
import kotlinx.android.synthetic.main.activity_domino.leftdown
import kotlinx.android.synthetic.main.activity_domino.leftup
import kotlinx.android.synthetic.main.activity_domino.rightdown
import kotlinx.android.synthetic.main.activity_domino.rightup
import kotlinx.android.synthetic.main.activity_domino.twofour
import kotlinx.android.synthetic.main.activity_main.imageButton

class Domino : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_domino)


        button6.setOnClickListener {

            val intent = Intent(this@Domino, BridgeHomeEnd::class.java)
            startActivity(intent)
            finish()
        }
    }



    fun count(){

        if(fourfour.isEnabled==false&&twofour.isEnabled==false&&
            freefour.isEnabled==false&&freefree.isEnabled==false){
            button6.visibility= View.VISIBLE
        }
    }

    fun clickfourfour(view: View){
        rightdown.setOnClickListener{
            rightdown.setImageResource(R.drawable.fourfour2)}
        rightup.setOnClickListener{
            rightup.setImageResource(R.drawable.fourfour)}
        leftup.setOnClickListener{
            leftup.setImageResource(R.drawable.fourfour2)
            leftup.isEnabled=false
            fourfour.isEnabled=false
            count()
        }
        leftdown.setOnClickListener{
            leftdown.setImageResource(R.drawable.fourfour)
        }

    }

    fun clicktwofour(view: View){
        rightdown.setOnClickListener{
            rightdown.setImageResource(R.drawable.twofour2)}
        rightup.setOnClickListener{
            rightup.setImageResource(R.drawable.twofour)
            rightup.isEnabled=false
            twofour.isEnabled=false
            count()
        }
        leftup.setOnClickListener{
            leftup.setImageResource(R.drawable.twofour2)}
        leftdown.setOnClickListener{
            leftdown.setImageResource(R.drawable.twofour)
        }

    }


    fun clickfreefour(view: View){
        rightdown.setOnClickListener{
            rightdown.setImageResource(R.drawable.freefour2)
            rightdown.isEnabled=false
            freefour.isEnabled=false
            count()
        }
        rightup.setOnClickListener{
            rightup.setImageResource(R.drawable.freefour)}
        leftup.setOnClickListener{
            leftup.setImageResource(R.drawable.freefour2)}
        leftdown.setOnClickListener{
            leftdown.setImageResource(R.drawable.freefour)
        }

    }

    fun clickfreefree(view: View){
        rightdown.setOnClickListener{
            rightdown.setImageResource(R.drawable.freefree2)}
        rightup.setOnClickListener{
            rightup.setImageResource(R.drawable.freefree)}
        leftup.setOnClickListener{
            leftup.setImageResource(R.drawable.freefree2)}
        leftdown.setOnClickListener{
            leftdown.setImageResource(R.drawable.freefree)
            leftdown.isEnabled=false
            freefree.isEnabled=false
            count()

        }

    }


}