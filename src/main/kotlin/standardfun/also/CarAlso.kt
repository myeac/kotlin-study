package standardfun.also

/*
* also
* perfom aditional actions on an object
* DOESNT RETURN a thing
* DOESNT affect the object
* remove and ALSO BLOCK, wont affect the program
* */

class CarAlso() {
    var speed = 100
    var color = "azul"

    fun startCar() {
        println("$color car has started with $speed speed")
    }
}

fun executeCarAlso() {
    CarAlso().apply {
        speed = 200
        startCar()
        println("car is running")
    }.also {
        println("car has been started")
        println("Car info: speed = ${it.speed}")
    }
}