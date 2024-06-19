package standardfun.run

//invokes as an extension function
//useful for lambda that returns result

fun executeCarRun() {
    CarRun().run {
        speed = 90
        drive()
        println("car is driving")
        this
    }

    run {
        val car = CarRun()
        car.speed = 90
        car.drive()
        println("car is driving")
    }
}

class CarRun() {
    var speed = 0
    fun drive() {
        println("car is driving at $speed")
    }
}