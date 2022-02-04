package ru.dudar.composit.domain.entity

data class GameSettings (
    val maxSumValue: Int,
    val minCountOfRightAnswers: Int,
    val minPersentRightAnswers: Int,
    val gameTimerSeconds: Int

)