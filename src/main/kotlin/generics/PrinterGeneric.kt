package generics

class Printer<T : Collection<String>> {
    fun iterate(collection: T) {
        collection.forEach { println(it.toString()) }
    }
}

fun executePrinterGeneric() {
    val printer = Printer<Set<String>>()
    printer.iterate(hashSetOf("alice", "bob", "carol"))

    val printerD = Printer<List<String>>()
    printerD.iterate(listOf("dan", "diego", "ellen", "george"))
}