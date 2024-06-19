package classestypes.companionobj

class CarCompanion {

    //codigo estatico - static code
    //codigo de la clase disponible sin la necesidad de crear el objeto
    companion object {
        fun getDrivingInstructions(): String {
            return "DriveSafe"
        }
    }

}

fun callCarCompanionObj() {
    println(CarCompanion.getDrivingInstructions())
}