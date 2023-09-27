package objects

class Table {
    var color: String = "white"
}

class MyCar {
    fun drive() {
        println("driving along in my car")
    }
}

class Garage() {
    val car = MyCar()
}

fun runAnimalClass() {
    val table = Table()
    println(table.color)

    val myGarage = Garage()
    myGarage.car.drive()
}