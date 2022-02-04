package ru.dudar.composit.domain.usecases

import ru.dudar.composit.domain.entity.Question
import ru.dudar.composit.domain.repository.GameRepository

class GenerateQuestionUseCase(
    private val repository: GameRepository
) {
    operator fun invoke(maxSumValue: Int): Question {
      return repository.generateQustion(maxSumValue, COUNT_OF_OPTIONS)
    }

    private companion object {
        private const val COUNT_OF_OPTIONS = 6
    }
}