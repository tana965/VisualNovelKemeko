package com.example.visualnovel

object ConstantsYarm3 {

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
            1, "Аз:\n Я подошёл к лавке с различными игрушками и взял одну.\n",
            R.drawable.yarm12
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Аз:\n-Забавная игрушка, а в чём смысл?\n",
            R.drawable.yarm12
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Продавец:\n-Это анти стресс.\n",
            R.drawable.yarm12
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Аз:\nЯ достал деньги и отдал их продавцу.\n",
            R.drawable.yarm13
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Ёр:\n-Я утром купил змейку!\n",
            R.drawable.yarm14
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Ирсай:\n-Её и на телефоне скачать можно!\n",
            R.drawable.yarm14
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Аз:\nОт упоминания телефона мне стало плохо. Я охнул и ещё раз достал игрушку.\n",
            R.drawable.yarm14
        )

        questionsList.add(que7)

        return questionsList
    }
}