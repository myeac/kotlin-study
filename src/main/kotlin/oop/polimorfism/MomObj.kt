package oop.polimorfism

import oop.Daughter

open class Mom() {
    open fun say(message: String) {
        println("mom says $message")
    }

    fun say() {
        println("mom says hi how are you")
    }

    fun say(message: String, time: Int) {
        for (i in 0..time)
            println("mom says hello for $i time")
    }
}

class MyDaughter : Mom() {
    override fun say(message: String) {
        println("daughter says $message")
    }
}


fun executeMomPoli() {
    val mom = Mom()
    val daughter = MyDaughter()
    mom.say("hi")
    daughter.say("hi")
    mom.say("gonna go away?", 10)
}