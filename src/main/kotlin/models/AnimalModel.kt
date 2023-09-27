package models

class Animal {

    var name = ""
    var topSpeed = 0
    fun run() {
        println("el animal $name corre a $topSpeed")
    }

}

fun createCat() {
    val cat = Animal()
    cat.run()
    cat.name = "cat"
    cat.topSpeed = 40
    cat.run()
}