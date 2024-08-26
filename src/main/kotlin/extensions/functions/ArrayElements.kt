package extensions.functions

import util.arrayListOfNames

fun MutableList<String>.cantidaDeElementos(): String {
    return "Esta lista tiene $size elementos"
}

fun executeArrayElements() {

    val lista = arrayListOfNames
    println(lista.cantidaDeElementos())

}