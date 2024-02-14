package oop

open class Bird {
    open val color = "grey"
    open val speed = 50

    open fun fly() {
        println("a $color bird can fly up to $speed kph")
    }

}


class Parakeet : Bird() {
    override val color: String = "green"
    override val speed: Int = 65

    override fun fly() {
        super.fly()
        println("a ${super.color} bird can fly up to ${super.speed} kph")
    }
}
