package extensions.obj

fun String.Companion.getClassType() {
    println("this is a string clas")
}

fun executeMyKind() {
    String.getClassType()
}