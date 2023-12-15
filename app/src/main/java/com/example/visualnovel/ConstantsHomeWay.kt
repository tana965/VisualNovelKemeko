package com.example.visualnovel

object ConstantsHomeWay {

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
            1, "Аз:\nЯ улыбнулся, вышел на дорогу и ещё раз проверил карту.\n",
            R.drawable.yarm22
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "...",
            R.drawable.yarm23
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Аз:\nЯ встал у двери с рисунком Погодника.",
            R.drawable.yarm24
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Аз:\n-Дом я хочу зайти внутрь!\n",
            R.drawable.yarm24
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Аз:\nСвист пронёсся вокруг меня,  на двери загорелись разноцветные огни.\n",
            R.drawable.yarm25
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Аз:\nДверь со скрипом отрылась.",
            R.drawable.yarm26
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Аз:\n-Надо будем потом тебя подлатать. Совсем старый стал.",
            R.drawable.yarm26
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "Дом:\n-Нее-ее-еет я не ста-аа-ааарый!",
            R.drawable.yarm26
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Аз:\n-Всё-всё верю тебе.\n",
            R.drawable.yarm26
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "Аз:\nЯ решил зажечь свет. ",
            R.drawable.yarm27
        )

        questionsList.add(que10)

        val que11 = Question(
            11, "Аз:\nЩелчок пальцев.",
            R.drawable.yarm28
        )

        questionsList.add(que11)

        val que12 = Question(
            12, "Аз:\n-Ужас как тут пыльно!\n",
            R.drawable.yarm29
        )

        questionsList.add(que12)

        val que13 = Question(
            13, "Дом:\n-Думаешь, я умею делать уборку?\n",
            R.drawable.yarm29
        )

        questionsList.add(que13)

        val que14 = Question(
            14, "Аз:\nДом подпрыгнул, и я упал на пол.\n",
            R.drawable.yarm30
        )

        questionsList.add(que14)

        val que15 = Question(
            15, "Аз:\n-Почистим тебя и починим!\n",
            R.drawable.yarm29
        )

        questionsList.add(que15)

        val que16 = Question(
            16, "Аз:\nЩелчок пальцев.",
            R.drawable.yarm31
        )

        questionsList.add(que16)

        val que17 = Question(
            17, "Аз:\nВ воздухе появились швабра ведро и тряпки активно наводящие порядок. ",
            R.drawable.yarm32
        )

        questionsList.add(que17)

        val que18 = Question(
            18, "Аз:\nЯ укладывал разбросанные предметы на места.",
            R.drawable.yarm32
        )

        questionsList.add(que18)

        val que19 = Question(
            19, "Дом:\n-Как приятно!",
            R.drawable.yarm33
        )

        questionsList.add(que19)

        val que20 = Question(
            20, "Аз:\n-Конечно приятно.",
            R.drawable.yarm33
        )

        questionsList.add(que20)

        val que21 = Question(
            21, "Аз:\nЯ улыбнулся и подошёл к зелёной двери.",
            R.drawable.yarm34
        )

        questionsList.add(que21)

        val que22 = Question(
            22, "Дом:\n-За ней путь к Погоднику.",
            R.drawable.yarm34
        )

        questionsList.add(que22)

        val que23 = Question(
            23, "Аз:\n-Я могу её просто открыть?\n",
            R.drawable.yarm34
        )

        questionsList.add(que23)
        val que24 = Question(
            24, "Дом:\n-Да.",
            R.drawable.yarm34
        )

        questionsList.add(que24)
        val que25 = Question(
            25, "Аз:\nЯ открыл дверь и вошёл в помещение. Вокруг была абсолютная тьма.\n",
            R.drawable.yarm35
        )

        questionsList.add(que25)
        val que26 = Question(
            26, "Аз:\nЩелчок пальцев.",
            R.drawable.yarm35
        )

        questionsList.add(que26)
        val que27 = Question(
            27, "Аз:\nСвет не получалось создать.",
            R.drawable.yarm35
        )

        questionsList.add(que27)

        val que28 = Question(
            28, "Дом:\nЭто слепой лабиринт... удачи-ии-ии!",
            R.drawable.yarm35
        )

        questionsList.add(que28)


        val que29 = Question(
            29, "Аз:\nЯ попытался ощутить пространство, но не мог. Ногами я почувствовал начерченные ряды и столбцы.",
            R.drawable.yarm35
        )

        questionsList.add(que29)

        return questionsList
    }

}