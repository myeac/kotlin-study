package standardfun.apply


class CoffeeShop() {
    fun sellCoffeeName(name: String) {
        CoffeCup().apply {
            clientName = name
            preparedCoffee()
            println("Serving coffee to client $name")
            println(this)
        }
    }
}

class CoffeCup() {
    var clientName = ""
    fun preparedCoffee() {
        println("coffee being prepared")
    }
}

fun executeCoffee() {
    println("whats your name")
    val name = readlnOrNull() ?: "sin nombre"
    CoffeeShop().sellCoffeeName(name)
}