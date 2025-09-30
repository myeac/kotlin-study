package whileloops

import getInputNumber
import getInputText

fun inputNumberUntil() {
    var inputNumber = 0
    println("write a number: ")
    do {
        inputNumber = getInputNumber()
        println("number is $inputNumber")
    } while (inputNumber < 100)
    println("program finished")
}

fun inputNumberFactorial() {
    var shouldFinish = false
    val maxNumber = 3000000
    println("write a number: ")
    do {
        var inputNumber = getInputNumber()
        var factorial = 1
        for (a in 1..inputNumber) {
            factorial *= a
            println("exc factorial - $a! - $factorial")
        }
        if (factorial >= maxNumber)
            shouldFinish = !shouldFinish
        if (shouldFinish)
            println("fin del flujo!")
        else
            println("Ingrese un nuevo numero")
    } while (!shouldFinish)
}

fun usernamesSetUp() {
    val userNames = hashSetOf("john", "bob", "alice")
    var isFinished = false

    do {
        val userName = getInputText()
        if (userNames.contains(userName)) {
            println("$userName is taken, please try again")
        } else {
            isFinished = !isFinished
            println("username $userName was added to the list")
            userNames.add(userName)
        }
    } while (!isFinished)
    println(userNames)
}