package com.example.visualnovel

object Constants21 {
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
            1, "Вы:\nЯ долго шёл под уже промокшим одеялом и наткнулся на поляну с ягодами. Я понял, что это маым ягода. \n",
            R.drawable.berrypolana
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Вы:\nЯ знал про её волшебные свойства давать силу разрушения. Я очень хотел есть.\n",
            R.drawable.berrypolana
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Вы:\nС каждой ягодой я ощущал сильный прилив сил, я ударил кулаком по дереву, и оно с треском рухнуло вниз.\n",
            R.drawable.brokentree
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Вы:\nЯ шел, расчищая себе путь пока не понял, что если  я не хочу проблем с Кэмеко, то  ломать его лес не стоит. \n",
            R.drawable.brokenbereza
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Вы:\nМне не стало совсем плохо, очень жарко и болела голова,  дождь звенел в ушах и я упал на траву.\n",
            R.drawable.trava
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "???\n-Нашёлся!\n",
            R.drawable.trava
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Вы:\nЯ проснулся в тепле.",
            R.drawable.sleeproom
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "Вы:\nМне уже протягивали речной чай, который я выпил моментально.\n",
            R.drawable.cuphandsleep
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Сон:\n-Я подумал, что не нужно бросать тебя ты один тут не справишься.",
            R.drawable.sleephandrot
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "Вы:\n-Спасибо!\n",
            R.drawable.sleepline
        )

        questionsList.add(que10)

        val que11 = Question(
            11, "Вы:\nЯ чихнул и в глазах потемнело. Сон рядом со мной сосредоточено о чём то думал.\n",
            R.drawable.sleepline
        )

        questionsList.add(que11)

        val que12 = Question(
            12, "Имя:\n-Ты звал меня?\n",
            R.drawable.namesleep1
        )

        questionsList.add(que12)

        val que13 = Question(
            13, "Вы:\nВ комнате появился парень с большой, толстой книгой. Сон встал и подошёл к нему.\n",
            R.drawable.namesleep1
        )

        questionsList.add(que13)

        val que14 = Question(
            14, "Имя:\n-Привет Сон!",
            R.drawable.namesleep2
        )

        questionsList.add(que14)

        val que15 = Question(
            15, "Сон:\n-Привет Имя, дай, пожалуйста, ему его имя.",
            R.drawable.sleepname3
        )

        questionsList.add(que15)

        val que16 = Question(
            16, "Имя:\n-Зачем? Нам нельзя это делать.\n",
            R.drawable.namesleep5
        )

        questionsList.add(que16)

        val que17 = Question(
            17, "Сон:\n-Позволим ему всё забыть, что бы он остался с нами?\n",
            R.drawable.sleepname3nohand
        )

        questionsList.add(que17)

        val que18 = Question(
            18, "Вы:\nСон обеспокоено посмотрел на меня.\n",
            R.drawable.sleepname3
        )

        questionsList.add(que18)

        val que19 = Question(
            19, "Вы:\n-Но я помню своё имя... меня зовут... Е…",
            R.drawable.sleepname3
        )

        questionsList.add(que19)

        val que20 = Question(
            20, "Имя:\n-Тебя зовут Ёр, другие это знают, но ты никогда не вспомнишь и не запомнишь. Такие вот дела, я отдам тебе твоё имя пока не поздно. Забудешь имя, потеряешь стремление вернуться домой!\n",
            R.drawable.namesleep2
        )

        questionsList.add(que20)

        val que21 = Question(
            21, "Вы:\nОн положил ладонь на книгу, а потом взял мою руку, на ней отпечаталось имя.\n",
            R.drawable.namehandbook
        )

        questionsList.add(que21)

        val que22 = Question(
            22, "Вы:\n-Ты тоже попал в этот лес и не помнишь как?\n",
            R.drawable.sleepname3
        )

        questionsList.add(que22)

        val que23 = Question(
            23, "Имя:\n-Нет, я сам желаю здесь быть.",
            R.drawable.namesleep2
        )

        questionsList.add(que23)
        val que24 = Question(
            24, "Вы:\n-Кэмеко отпустит меня?\n",
            R.drawable.namesleep5
        )

        questionsList.add(que24)
        val que25 = Question(
            25, "Вы:\nИмя промолчал.",
            R.drawable.namesleep5
        )

        questionsList.add(que25)
        val que26 = Question(
            26, "Вы:\nСпустя время Сон смог найти Кэмеко. Мы вышли в красивое волшебное место. Рядом лил водопад и посреди него сидел парень. Я подошёл к самому берегу, Сон и Имя шли за мной.\n",
            R.drawable.waterfall
        )

        questionsList.add(que26)
        val que27 = Question(
            27, "Вы:\n-Вы Кэмеко?\n",
            R.drawable.kemekosit
        )

        questionsList.add(que27)

        val que28 = Question(
            28, "???:\n-А где здравствуйте?\n",
            R.drawable.kemekosit
        )

        questionsList.add(que28)


        val que29 = Question(
            29, "Вы:\n-Здравствуйте!\n",
            R.drawable.kemekosit
        )

        questionsList.add(que29)


        val que30 = Question(
            30, "Вы:\nСон и Имя так же поздоровались.\n",
            R.drawable.kemekosit
        )

        questionsList.add(que30)


        val que31 = Question(
            31, "Вы:\nКэмеко поднялся с камня и пошёл к нам по воде.",
            R.drawable.waterfall2
        )

        questionsList.add(que31)


        val que32 = Question(
            32, "Кэмеко:\n-я тут слышал, что ты домой хочешь, а ты уверен, что тебе это надо?\n",
            R.drawable.kemeko1
        )

        questionsList.add(que32)


        val que33 = Question(
            33, "Вы:\n-Да!\n",
            R.drawable.kemeko1
        )

        questionsList.add(que33)


        val que34 = Question(
            34, "Вы:\nКэмеко улыбнулся.",
            R.drawable.kemekosmile
        )

        questionsList.add(que34)


        val que35 = Question(
            35, "Кэмеко:\n-Когда вернёшься и всё вспомнишь, будет очень грустно. Я ведь знаю, как ты сюда попал...\n",
            R.drawable.kemekosmile
        )

        questionsList.add(que35)


        val que36 = Question(
            36, "Вы:\n-Я хочу домой! ",
            R.drawable.kemekosmile
        )

        questionsList.add(que36)

        val que37 = Question(
            37, "Кэмеко:\n-Ну, я тебя предупредил...\n",
            R.drawable.kemekosmile
        )

        questionsList.add(que37)

        val que38 = Question(
            38, "Вы:\nСон и Имя переглянулись.\n",
            R.drawable.sleepnamewatefal
        )

        questionsList.add(que38)

        val que39 = Question(
            39, "Кэмеко:\n-Благодаря Ёру вы вспомнили, что тоже можете отправиться домой? Может и имена вспомнили пхах!\n",
            R.drawable.kemekosmile
        )

        questionsList.add(que39)

        val que40 = Question(
            40, "Сон и Имя:\n-Нет, мы не помним Кэмеко.",
            R.drawable.sleepnamewatefal
        )

        questionsList.add(que40)

        val que41 = Question(
            41, "Сон:\n-Я хочу домой…\n",
            R.drawable.sleepnamewatefal
        )

        questionsList.add(que41)

        val que42 = Question(
            42, "Кэмеко:\n-С тобой та же ситуация, тебе может не понравиться то, что ты увидишь. Я отпущу вас обоих, но если захотите вернуться обратно, я вас уже не выпущу. Загадывайте желание!\n",
            R.drawable.kemeko3
        )

        questionsList.add(que42)

        val que43 = Question(
            43, "Вы и Сон:\n-Мы хотим вернуться домой!\n",
            R.drawable.kemeko3
        )

        questionsList.add(que43)

        val que44 = Question(
            44, "Вы:\nКэмеко хлопнул ладонями. Земля ушла у нас из под ног, мы приземлились у ворот школы.\n",
            R.drawable.kemekohlop
        )

        questionsList.add(que44)


        val que45 = Question(
            45, "Я ВСПОМНИЛ ВСЁ",
            R.drawable.schoolenter
        )

        questionsList.add(que45)


        val que46 = Question(
            46, "Вы:\n-У Кэмеко можно загадать желание он его исполнит! \n",
            R.drawable.book
        )

        questionsList.add(que46)


        val que47 = Question(
            47, "Ирсай:\n-Прочти то, что написано маленькими буквами «попадая туда можно всё забыть»!\n",
            R.drawable.book
        )

        questionsList.add(que47)


        val que48 = Question(
            48, "Вы:\nНа моё плечо легла рука.\n",
            R.drawable.handplecho
        )

        questionsList.add(que48)


        val que49 = Question(
            49, "Ирсай:\n-Ёр! Мы тебя 3 дня искали! Где ты был?",
            R.drawable.handplecho
        )

        questionsList.add(que49)

        val que50 = Question(
            50, "Вы:\n-Желание загадал…\n",
            R.drawable.handplecho
        )

        questionsList.add(que50)


        val que51 = Question(
            51, "Ирсай:\n-Здравствуйте! Это вы его нашли?\n",
            R.drawable.handplecho
        )

        questionsList.add(que51)


        val que52 = Question(
            52, "Сон:\n-Да я… ",
            R.drawable.azofschool
        )

        questionsList.add(que52)


        val que53 = Question(
            53, "Вы:\nСон огляделся по сторонам.\n",
            R.drawable.azofschool
        )

        questionsList.add(que53)


        val que54 = Question(
            54, "Сон:\n-Какой сейчас год и кто директор школы?\n",
            R.drawable.azschoolhand
        )

        questionsList.add(que54)

        val que55 = Question(
            55, "Вы:\n-2023, наш директор Роут Раит...",
            R.drawable.handplecho
        )

        questionsList.add(que55)

        val que56 = Question(
            56, "Вы:\nСон задумался, а я ещё раз всмотрелся в его лицо, его внешность показалась мне очень знакомой.\n",
            R.drawable.azofschool
        )

        questionsList.add(que56)

        val que57 = Question(
            57, "Вы:\n-Я понял! Вы Аз Раит!\n",
            R.drawable.handplecho
        )

        questionsList.add(que57)

        val que58 = Question(
            58, "Аз:\n-Значит, брат стал директором...",
            R.drawable.azofschoolsmile
        )

        questionsList.add(que58)

        val que59 = Question(
            59, "Вы:\nАз задумался.\n",
            R.drawable.azofschoolsmile
        )

        questionsList.add(que59)

        val que60 = Question(
            60, "Ирсай:\n-Аз Райт! С ума сойти вы уже 100 лет считаетесь пропавшим, где вы нашли друг друга?\n",
            R.drawable.handplecho
        )

        questionsList.add(que60)

        val que61 = Question(
            61, "Вы:\n-В лесу Кэмеко. Аз вы же не собираетесь туда вернуться?\n",
            R.drawable.handplecho
        )

        questionsList.add(que61)

        val que62 = Question(
            62, "Аз:\n-Нет, пойду к брату, я ведь нашёлся.",
            R.drawable.azofschoolsmile
        )

        questionsList.add(que62)

        val que63 = Question(
            63, "Вы:\nАз улыбнулся и пошёл в школу.",
            R.drawable.azofschoolsmile
        )

        questionsList.add(que63)

        val que64 = Question(
            64, "Ирсай:\n-Ёр пойдем, скажем, что ты нашёлся!\n",
            R.drawable.handplecho
        )

        questionsList.add(que64)

        val que65 = Question(
            65, "Вы:\n-Да пошли…\n",
            R.drawable.handplecho
        )

        questionsList.add(que65)


        return questionsList
    }
}