package standardfun.also

class BookAlso() {
    fun printBook() {
        println("printing book")
    }
}


fun executeBookAlso() {
    BookAlso().apply {
        printBook()
    }.also {
        println("printing book $it")
        println("sending an email about book $it")
    }
}