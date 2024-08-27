package type.lazy

import util.getInputText

class UserLateInit {
    fun printWelcome() {
        println("holaa qyue tal, bienvenido al curso")
    }
}

fun executeUserLateInit() {
    val newUser by lazy { UserLateInit() }
    val banned = listOf("alice", "bob", "carol")
    println("please enter a user name")
    val input = getInputText()
    if (!banned.contains(input))
        newUser.printWelcome()
}