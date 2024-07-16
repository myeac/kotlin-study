package standardfun.also

class CarNote(){
    fun buildCar(){
        println("car is builded")
    }
}

fun executeCarNote(){
    CarNote().apply {
        buildCar()
    }.also {
        println("LOG: build de car $it")
        println("Send message to police that car $it has been build")
    }
}