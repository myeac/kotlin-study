package standardfun.run

fun executeLaptop() {
    Laptop().run {
        turnOn()
        turnOff()
        turnOn()
    }
}

class Laptop {
    fun turnOn() {
        println("turning laptop  ON")
    }

    fun turnOff() {
        println("turning laptop OFF")
    }
}