package generics

class Convert<T> {
    fun convertToString(item: T) {
        println("clase convertida: ${item.toString()} ")
    }
}

fun executeConvert() {
    val objString = Convert<String>()
    objString.convertToString("mira mi nombre")

    val objFloat = Convert<Float>()
    objFloat.convertToString(213.23102F)

    val objHash = Convert<HashMap<String, Int>>()
    objHash.convertToString(hashMapOf(Pair("uno", 1), Pair("dos", 2), Pair("tres", 3), Pair("cuatro", 4)))

}