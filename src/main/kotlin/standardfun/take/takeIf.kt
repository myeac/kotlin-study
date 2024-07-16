package standardfun.take

import kotlin.random.Random

/*
* returns object if the predicate values to true
* otherwhise returns nulls
* */

fun executeTakeIf() {
    val number = Random.nextInt(100)
    val evenOrNull = number.takeIf { it % 2 == 0 }

    println("the number is $number")
    println("the even number is $evenOrNull")
}