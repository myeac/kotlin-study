package classestypes.getsetters

class CarForRent() {

    var name = ""
    var speed: Int
        get() = 50
        set(value) {
            name = "High speed car $value"
            //puede ser llamado con field
        }

}

/*
*       var customInfo: Int
*               get() = //DO SOMETHING
*               set(value) {
*                   //DO SOMETHING
*                   //PUEDE TENER CONDICIONES O ACCIONAR LISTENERS
*               }
* */

fun callCarForRent() {

    val myCarRent = CarForRent()
    myCarRent.speed = 100
    println("myCar name: ${myCarRent.name}")
    println("myCar speeed: ${myCarRent.speed}")

}