package classestypes.keyword

class TableKey {

    var height = 120
    var size = 200

    fun updateDimensions(
        height: Int,
        size: Int,
    ) {
        this.height = height
        this.size = size
    }

    fun printInfo() {
        println("el tamaño de la mesa es $height de altura y $size de largura")
    }

}

fun callTableKey() {
    val table = TableKey()
    table.printInfo()
    table.updateDimensions(213, 412)
    table.printInfo()
}
