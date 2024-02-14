package scope

open class AirplaneObj {
    protected var type = "airbus"
    internal  fun fly() {
        println("flying")
    }
}


class MyAirplane : AirplaneObj() {
    fun takeOff() {
        println(type)
        fly()
    }
}

class MyCarAir{
    fun start(){
        val airplane = AirplaneObj()
//        println(airplane.type)
        airplane.fly()
    }
}