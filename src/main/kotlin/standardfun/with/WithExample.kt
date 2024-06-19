package standardfun.with

//performs a block of code on an object
//can access obj and variables

fun executeWithCar() {
    with(Car()) {
        speed = 90
        drive()
        println("car is driving")
    }
}

class Car {
    var speed = 50
    fun drive() {
        println("driving at $speed")
    }
}