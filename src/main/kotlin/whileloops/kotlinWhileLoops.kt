package whileloops

import getInputNumber

fun exampleWhileLoop() {
    var puzzlePieces = 20
    var piecesPalced = 0

    while (piecesPalced < puzzlePieces) {
        piecesPalced++
        println("La pieza numero #$piecesPalced fueron colocadas")
    }
}

fun printGreetingsTenTimes() {
    var i = 0
    while (i < 10) {
        i++
        println("greetings")
    }
}

fun printHelloForListObjects() {
    val listCats = listOf("tigger", "smokey", "sassy", "patch", "bug")
    var i = 0
    while (i < listCats.size) {
        println("greetings ${listCats[i]}")
        i++
    }
}

fun doFactorialOfNumber() {
    println("ingrese un numero:")
    val number = getInputNumber()
    var factorial = 1
    var result = 1L
    while (factorial <= number) {
        result *= factorial
        factorial++
    }
    println("el factorial de $number es $result")
    println("$number! = $result")
}

fun divisibleNumbersFromInput() {
    println("ingrese un numero:")
    val number = getInputNumber()
    var i = 0
    while (i < number) {
        if (i % 7 == 0) {
            println("$i es divisible entre 7")
        }
        i++
    }
}

