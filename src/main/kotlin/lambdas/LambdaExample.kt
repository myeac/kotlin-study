package lambdas

import arrayListOfNames
import arrayListOfNumbersInt
import listOfNumbersIntThreeDigits
import setOfNumbersInt

fun printDoubleIntegerDigits() {
    val numbers = setOfNumbersInt
    println(numbers.filter { it in 10..99 })
}

fun listOfClientSortedLastLetter() {
    val listClient = arrayListOfNames
    val sorted = listClient
        .sortedBy { it[it.length - 1] }
}


fun threeDigitIntegerPrintMiddle() {
    val listInts = listOfNumbersIntThreeDigits
    println(listInts.maxBy {
        it.toString()[1].digitToInt()
    })
    println(listInts.maxBy { it / 10 % 10 })
}

//odd number - double it
//even number - half it
fun mathTheList() {
    var listNumbers = arrayListOfNumbersInt
    val filteredList = listNumbers.map {
        if (it % 2 == 0) {
            it / 2
        } else {
            it * 2
        }
    }.filter { it > 25 }
    println(filteredList)
}