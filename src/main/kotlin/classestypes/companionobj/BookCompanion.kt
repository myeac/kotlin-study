package classestypes.companionobj

class Book(
    val editor: Editor,
) {
    companion object {
        fun getEditor() = Editor("Nombre editor")
    }

}

class Editor(
    val editorName: String,
)

fun executeBookEditor() {
    val myBook = Book(Book.getEditor())
    println(myBook.editor)
}