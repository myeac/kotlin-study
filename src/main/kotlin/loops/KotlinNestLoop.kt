package loops

import getInputNumber

fun nestedLoop() {
    for (i in 1..5) {
        for (j in 1..5) {
            println("los numeros son $i y $j")
            val suma = i + j
            println("la suma es $suma")
        }
    }
}

fun nestedLoopTab() {
    for (i in 1..5) {
        for (j in 1..5) {
            print("$i,$j \t")
        }
        println()
    }
}

fun nestedLoopExtended() {
    println("ingerse un numero:")
    val maxValue = getInputNumber()

    for (i in maxValue downTo 0) {
        if (i % 7 == 0) {
            println("numero $i es divisible entre 7")
        }
    }
}

fun nestedLoopHappyFaceTower() {
    for (row in 1..10) {
        for (colunm in 1..row) {
            print(":D ")
        }
        println()
    }
}

fun nestedLoopExtendedRows() {
    println("por favor ingresse un numero")
    val numberMatrix = getInputNumber()
    for (row in 1..numberMatrix) {
        for (column in 1..numberMatrix) {
            when (row * column % 3 ){
               0 -> { print(" >:) ") }
               1 -> { print(" >:D ") }
               2 -> { print(" >:( ") }
            }
        }
        println()
    }
}