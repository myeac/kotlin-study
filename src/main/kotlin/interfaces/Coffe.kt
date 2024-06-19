package interfaces

interface Coffee {
    var type: String
    fun wakeUp()
    fun quenchThirst()
}

class Arabica : Coffee {
    override var type: String = "Arabica"

    override fun wakeUp() {
        println("waking you up with some Arabica")
    }

    override fun quenchThirst() {
        println("Quenching your arabia thirst")
    }
}

class Robusta : Coffee {
    override var type: String = "Robusta"

    override fun wakeUp() {
        println("waking you up with some Robusta")
    }

    override fun quenchThirst() {
        println("Robusta will quench your thirst for coffee")
    }
}

class CoffeeShop {
    fun purchaseCoffee(): Coffee {
        val randomNumber = System.currentTimeMillis()
        return if (randomNumber % 2 == 0L)
            Arabica()
        else
            Robusta()
    }
}

fun executeCoffee() {
    val myCoffeeShop = CoffeeShop()
    var myCoffee: Coffee? = null

    for (i in 1..5) {
        myCoffee = myCoffeeShop.purchaseCoffee()
        myCoffee.wakeUp()
        myCoffee.quenchThirst()
    }
}