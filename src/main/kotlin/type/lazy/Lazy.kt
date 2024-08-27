package type.lazy

import kotlin.random.Random

/*
lazy variables are variables taht are initialzied when needed
useful to save memory in case the variable is never accessed
 */


fun executeLazy() {
    val someLargeVariable: String by lazy {
        "Some large variable"
    }
    if (Random.nextInt() % 2 == 0) {
        println(someLargeVariable)
    }
}