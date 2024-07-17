package data_study.data_sealed

/*

define a restricted hierarchy
abstract by default so canont be instantiated
useful in when expressions

 */


abstract class Plant

sealed class Fruit : Plant()

class Apple : Fruit()

sealed class Vegetable : Plant()

class Potato : Vegetable()

fun getPlant(): Plant = Apple()

fun executeExampleSealed() {
    val somePlant = getPlant()
    when (somePlant) {
        is Fruit -> println("sweet")
        is Vegetable -> println("tasty")
    }
}