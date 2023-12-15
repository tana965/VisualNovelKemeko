package com.example.visualnovel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_kemeko_home.*

class KemekoHome : AppCompatActivity(), View.OnClickListener {


    private var mCurrentPosition: Int = 1 // Default and the first question position
    private var mQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kemeko_home)


        mQuestionsList = ConstantsKemekoHome.getQuestions()
        setQuestion()
        buttonNext9.setOnClickListener(this)
    }

    override fun onClick(view: View) {

        when (view?.id) {

            R.id.buttonNext9 -> {

                if (mSelectedOptionPosition == 0) {

                    mCurrentPosition++

                    when {

                        mCurrentPosition <= mQuestionsList!!.size -> {

                            setQuestion()
                        }

                        else -> {
                            // START
                            val intent =
                                Intent(this@KemekoHome, Bridge3::class.java)
                            startActivity(intent)
                            finish()
                            // END
                        }
                    }
                }
            }
        }
    }
    private fun setQuestion() {

        val question =
            mQuestionsList!!.get(mCurrentPosition - 1) // Getting the question from the list with the help of current position.
        textStory9.text = question.question
        imageWall7.setImageResource(question.image)

    }

}