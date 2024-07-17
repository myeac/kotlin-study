package data_study.data_sealed

import kotlin.random.Random

sealed class Price

sealed class CarPrice : Price()

sealed class Vacation : Price()

sealed class GiftCard : Price()

class Toyota : CarPrice()

class FranceHoliday : Vacation()

class Dolar10 : GiftCard()

fun executePriceSealed() {
    for (i in 1..10) {
        val prize = returnPrice()
        when (prize) {
            is CarPrice -> println("you win car!")
            is Vacation -> println("you win vacation!")
            is GiftCard -> println("you win gift card!")
        }
    }
}

fun returnPrice(): Price {
    val randomPrice = Random.nextInt(3)
    return when (randomPrice) {
        0 -> Toyota()
        1 -> FranceHoliday()
        else -> Dolar10()
    }
}