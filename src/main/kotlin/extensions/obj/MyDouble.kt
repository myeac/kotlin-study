package extensions.obj

fun Double.Companion.printClassName() {
    println("this is a double class")
}

fun executeMyDouble() {
    Double.printClassName()
}