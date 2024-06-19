package standardfun.with

fun executeStoreWith() {
    val store = Store()
    with(store) {
        shoes = 30
        shirts = 23
        jackets = 10
        printInventory()
    }
}

class Store() {
    var shoes = 0
    var shirts = 0
    var jackets = 0

    fun printInventory() {
        println("there are $shoes pair of shoes, $shirts shirts and $jackets jackets in the store")
    }
}