package com.example.visualnovel

object ConstantsTableRoom {


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
            1, "Дом:\n-Хочешь чаю?",
            R.drawable.yarm40
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Аз:\n-Домой хочу",
            R.drawable.yarm40
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Дом:\n-Отдохни\n",
            R.drawable.yarm40
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Аз:\n-Давай дальше двигаться",
            R.drawable.yarm41
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Аз:\nДом двинул чай ближе",
            R.drawable.yarm41
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Аз:\n-Он же просроченный...",
            R.drawable.yarm41
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Аз:\nДом ухнул и крикнул",
            R.drawable.yarm41
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "Дом:\n-Последняя загадка и ты уйдёшь!\n",
            R.drawable.yarm41
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Аз:\nЯ нахмурился",
            R.drawable.yarm41
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "Дом:\n-Держи загадку!\n ",
            R.drawable.yarm41
        )

        questionsList.add(que10)

        return questionsList
    }

}