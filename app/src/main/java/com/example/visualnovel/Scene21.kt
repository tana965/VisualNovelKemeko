package com.example.visualnovel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.buttonNext
import kotlinx.android.synthetic.main.activity_main2.imageWall
import kotlinx.android.synthetic.main.activity_main2.textStory
import kotlinx.android.synthetic.main.activity_scene21.*

class Scene21 : AppCompatActivity(), View.OnClickListener  {

    private var mCurrentPosition: Int = 1 // Default and the first question position
    private var mQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scene21)

        mQuestionsList = Constants21.getQuestions()
        setQuestion()
        buttonNext21.setOnClickListener(this)
    }

    override fun onClick(view: View) {

        when (view?.id) {

            R.id.buttonNext21 -> {

                if (mSelectedOptionPosition == 0) {

                    mCurrentPosition++

                    when {

                        mCurrentPosition <= mQuestionsList!!.size -> {

                            setQuestion()
                        }

                        else -> {
                            // START
                            val intent =
                                Intent(this@Scene21, Bridge2::class.java)
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
        textStory21.text = question.question
        imageWall21.setImageResource(question.image)

    }

}