package classestypes.keyword

class BoxKey {
    var contents: String = ""
    fun updateBoxKey(contents: String) {
        this.contents = contents
    }
}

fun callBoxKey() {
    val myBox = BoxKey()
    println("Contents is ${myBox.contents}")
    myBox.updateBoxKey("nuevo contenido en la caja")
    println("Contents is ${myBox.contents}")
}