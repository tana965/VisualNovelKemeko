package com.example.visualnovel

object Constants {

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
            1, "Вы:\n-В лесу у Кэмеко можно загадать желание он его исполнит! Очень интересно!\n",
            R.drawable.book
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "...",
            R.drawable.forestwaystart
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Вы:\n-Где я? Как же холодно! \n",
            R.drawable.rain
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Вы:\nЯ поднялся с земли и осмотрел лес вокруг меня, ливень становился всё сильнее, не было понятно, что делать. Внезапно я почувствовал спиной тепло и обернулся. \n",
            R.drawable.rain
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Вы:\nПередо мной стояла дверь с табличкой \"СОН\". Я удивился, что дверь стоит посреди леса, но если за ней меня ждало тепло, то я согласен открыть её. ",
            R.drawable.door2
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "...",
            R.drawable.door3
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "...",
            R.drawable.door4
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "Сон:\n-Здравствуй Ёр!\n",
            R.drawable.sleepsmile
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Вы:\n-Откуда вы знаете моё имя? Почему я оказался в этом лесу?\n",
            R.drawable.sleephandline
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "Сон:\n-Меня зовут Сон, я не знаю, откуда ты, но я знаю твоё имя и сны. Было не трудно найти тебя, пока ты был без сознания.\n",
            R.drawable.sleephandrot
        )

        questionsList.add(que10)


        val que11 = Question(
            11, "Вы:\nПарень поднял руку и дал мне чашку с горячим напитком.",
            R.drawable.cuphandsleep
        )

        questionsList.add(que11)

        val que12 = Question(
            12, "Сон:\n-Небойся это из реки на зимних землях что-то вроде чая. Тебя нужно вернуть домой, я чувствую, что ты этого хочешь.\n",
            R.drawable.sleepsmile
        )

        questionsList.add(que12)

        val que13 = Question(
            13, "Вы:\n-Могу я узнать, где нахожусь?\n",
            R.drawable.sleepline
        )

        questionsList.add(que13)

        val que14 = Question(
            14, "Сон:\n-В лесу Кэмеко, что бы отсюда выйти нужно найти Кэмеко и он решит отпускать тебя или нет. Найди реку и иди против течения.\n",
            R.drawable.sleephandrot
        )

        questionsList.add(que14)

        val que15 = Question(
            15, "Вы:\nМне стало не по себе от того что меня могут и не отпустить.\n",
            R.drawable.sleepline
        )

        questionsList.add(que15)

        val que16 = Question(
            16, "Сон:\n-Меня не отпустили, теперь я тут работаю. Я даже имени своего не помню, поэтому меня зовут Сон. Я дарю интересные сны ученикам школы, могу даже вещие сны создавать.\n",
            R.drawable.sleepsmile
        )

        questionsList.add(que16)

        val que17 = Question(
            17, "Вы:\n-А кто до тебя это делал?",
            R.drawable.sleephandline
        )

        questionsList.add(que17)

        val que18 = Question(
            18, "Сон:\n-Никто... именно со мной и появились чудо сны в стенах школы... я даже не знаю, хочу ли обратно, может моё место здесь.\n",
            R.drawable.sleepsmile
        )

        questionsList.add(que18)

        val que19 = Question(
            19, "Вы:\n-Почему же мы оба сюда попали? ",
            R.drawable.sleepline
        )

        questionsList.add(que19)

        val que20 = Question(
            20, "Вы:\nПоняв что буду делать дальше, я встал с подушек и попрощался со Сном, он дал мне большое тёплое одеяло. И снова я оказался под дождём.",
            R.drawable.odealo
        )

        questionsList.add(que20)

        return questionsList
    }
}