package type.lazy

import util.getInputText
import kotlin.random.Random

fun generateList(): List<Int> {
    val integers = arrayListOf<Int>()
    for (i in 1..1000)
        integers.add(Random.nextInt(1000))
    return integers
}

fun executeLazyArray() {

    val list by lazy { generateList() }
    println("deberia la lista ser generada, escribir yes or no")
    val input = getInputText()

    if (input == "yes")
        println(list)

}