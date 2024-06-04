package standardfun.let

fun convertNumber() {
    println("input a number")
    val input = readlnOrNull()
    input?.let {
        val number = it.toInt()
        println("The double of your number is ${number * 2}")
    }
}