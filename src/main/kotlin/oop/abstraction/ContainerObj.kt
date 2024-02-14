package oop.abstraction

abstract class Container() {
    fun pour() {
        println("pouring liquid")
    }
    //override method and implement it
    abstract fun bottleName()
}


class Bottle : Container() {
    override fun bottleName() {
        println("bottle of water")
    }
}

class Jug : Container() {
    override fun bottleName() {
        println("bottle of gas")
    }
}


fun executeContainer() {

    //val base = Container()        ---- error, cannot create instance of ABSTRACT

    val container = Bottle()
    container.pour()

}