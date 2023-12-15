package com.example.visualnovel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_home_next_door.*


class HomeNextDoor : AppCompatActivity(), View.OnClickListener  {

    private var mCurrentPosition: Int = 1 // Default and the first question position
    private var mQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_next_door)

        mQuestionsList = ConstantsHomeNextDoor.getQuestions()
        setQuestion()
        buttonNext3.setOnClickListener(this)

    }


    override fun onClick(view: View) {

        when (view?.id) {

            R.id.buttonNext3 -> {

                if (mSelectedOptionPosition == 0) {

                    mCurrentPosition++

                    when {

                        mCurrentPosition <= mQuestionsList!!.size -> {

                            setQuestion()
                        }

                        else -> {
                            // START
                            val intent =
                                Intent(this@HomeNextDoor, BridgeHome::class.java)
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
        textStory3.text = question.question
        imageWall3.setImageResource(question.image)

    }

}