package expressions

fun expressionIf() {

    val bigger = 1001
    val smaller = 1000

    val max = if (bigger > smaller) bigger else smaller

    if (bigger > 1000) {
        println("el numero $bigger es mas grande que 1000")
    } else if (bigger > 900) {
        println("el numero $bigger es mas grande que 900")
    } else if (bigger > 600) {
        println("el numero $bigger es mas grande que 600")
    } else if (bigger > 200) {
        println("el numero $bigger es mas grande que 200")
    } else {
        println("el numero $bigger no es grande")
    }

    val anyNumberExample: Any = if (bigger > 1000) {
        println("menor que 1000")
        "es texto! es mayor que 1000"
    } else if (bigger > 900) {
        println("menor que 900")
        900
    } else if (bigger > 600) {
        println("menor que 600")
        600
    } else if (bigger > 200) {
        println("menor que 200")
    } else {
        0
    }

    println("el valor sera ---> $anyNumberExample")

}