package oop

open class Mom(
    naviteTonge: String,
) {

    //override val
    open val hairColor = "brown"

    val eyeColor = "blue"

    //override fun
    open fun say(message: String) {
        println("MomSays $message")
    }

}

class Daughter(naviteTonge: String) : Mom(naviteTonge) {

    override val hairColor = "blonde"

    override fun say(message: String) {
        println("daughter says $message")
        //call say function, from mother
        super.say(message)
        println("mother has ${super.hairColor} hair color")
    }
}


fun executeHerencia() {
    val carol = Daughter("french")
    println(carol.hairColor)
    carol.say("holiboli")
}