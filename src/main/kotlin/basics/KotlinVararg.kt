package basics

//sayHello("alicia", "pepe", "pedro", "kanchi", "fiona", "dan")
fun sayHello(vararg names: String) {
    for (name in names) {
        println("Hello $name")
    }
}

//sumOfInteger(2,45,3,1,5,7,8,3,21,3)
//sumOfInteger(32,3,4,5,67,1,5,0,1,3,5,7,12)
fun sumOfInteger(vararg numbers: Int) {
    var sum = 0
    for (number in numbers) {
        sum = sum + number
    }
    println("the sum of numbers is $sum")
}

//printHelloNames(5, "Mary", "jhon", "alex")
fun printHelloNames(count: Int, vararg names: String) {
    for (name in names) {
        for (i in 1..count) {
            print("hello $name - ")
        }
        println()
    }
}