fun demoString() {

    val textGreetings = "Hello there"

    val owe = 50
    val textMiguel = "Miguel owes \$$owe soles"

    val infinityUnicode = "The symbol with unicode is ---> \u221E"

    println("[$textGreetings] contiene ${textGreetings.length} caracteres")

    var textBad = textGreetings.get(2)
    var letterTwo = textGreetings[2]
    var letterOne = textGreetings[1]

    val sub = textGreetings.subSequence(6, 9)
    println("subsequence ---> $sub")

    println("imprimir todas las letras de greetings")
    for (letra in textGreetings) {
        println("letra actual ---> $letra")
    }

    val stringDePisos = """
        hola hola hola
        segunda linea
        huehuehue
    """

    println("string con espacios:\n$stringDePisos")

}