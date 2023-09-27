package inheritance

open class Laptop {
    var screenSize = 15
    val speed = 1200
    var name = "laptop"
    fun run() {
        println("running laptop $name with screen size $screenSize and speed $speed")
    }
}

class Apple : Laptop() {}


fun runMyLaptop() {
    val myLaptop = Laptop()
    val myApple = Apple()

    myApple.screenSize = 13
    myApple.name = "Apple Macbook"

    myLaptop.run()
    myApple.run()
}