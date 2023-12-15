package com.example.visualnovel

object ConstantsHomeNextDoor {

    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "Аз:\nЯ провалился в светлую пустоту. ",
            R.drawable.yarm36
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Аз:\nПередо мною стояли две двери.\n",
            R.drawable.yarm37
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Аз:\n-За какой дверью нужный путь?\n",
            R.drawable.yarm37
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Дом:\n-Неважно просто выбери",
            R.drawable.yarm37
        )

        questionsList.add(que4)

        return questionsList
    }

    }