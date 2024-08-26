package generics

class Box<T> {
    fun display(item: T) {
        println(item)
    }
}

class CarGeneric {}

fun executeBox() {
    val myBox = Box<String>()
    myBox.display("Contents")

    val carBox = Box<CarGeneric>()
    carBox.display(CarGeneric())
}

class NewBox<T, U> {
    fun display(item: T, item2: U) {
        println(item)
        println(item2)
    }
}

fun executeNewBox() {
    val carBox = NewBox<CarGeneric, String>()
    carBox.display(CarGeneric(), "Casa")
}