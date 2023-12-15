package com.example.visualnovel

object ConstantsYarmL2 {

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
            1, "Аз:\n-Повезло...",
            R.drawable.yarm20
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Ёр:\n-Мне попался купон на подушку для сна…\n",
            R.drawable.yarm21
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Ирсай:\n-Cудьба намекает тебе, что пора отдохнуть!\n",
            R.drawable.yarm21
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Аз:\n-Действительно следует Ёр!\n",
            R.drawable.yarm21
        )

        questionsList.add(que4)

        val que5 = Question(
            5, "Аз:\n-Ладно мне надо идти кладу телефон",
            R.drawable.yarm21
        )

        questionsList.add(que5)

        return questionsList
    }

}