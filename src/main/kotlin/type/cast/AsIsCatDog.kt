package type.cast

import kotlin.random.Random

abstract class Animal {}

class Dog : Animal() {
    fun bark() {
        println("perro ladrando")
    }
}

class Cat : Animal() {
    fun purr() {
        println("gato miando")
    }
}

fun getAnimals(): ArrayList<Animal> {
    val animals = arrayListOf<Animal>()
    for (i in 1..20) {
        animals.add(
            if (Random.nextInt() % 2 == 0)
                Dog()
            else
                Cat()
        )
    }
    return animals
}

fun executeAsIsCatDog() {
    val animals = getAnimals()
    animals.forEach { animal ->
        (animal as? Dog)?.bark()
        (animal as? Cat)?.purr()
    }
}