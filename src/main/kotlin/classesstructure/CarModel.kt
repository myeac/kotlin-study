package classesstructure


/* tambien valido!
class CarModel(
    var model: String,
    var newSpeed: Int
) {}
*/

class CarModel {

    var model: String? = null
    var topSpeed = 100

    constructor() {
        model = "no model"
        topSpeed = 150
    }

    constructor(newModel: String) {
        model = newModel
        topSpeed = 150
    }

    constructor(newModel: String, newTopSpeed: Int) {
        model = newModel
        topSpeed = newTopSpeed
    }

}

fun executeCarModel() {
    val myCar = CarModel()
    val yourCar = CarModel("friend model")
    val familyCar = CarModel("family model", 80)
}