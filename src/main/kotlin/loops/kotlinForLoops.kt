fun expressionsForLoop() {

    val animals = arrayListOf("cat", "dog", "mouse", "bear")
    for (animal in animals) {
        println("alimentar al: $animal")
    }
}

fun expressionRangesInForLoops() {
    for (i in 1..12) {
        val month = when (i) {
            1 -> "enero"
            2 -> "febrero"
            3 -> "marzo"
            4 -> "abril"
            5 -> "mayo"
            6 -> "junio"
            7 -> "julio"
            8 -> "agosto"
            9 -> "setiembre"
            10 -> "octubre"
            11 -> "noviembre"
            12 -> "diciembre"
            else -> ""
        }
        println("el mes $month es el numero $i")
    }

}

fun expressionForLoopsPractice() {

    for (i in 1..10) {
        println("el numero es $i")
    }

}

fun expressionForLoopsPracticeLine() {

    var sumNumber = 0
    for (i in 1..100) {
        val sumActual = sumNumber
        sumNumber += i
        println("sumar $i al numero $sumActual da un total de $sumNumber")
    }
    println("valor final - $sumNumber")
}

fun expressionForLoopWithHash() {

    val customers = hashMapOf(
        Pair("Alice", 4),
        Pair("Judy", 8),
        Pair("Anna", 6),
        Pair("Fabia", 12)
    )
    for (name in customers.keys) {
        val items = customers[name]
        println("$name ha comprado $items")
    }
}

fun expressionForLoopsExerciseYearDays() {
    println("ingresa un año con formato YYYY: ")
    val inputYear = readlnOrNull()?.toInt() ?: 2020

    for (i in 1..12) {
        val message = when (i) {
            1 -> "tiene 31 dias"
            2 -> if (inputYear % 4 == 0) "tiene 29 dias" else "tiene 28 dias"
            3 -> "tiene 31 dias"
            4 -> "tiene 30 dias"
            5 -> "tiene 31 dias"
            6 -> "tiene 30 dias"
            7 -> "tiene 31 dias"
            8 -> "tiene 31 dias"
            9 -> "tiene 30 dias"
            10 -> "tiene 31 dias"
            11 -> "tiene 30 dias"
            12 -> "tiene 31 dias"
            else -> ""
        }
        println(message)
    }
}

fun expressionForLoopsString() {
    for (i in 1..5) {
        println("String #$i")
    }
    println("finalizo el loop")
}

//todo-important
fun expressionLoopsAscending() {
    println("selecciona un numero:")
    val numero = getInputNumber()
    var suma = 0
    for (i in 0..numero) {
        suma += i
        println("en la posicion $i la suma es $suma")
    }
    println("la suma total es: $suma")
}

//todo-important
fun expressionLoopsDescending() {
    println("selecciona un numero:")
    val numero = getInputNumber()
    var suma = 0
    for (i in numero downTo 0) {
        suma += i
        println("en la posicion $i la suma es $suma")
    }
    println("la suma total es: $suma")
}

//todo-important
fun expressionLoopsDescendingStep() {
    println("ingrese un numero:")
    val numero = getInputNumber()
    println("ingrese un paso:")
    val pasos = getInputNumber()
    println("lista descendente del numero $numero con pasos $pasos es:")
    for (i in numero downTo 0 step pasos) {
        println("el numero es $i")
    }
}

