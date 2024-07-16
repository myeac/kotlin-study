package data_enum

import data_enum.GameStatesEnum.STARTED
import data_enum.GameStatesEnum.PLAYING
import data_enum.GameStatesEnum.GAMEOVER

enum class GameStatesEnum() {
    STARTED,
    PLAYING,
    GAMEOVER
}

fun executeGAmeStatesEnum() {
    var currentState = STARTED
    for (i in 1..30) {
        println("${currentState.ordinal + 1}. $currentState")
        currentState = changeGameSTate(currentState)
    }
}

private fun changeGameSTate(
    currentGameState: GameStatesEnum,
): GameStatesEnum {
    return when (currentGameState) {
        STARTED -> PLAYING
        PLAYING -> STARTED
        GAMEOVER -> STARTED
    }
}