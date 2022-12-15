package expressions

import kotlin.random.Random

fun expressionsLoop() {

    for (iterator in 0..10) {
        println("indice esta en: $iterator")
    }

    val listNames = listOf("nobmre", "apellido", "genero", "edad", "etnia", "nacionalidad")

    for ((iterator, text) in listNames.withIndex()) {
        println("$text se encuentra en la posicion $iterator y mide ${text.length}")
    }

    var numeroLoop = Random.nextInt(1, 10)
    while (numeroLoop <= 10) {
        println("numero actual es $numeroLoop")
        numeroLoop++
    }




}