package expressions

fun whenConditionalExample() {

    val animal = "cat"
    var action: String = ""
    when (animal) {
        "cat" -> action = "pet it"
        "dog" -> action = "feed it"
        else -> action = "google it"
    }
    println("when you meet a $animal you should $action")
}

fun nwhenConditionalNumbers() {

    var result = ""
    val number = 2342
    when (number % 2) {
        0 -> result = "nmvber is even"
        1 -> result = "nmvber is odd"
    }
    println("el mensaje es: $result")
}

fun whenConditionMonths() {

    val month = "January"
    val days = when (month) {
        "January", "March", "May" -> 31
        "February" -> 28
        else -> 30
    }
}

fun whenConditionBetweenRange() {

    val name = "michelle"
    when (val length = name.length) {
        in 1..5 -> println("el nombre tiene $length y es corto")
        in 6..10 -> println("el nobmre tiene $length y es medio")
        else -> println("el nombre tiene $length y es largo")
    }
}

fun whenConditionalExercise() {

    println("cuantas comidas tienes al dia? - ")
    val numberMeals = readln().toIntOrNull() ?: 3

    when (numberMeals) {
        in 0..2 -> println("deberias de comer mas")
        3 -> println("esta ok")
        else -> println("debes comer menos")
    }
}


fun whenConditionalTimeDay() {

    println("ingrese una hora en punto (0-23): ")
    val hour = readln().toIntOrNull() ?: 12
    val statusDay = when (hour) {
        in 6..11 -> "amanecer"
        in 12..14 -> "medio dia"
        in 15..17 -> "tarde"
        in 18..21 -> "noche"
        in 22..23, in 0..5 -> "madrugada"
        else -> "numero errado"
    }

    println("el resultado de la hora es: $hour:00 y es $statusDay")
}

fun whenConditionalNameString() {
    println("usuario, por favor escribe tu nombre: ")
    val name = readlnOrNull() ?: ""
    val message = when (name[0].toString()) {
        "a", "b", "c" -> "tienes la letra A, B o C en la primera letra de tu nombre"
        "d", "e", "f" -> "tienes la letra D, E o F en la primera letra de tu nombre"
        else -> "tienes una letra diferentes"
    }
    println(message)

}

fun whenConditionalNameChar() {
    println("usuario, por favor escribe tu nombre: ")
    val name = readlnOrNull() ?: "miguel"
    val message = when (name[0]) {
        'a', 'b', 'c' -> "$name - olis"
        in 'd'..'f' -> "$name - que pedo we?"
        else -> "$name - tienes que pagar entrada"
    }
    println(message)

}


