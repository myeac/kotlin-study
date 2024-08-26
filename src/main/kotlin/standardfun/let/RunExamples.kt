package standardfun.let

import util.arrayListAnimals

fun runLetExample() {
    val list = arrayListAnimals
    list.map { it.length }
        .filter { it > 3 }
        .let { filterList ->
            println(filterList)
            println("Size of list is ${filterList.size}")
        }
}

//reference is ::println
fun runReferenceExample() {
    val list = arrayListAnimals
    list.map { it.length }
        .filter { it > 3 }
        .let(::println)
}

//non-null values
fun runNonNullValueExample() {
    val name = readlnOrNull()
    name?.let { println("Your name is $name") }
    name?.let(::println)
}