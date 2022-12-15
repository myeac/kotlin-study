package collections


fun kotlinSets() {

    val threes = setOf(3, 3, 3, 3, 3, 3)
    val setOfNumbers = setOf(3, 1, 2, 3, 4, 5, 6, 9, 9)

    println(threes)
    println(setOfNumbers)

    println("el set de numeros, tiene 69?? ${setOfNumbers.contains(69)}")
    println("tamaño del set de numeros es ${setOfNumbers.size} ")

    val pMutableSet = mutableSetOf(1, 2, 43, 5, 23, 24, 553, 2, 324, 5)
    val rMutableSet = mutableSetOf(1, 2, 46, 43, 2, 5, 67, 2, 5)

    println("primeros son iguales? ${pMutableSet.first() == rMutableSet.first()}")
    println("ultimos son iguales? ${pMutableSet.last() == rMutableSet.last()}")

    println()

    println("adicionado el 69??? ${pMutableSet.add(69)}")
    println("nueva lista: $pMutableSet")
    println("removido el 234?? ${pMutableSet.remove(234)}")
    println("nueva lista: $pMutableSet")


    val setToList = rMutableSet.toList()

}