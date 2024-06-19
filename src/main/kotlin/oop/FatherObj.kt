package oop

open class Father {

    open val name = "jose"
    val lastName = "perez"

    open fun personName() {
        println("the person's name is $name $lastName")
    }

}

class Son() : Father() {
    override val name = "Rodrigo"

    override fun personName() {
        super.personName()
        println("my father's name is ${super.name} ${super.lastName}")
    }
}

fun executeFather(){
    val objSon = Son()
    objSon.personName()
}