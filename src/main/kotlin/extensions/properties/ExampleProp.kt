package extensions.properties

/*

methods cannot be local, declared or develop inside a function or class
cannot update an extension property
    - can only use values VAL, not variables VAL

property is not actually inserted into the class
the extension properties are shortcut for the notation
initializers are NOT ALLOWED

there are limitations

 */

val String.betterLength: Int
    get() {
        println("obtener mejor tamanho")
        return 200
    }

fun executeBetterLenght() {
    val name = "Miguel"
    println(name.betterLength)
}