package generics

import util.arrayListAnimals

class Info<T> {
    fun getLength(item: T) {
        println(item.toString().length)
    }
}

fun executeInvokeVal() {
    val info = Info<String>()
    info.getLength("hueheuueheu hue")

    val info2 = Info<Double>()
    info2.getLength(324.21314123)

    val info3 = Info<ArrayList<String>>()
    info3.getLength(arrayListAnimals as ArrayList<String>)
}
