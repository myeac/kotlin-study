package oop.abstraction


abstract class Dog(
    name: String,
) {
    abstract fun run()
    abstract fun bark()
    abstract fun play()
}


class Pug(
    val name: String,
) : Dog(name) {
    override fun run() {
        println("a $name cant run")
    }

    override fun bark() {
        println("a $name CANNOT bark")
    }

    override fun play() {
        println("a $name can play")
    }
}

class BassetHound(
    val name: String,
) : Dog(name) {
    override fun run() {
        println("a $name CANNOT run")
    }

    override fun bark() {
        println("a $name can bark")
    }

    override fun play() {
        println("a $name can play")
    }
}

class Chihuahua(
    val name: String,
) : Dog(name) {
    override fun run() {
        println("a $name can run")
    }

    override fun bark() {
        println("a $name can definitely bark")
    }

    override fun play() {
        println("a $name CANNOT play")
    }
}

fun executeDog() {
    val myDog: Dog = Pug("pug")
    val yourDog = BassetHound("Basset Hound")
    val hisDog = Chihuahua("chihuahua")

    myDog.run()
    myDog.bark()
    myDog.play()

    yourDog.run()
    yourDog.bark()
    yourDog.play()

    hisDog.run()
    hisDog.bark()
    hisDog.play()

}