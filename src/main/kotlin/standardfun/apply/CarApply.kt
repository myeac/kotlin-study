package standardfun.apply

/*
* returns initial object
* common case is applying configuration to a code
* can apply to some function and return a result
* */

class CarApply {
    var speed = 100
    var color = "azul"

    fun startCar() {
        println("$color car has started with $speed speed")
    }
}

fun executeCarApply() {
    val car = CarApply().apply {
        speed = 200
        color = "rojo"
        startCar()
    }
    println(car)
}
