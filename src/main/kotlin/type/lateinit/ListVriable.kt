package type.lateinit

lateinit var message: String

fun executeListVariable() {
    var list = listOf(1, 2, 3, 51, 4, 3, 5, 2, 1, 6, 67, 78, 34, 3, 1)
    message = "The chosen prime number is ${selectNumber(list)}"
}

fun selectNumber(primes: List<Int>) = primes.random()