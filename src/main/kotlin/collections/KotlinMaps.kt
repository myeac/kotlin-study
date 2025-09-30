package collections

fun kotlinMaps() {

    val m1 = mapOf(
        1 to "alpha",
        2 to "beta",
        3 to "gamma",
        4 to "delta"
    )

    val m2 = mapOf(
        3 to "gamma",
        4 to "delta",
        2 to "beta",
        1 to "alpha"
    )


    println("m1[2] = ${m1[2]}")
    println("m1[5] = ${m1.getOrDefault(5, "no hay")}")

    println()

    val carros = mutableMapOf(
        "ford" to 1903,
        "gm" to 1908,
        "dodge" to 1913,
        "tucker" to 1944
    )
    println(carros)
    carros["tesla"] = 2003
    println(carros)
    println("remover tucker = ${carros.remove("tucker")}")
    println(carros)

    for (key in carros.keys) {
        println("la llave es $key")
    }

}