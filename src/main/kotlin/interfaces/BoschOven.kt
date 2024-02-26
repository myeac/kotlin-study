package interfaces

class BoschOven : Oven {

    override val temperature: Int = 180

    override fun turnOff() {
        println("oven was turn off")
    }

    override fun turnOn() {
        println("oven was turn on")
    }

}

fun executeBoschOven(){
    val myOven: Oven = BoschOven()
    myOven.turnOn()
    myOven.cook(130)
    myOven.turnOff()
}