package standardfun.take

import util.arrayListOfNames
import util.arrayListOfNumbersInt

fun executeListOfNumbers() {

    val listOfNumbers = arrayListOfNumbersInt
    print(listOfNumbers)

    val newNumbers = arrayListOf<Int>()
    for (number in listOfNumbers) {
        number.takeIf { it % 2 == 0 }
            ?.let { newNumbers.add(it) }
    }
}

fun executeListOfNames() {
    val clients = arrayListOfNames
    println(clients)
    val newClients = arrayListOf<String>()
    for (client in clients) {
        client.takeUnless { it[0] == 'A' }
            ?.let { newClients.add(it) }
    }
    println(newClients)
}