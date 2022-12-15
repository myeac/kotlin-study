package collections

fun kotlinLists() {

    val listaNombres = listOf("hola","que","como","estas","tu")
    println(listaNombres)

    println("item en la posicion 1 es: ${listaNombres[1]}")
    println("item en la posicion 3 es: ${listaNombres.get(3)}")

    val sublista = listaNombres.subList(0,3)
    println(sublista)


    val listaMutable = mutableListOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)
    listaMutable[0] = 69

    listaMutable.add(100)
    listaMutable.removeAt(4)
    listaMutable.remove(10)

    println(listaMutable)

    println("el primer elemento de la lista es ${listaMutable[0]}")

}