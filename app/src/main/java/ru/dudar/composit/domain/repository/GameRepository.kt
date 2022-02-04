package ru.dudar.composit.domain.repository

import ru.dudar.composit.domain.entity.GameSettings
import ru.dudar.composit.domain.entity.Level
import ru.dudar.composit.domain.entity.Question

interface GameRepository {

    fun generateQustion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings



}