package standardfun.take

import kotlin.random.Random

/*
* return s the object if the predicate values to false
* otherwise returns null
* */

fun executeTakeUnless() {
    val number = Random.nextInt(100)
    val oddOrNull = number.takeUnless { it % 2 == 0 }

    println("the number is $number")
    println("the even number is $oddOrNull")
}