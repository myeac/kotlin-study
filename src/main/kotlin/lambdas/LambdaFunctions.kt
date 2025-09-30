package lambdas

//no puede ser asignado avariables
//fun en el camino, para enviar otra funcion

fun exampleLambda() {
    val myLamda = { name: String -> println("Hello $name") }
}

//HOF - High Order Function
//es una funcion QUE TIENE COMO PARAMETRO OTRA FUNCION
/*

    EJEMPLOS

    val names = arrayListOfStrings
    val myLambda = { name: String -> println("Hello there $name") }
    exampleHighOrder(names, myLambda)

    or

    val names = arrayListOfStrings
    exampleHighOrder(names, { name: String -> println("Hello there $name") })

    or

    val names = arrayListOfStrings
    exampleHighOrder(names) { name: String -> println("Hello there $name") }

    or

    exampleHighOrder(arrayListOfStrings) { name: String -> println("Hello there $name") }

* */
fun exampleHighOrder(
    names: ArrayList<String>,
    doSmethings: (String) -> Unit
) {
    for (name in names) {
        doSmethings(name)
    }
}

//val newNumbers = updateListOfNumbers(arrayListOfNumbersInt) { number -> number / 10 }
fun updateListOfNumbers(
    numbers: ArrayList<Int>,
    lbd: (Int) -> Int
): ArrayList<Int> {

    for (i in 0 until numbers.size) {
        if (numbers[i] % 2 == 0)
            numbers[i] = lbd(numbers[i])
    }
    return numbers
}

//val messages = getMessagesLambda(arrayListOfNames) { name -> "Hello $name com estas??" }
fun getMessagesLambda(
    clients: Collection<String>,
    getmessage: (String) -> String
): ArrayList<String> {
    val messages = arrayListOf<String>()
    for (client in clients) {
        messages.add(getmessage(client))
    }
    return messages
}

