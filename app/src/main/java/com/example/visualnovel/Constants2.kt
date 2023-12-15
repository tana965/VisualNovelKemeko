package com.example.visualnovel

object Constants2 {
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
            1, "Вы:\nЯ долго шёл под уже промокшим одеялом. Увидев свет между деревьев, я побежал к нему. ",
            R.drawable.snowlight
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Вы:\nИ оказался в поле. \n",
            R.drawable.snowpole2
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Вы:\nСбросив одеяло я подбежал к текущей рядом реке и выпил из неё воды и, почувствовав прилив сил, я понял, что это те самые зимние земли. Но как я так быстро до них дошёл?\n",
            R.drawable.riversnow3
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Вы:\nУслышав шаги я обернулся передо мной стоял парень с большой, толстой книгой.\n",
            R.drawable.namestartpolana
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Имя:\n-Я Имя",
            R.drawable.namehead
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Вы:\n-Вы тоже мне поможете? Меня зовут...ааа...Ё… как меня зовут?\n",
            R.drawable.namehead
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Имя:\n-Тебя зовут Ёр, другие это знают, но ты никогда не вспомнишь и не запомнишь. Такие вот дела, я пришел, что бы отдать тебе твоё имя пока не поздно. Забудешь имя, потеряешь стремление вернуться домой.\n",
            R.drawable.namestarthand
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "Вы:\nОн положил ладонь на книгу.",
            R.drawable.namehandbook
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Вы:\nА потом взял мою руку, на ней отпечаталось имя.",
            R.drawable.handtatu
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "Вы:\n-Ты тоже попал в этот лес и не помнишь как?\n",
            R.drawable.namestartpolana
        )

        questionsList.add(que10)

        val que11 = Question(
            11, "Имя:\n-Нет, я сам желаю здесь быть.",
            R.drawable.namestartpolana
        )

        questionsList.add(que11)

        val que12 = Question(
            12, "Вы:\n-Кэмеко отпустит меня?\n\n",
            R.drawable.namestarthand
        )

        questionsList.add(que12)

        val que13 = Question(
            13, "Вы:\nИмя опустил голову и молча испарился в воздухе. \n\n",
            R.drawable.namehead
        )

        questionsList.add(que13)

        val que14 = Question(
            14, "Вы:\nЯ понял, что имя очень важная вещь.\n\n",
            R.drawable.nameaway
        )

        questionsList.add(que14)

        val que15 = Question(
            15, "Вы:\nБоясь что имя на моей руке исчезнет я взял камень, нацарапал его на нём и отправился дальше вдоль реки.\n\n",
            R.drawable.rock
        )

        questionsList.add(que15)

        val que16 = Question(
            16, "...\n",
            R.drawable.snowway
        )

        questionsList.add(que16)

        val que17 = Question(
            17, "...",
            R.drawable.way1
        )

        questionsList.add(que17)

        val que18 = Question(
            18, "...\n",
            R.drawable.way2
        )

        questionsList.add(que18)

        val que19 = Question(
            19, "...",
            R.drawable.way3
        )

        questionsList.add(que19)

        val que20 = Question(
            20, "Вы:\nМои ноги болели, я сел на камень отдохнуть.",
            R.drawable.blackforest
        )

        questionsList.add(que20)

        val que21 = Question(
            21, "???:\n-Ёр!\n",
            R.drawable.monster
        )

        questionsList.add(que21)

        val que22 = Question(
            22, "Вы:\nЯ поднял голову и увидел монстрика.\n",
            R.drawable.monster2
        )

        questionsList.add(que22)

        val que23 = Question(
            23, "Вы:\n-А вы ещё кто?!",
            R.drawable.monster
        )

        questionsList.add(que23)
        val que24 = Question(
            24, "???:\n-Я никто у меня нет имени, но если ты отдашь мне своё, я отведу тебя к Кэмеко.",
            R.drawable.monster2
        )

        questionsList.add(que24)
        val que25 = Question(
            25, "Вы:\nМонстрик улыбнулся.\n",
            R.drawable.monstersmile
        )

        questionsList.add(que25)
        val que26 = Question(
            26, "Вы:\n-Откуда ты знаешь, что я его ищу и зачем тебе моё имя?!\n",
            R.drawable.monstersmile
        )

        questionsList.add(que26)
        val que27 = Question(
            27, "Вы:\nЯ встал на ноги и отошёл от существа.\n",
            R.drawable.monsterway
        )

        questionsList.add(que27)

        val que28 = Question(
            28, "???:\n-Я могу передумать!\n",
            R.drawable.monsterway
        )

        questionsList.add(que28)


        val que29 = Question(
            29, "Вы:\nЯ понимал, что имя отдавать нельзя и решил рискнуть.",
            R.drawable.monsterway
        )

        questionsList.add(que29)


        val que30 = Question(
            30, "Вы:\n-Смотри вот моё имя.\n",
            R.drawable.monsterway
        )

        questionsList.add(que30)


        val que31 = Question(
            31, "Вы:\nЯ показал ему камень. Глаза существа расширились и из него потянулись маленькие тоненькие ручки.\n",
            R.drawable.monsterhand
        )

        questionsList.add(que31)


        val que32 = Question(
            32, "???:\n-Имя....имяяяя...Мугагагага!!!\n",
            R.drawable.monsterhand2
        )

        questionsList.add(que32)


        val que33 = Question(
            33, "Вы:\nМолния ударила в землю. ",
            R.drawable.blackmolnia
        )

        questionsList.add(que33)


        val que34 = Question(
            34, "...",
            R.drawable.blackmolnia2
        )

        questionsList.add(que34)


        val que35 = Question(
            35, "Вы:\nЯ упал и сильно ударился головой. Повезло, что существо не знало, как выглядит имя на самом деле. Оно перенесло меня в красивое волшебное место. Рядом лил водопад и посреди него сидел парень. Я подошёл к самому берегу.\n",
            R.drawable.waterfall
        )

        questionsList.add(que35)


        val que36 = Question(
            36, "Вы:\n-Вы Кэмеко?\n",
            R.drawable.kemekosit
        )

        questionsList.add(que36)

        val que37 = Question(
            37, "???:\n-А где здравствуйте?\n",
            R.drawable.kemekosit
        )

        questionsList.add(que37)

        val que38 = Question(
            38, "Вы:\n-Здравствуйте!\n",
            R.drawable.kemekosit
        )

        questionsList.add(que38)

        val que39 = Question(
            39, "Вы:\nКэмеко поднялся с камня и пошёл ко мне по воде.",
            R.drawable.waterfall2
        )

        questionsList.add(que39)

        val que40 = Question(
            40, "Кэмеко:\n-Я тут слышал, что ты домой хочешь, а ты уверен, что тебе это надо?\n",
            R.drawable.kemeko1
        )

        questionsList.add(que40)

        val que41 = Question(
            41, "Вы:\n-Да!\n",
            R.drawable.kemeko1
        )

        questionsList.add(que41)

        val que42 = Question(
            42, "Вы:\nКэмеко улыбнулся",
            R.drawable.kemekosmile
        )

        questionsList.add(que42)

        val que43 = Question(
            43, "Кэмеко:\n-Когда вернёшься и вспомнишь, будет очень грустно. Я ведь знаю, как ты сюда попал...",
            R.drawable.kemekosmile
        )

        questionsList.add(que43)

        val que44 = Question(
            44, "Вы:\n-Я хочу домой, не хочу быть как Сон и странный монстрик.\n",
            R.drawable.kemekosmile
        )

        questionsList.add(que44)


        val que45 = Question(
            45, "Кэмеко:\n-Монстрик наказан, хорошо, что ты не отдал ему своё имя. Ну, я тебя предупредил... загадывай желание.",
            R.drawable.kemeko3
        )

        questionsList.add(que45)


        val que46 = Question(
            46, "Вы:\n-Я хочу вернуться домой.",
            R.drawable.kemeko3
        )

        questionsList.add(que46)


        val que47 = Question(
            47, "Вы:\nКэмеко хлопнул ладонями, и земля ушла у меня из под ног.",
            R.drawable.kemekohlop
        )

        questionsList.add(que47)


        val que48 = Question(
            48, "...",
            R.drawable.kemekohlop2
        )

        questionsList.add(que48)


        val que49 = Question(
            49, "Вы:\nЯ приземлился у ворот школы.",
            R.drawable.schoolenter
        )

        questionsList.add(que49)

        val que50 = Question(
            50, "Вы:\nЯ ВСПОМНИЛ ВСЁ",
            R.drawable.schoolenter
        )

        questionsList.add(que50)


        val que51 = Question(
            51, "Вы:\n-У Кэмеко можно загадать желание он его исполнит! ",
            R.drawable.book
        )

        questionsList.add(que51)


        val que52 = Question(
            52, "Ирсай:\n-Прочти то, что написано маленькими буквами «попадая туда можно всё забыть»!\n",
            R.drawable.book
        )

        questionsList.add(que52)


        val que53 = Question(
            53, "Вы:\nНа моё плечо легла рука.\n",
            R.drawable.handplecho
        )

        questionsList.add(que53)


        val que54 = Question(
            54, "Ирсай:\n-Ёр! Мы тебя 3 дня искали! Где ты был?\n",
            R.drawable.handplecho
        )

        questionsList.add(que54)

        val que55 = Question(
            55, "Вы:\n-Желание загадал…\n",
            R.drawable.handplecho
        )

        questionsList.add(que55)

        val que56 = Question(
            56, "...",
            R.drawable.handplecho
        )

        questionsList.add(que56)



        return questionsList
    }
}