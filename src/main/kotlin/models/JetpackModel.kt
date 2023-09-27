package models

class JetpackModel {

    var userHeight = 0

    fun jetpackBurns(seconds: Int) {
        userHeight += seconds
    }

    fun jetpackStop(seconds: Int) {
        userHeight -= 3 * seconds
        if (userHeight < 0)
            userHeight = 0
    }
}

fun jetpackTest() {
    val jetPack = JetpackModel()
    println("user height is ${jetPack.userHeight}")
    jetPack.jetpackBurns(7)
    println("user height is ${jetPack.userHeight}")
    jetPack.jetpackStop(2)
    println("user height is ${jetPack.userHeight}")
    jetPack.jetpackStop(3)
    println("user height is ${jetPack.userHeight}")
    jetPack.jetpackBurns(14)
    println("user height is ${jetPack.userHeight}")
    jetPack.jetpackBurns(3)
    println("user height is ${jetPack.userHeight}")
    println("jetpack final height is ${jetPack.userHeight}")
}