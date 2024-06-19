package interfaces

interface Oven {
    val temperature: Int

    fun turnOff()
    fun turnOn()
    fun cook(temp: Int) {
        println("Cooking at $temp degrees")
    }
}

fun executeOven() {

    val oven: Oven? = null
    oven?.turnOn()
    oven?.turnOff()
    oven?.cook(130)

}