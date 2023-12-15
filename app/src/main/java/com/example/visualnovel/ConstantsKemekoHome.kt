package com.example.visualnovel

object ConstantsKemekoHome {

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
            1, "Аз:\n-Как насчёт того что бы отправить тебя в лес Кэмеко там твоими жителями могут стать Имя, либо же Адэхи. Да собственно много кто...\n",
            R.drawable.yarm29
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Дом:\n-А можно?\n"
            ,
            R.drawable.yarm29
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Аз:\n-Да, там же тебя и починят. Отдашь Погодник Кэмеко.",
            R.drawable.yarm29
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Дом:\n-Хорошо отдам, а я не забуду, как я туда попал?\n",
            R.drawable.yarm29
        )

        questionsList.add(que4)

        val que5 = Question(
            5, "Аз:\n-Кэмеко забирает память только после того, когда понимает, с какой целью пришли в лес, поэтому вряд ли он заберёт твою память.\n",
            R.drawable.yarm29
        )

        questionsList.add(que5)

        val que6 = Question(
            6, "Аз:\nЯ вышел из дома и встал у входа.\n",
            R.drawable.yarm24
        )

        questionsList.add(que6)

        val que7 = Question(
            7, "Аз:\n-До свидания!",
            R.drawable.yarm24
        )

        questionsList.add(que7)

        val que8 = Question(
            8, "Дом:\n-До свидания!",
            R.drawable.yarm24
        )

        questionsList.add(que8)

        return questionsList
    }

}