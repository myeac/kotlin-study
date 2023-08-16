package lambdas

import arrayListOfNames

fun executeLambdaHighOrders() {

    println("lista inicial")
    println(arrayListOfNames)

    println("\nexample with --- forEach")
    lambdaWithForEach()
    println("\nexample with --- filter")
    lambdaWithFilter()
    println("\nexample with --- map")
    lambdaClientsList()
    println("\nexample with --- sortedBy")
    lambdaSortByList()
    println("\nexample with --- maxBy")
    lambdaMaxBy()
}

fun lambdaWithForEach() {
    arrayListOfNames.forEach { println("Hello $it") }
}

fun lambdaWithFilter() {
    arrayListOfNames
        .filter { it.length < 5 }
        .forEach { println("Holaaaa $it") }
}

fun lambdaClientsList() {
    var clients = arrayListOfNames
    val size = clients.map { it.length }
    println(size)
}

fun lambdaSortByList() {
    val sorted = arrayListOfNames.sortedBy { it.length }
    println(sorted)
}

fun lambdaMaxBy() {
    val max = arrayListOfNames.maxBy { it.length }
    println(max)
}


