package extensions.functions

fun String.getCustomName() = "A string of characters"
fun Int.getCustomName() = "A integer number"
fun Float.getCustomName() = "A floating point number"

fun executeGetString() {
    println("Something".getCustomName())
    println(3.getCustomName())
    println(2.5F.getCustomName())
}