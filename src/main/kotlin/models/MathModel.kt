package models

class MathModel() {
    fun add(a: Int, b: Int) = a + b
    fun sub(a: Int, b: Int) = a - b
    fun mul(a: Int, b: Int) = a * b
    fun div(a: Int, b: Int) = a / b
}

fun testMathModel() {
    val math = MathModel()
    val valueA = 3
    val valueB = 8

    println(" $valueA + $valueB = ${math.add(valueA, valueB)}")
    println(" $valueA - $valueB = ${math.sub(valueA, valueB)}")
    println(" $valueA * $valueB = ${math.mul(valueA, valueB)}")
    println(" $valueA / $valueB = ${math.div(valueA, valueB)}")

}