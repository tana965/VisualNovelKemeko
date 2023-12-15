package com.example.visualnovel

object ConstantsFriend {

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
            1, "Аз:\n-Хочешь я стану твоим жителем?",
            R.drawable.yarm29
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Дом:\n-Если ты хочешь, то да!"
            ,
            R.drawable.yarm29
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Аз:\n-В таком случае с завтрашнего дня перееду и начну ремонт\n",
            R.drawable.yarm29
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Аз:\nА Погодник я спрячу под замки в своё сознание\n",
            R.drawable.yarm29
        )

        questionsList.add(que4)

        val que5 = Question(
            5, "Дом:\n-Я так счастлив!\n",
            R.drawable.yarm29
        )

        questionsList.add(que5)

        val que6 = Question(
            6, "Аз:\nОкна его застучали в унисон",
            R.drawable.yarm29
        )

        questionsList.add(que6)

        return questionsList
    }

}