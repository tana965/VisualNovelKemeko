package com.example.visualnovel

object ConstantsYarm2 {

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
            1, " НОВОГДНЯЯ ЯРМАРКА",
            R.drawable.yarm1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "...",
            R.drawable.yarm2
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "...",
            R.drawable.yarm3
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "БЗЗЗ-БЗЗЗ",
            R.drawable.yarm4
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Аз:\n-Какую кнопку нажать забыл уже?!",
            R.drawable.yarm5
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Аз:\nЯ еле вспомнил",
            R.drawable.yarm6
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Аз:\n-Ало!\n",
            R.drawable.yarm7
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "Ёр:\n-Привет! Ты на ярмарке? ",
            R.drawable.yarm8
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Аз:\n-Да!",
            R.drawable.yarm8
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "Аз:\nИз телефона я услышал ещё один голос \n",
            R.drawable.yarm8
        )

        questionsList.add(que10)

        val que11 = Question(
            11, "Ирсай:\n-Чем сейчас занимаетесь? ",
            R.drawable.yarm9
        )

        questionsList.add(que11)

        val que12 = Question(
            12, "Аз:\n-Нужно добыть Погодник из живого дома, а потом решить куда перепрятать \n",
            R.drawable.yarm9
        )

        questionsList.add(que12)

        val que13 = Question(
            13, "Ёр:\n-Разве живой дом плохо его охраняет\n",
            R.drawable.yarm9
        )

        questionsList.add(que13)

        val que14 = Question(
            14, "Аз:\n-Он очень доверчивый сразу всё выдаёт\n",
            R.drawable.yarm10
        )

        questionsList.add(que14)

        val que15 = Question(
            15, "...",
            R.drawable.yarm10
        )

        return questionsList
    }

}