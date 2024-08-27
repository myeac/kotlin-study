package type_cast

/*
as - checks whenever an object is of a certain type
 */

open class CarAs {}
class BMWAs : CarAs() {
    fun drive() {
        println("driving my BMW")
    }
}

fun getCarAs(): CarAs = CarAs()

fun executeAsType() {
    val myCar: CarAs = getCarAs()

    val bmwCar = myCar as? BMWAs
    bmwCar?.drive()
}
