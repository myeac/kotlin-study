package breaks

import getInputNumber
import getInputText
import isNumeric

//continue stops te iteration, an continues with the next one
fun continueIteratorFor() {
    var onlyNumbers = arrayListOf(2, 4, 6, 7, 10, 12)
    for (number in onlyNumbers) {
        if (number % 2 != 0)
            continue
        println("half of $number is ${number / 2}")
    }
}

fun greetingsWithContinue() {
    val clients = listOf("anna", "bob", "carol", "david")
    println("print a greetings for each name on the list")
    for (client in clients) {
        if (client.startsWith("c"))
            continue
        println("greetings $client")
    }
}

fun clubPassAgeFilter() {
    do {
        print("escribir la edad de la persona: ")
        var inputText = getInputText()
        if (inputText.isNumeric()) {
            val clientAge = inputText.toInt()
            when {
                clientAge >= 18 -> println("welcome client")
                clientAge < 18 -> {
                    println("client not allowed")
                    continue
                }
            }
        } else if (inputText.contains("stop")) {
            break
        } else {
            println("ingrese un numero valido")
        }
    } while (true)
}