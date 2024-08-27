package type_cast

/*
is - checks whenever an object is of a certain type
 */

fun executeCheckIs() {
    val value = "name"
    if (value is String)
        println("this string has ${value.length} characters")
}

open class CarIs {}
class BMW : CarIs() {
    fun drive() {
        println("driving my BMW")
    }
}

fun getCarIs(): CarIs = CarIs()

fun executeCheckNotIs() {
    val myCar: CarIs = getCarIs()
    if (myCar !is BMW)
        println("this is not my favorite brand")

    if (myCar is BMW)
        myCar.drive()
}
