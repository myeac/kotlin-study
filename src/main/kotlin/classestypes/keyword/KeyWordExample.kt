package classestypes.keyword

class KeyWordExample {

    var message: String = "Sin mensaje"


    fun updateMessage(message: String) {
        this.message = message
    }

}

fun executeKeyWord(){

    val postMessage = KeyWordExample()
    println("mensaje por defecto: ${postMessage.message}")
    postMessage.updateMessage("nuevo mensaje!!")
    println("mensaje actualizado: ${postMessage.message}")

}