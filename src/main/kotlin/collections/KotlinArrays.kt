package collections

fun kotlinArrays() {

    val things = arrayOf(1, 2, 3, 4, "text", "hola", "chau")

    val firstOne = things[0]

    for (i in things) {
        println("objeto es $i")
    }

    val numerosArrays = arrayOf<Int>(1, 2, 3, 4, 5, 7, 39132)
    numerosArrays[0] = 69
    for (i in numerosArrays)
        println(i)

    val emptyArray = arrayOf<Int>()

    val cincosArray = Array(5, ::multiplicarPor)
    cincosArray.forEach {
        println("imprimir con foreach cada numero: $it")
    }
    println("el array CincosArray tiene ${cincosArray.size} elementos")
    println("el array CincosArray tiene ${cincosArray.indices} indices")
    println("CincosArray ultimo indice es ${cincosArray.lastIndex} ")
    println("el array emptyArray tiene ${emptyArray.indices} indices")

}

fun multiplicarPor(multipo: Int) = multipo * 5