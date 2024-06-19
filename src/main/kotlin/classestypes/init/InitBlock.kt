package classestypes.init

class InitBlock {

    var model:String? = "no model"
    var topSpeed = 100

    init {
        println("El modelo $model tiene una velocidad maxima de $topSpeed")
    }

    //init inicia despues del constructor de la clase

}