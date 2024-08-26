package extensions.obj

/*

if a class has a companion object defines, we can extend it with functions and properties
if not, we cannot add a companion object

 */

class BookExtension {
    companion object {}
}

fun BookExtension.Companion.printMe() {
    println("Car companion object")
}

fun executeBookExtension() {
    BookExtension.printMe()
}
