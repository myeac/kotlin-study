package inheritance


open class Airplane() {
    var name = "Generic Airplane"
    var speed = 1000
    var altitude = 2000

    fun ascend() {
        altitude += 1000
        println("$name has altitude of $altitude and seped $speed")
    }

    fun descend() {
        altitude -= 1000
        println("$name has altitude of $altitude and seped $speed")
    }
}

class Boeing : Airplane() {}

class Airbus : Airplane() {}


fun executeAirplane() {
    val boeing737 = Boeing()
    val a320 = Airbus()

    boeing737.speed = 700
    a320.speed = 800

    boeing737.name = "boeing 737"
    a320.name = "airbus a320"

    boeing737.ascend()
    a320.descend()
    boeing737.descend()
    a320.ascend()
    a320.ascend()
    a320.descend()
    boeing737.ascend()

}
