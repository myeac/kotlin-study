package extensions.functions

/*

original class is not modified
New functions are not actually inserted in the class
rather, its a shortcut to make the functions available using the usual
    - obj.function ntoation

*/

fun String.slim() = this.substring(1, length - 1)

private fun executeName() {
    val name = "Miguel"
    println(name.slim())
}