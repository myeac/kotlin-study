package expressions

fun expressionsIfElse() {

    val animal = arrayListOf<String>()

    if (animal.isEmpty()) {
        animal.add("Dog")
    }
    println(animal)

    val animals = arrayListOf("cat")
    if (animal.add("horse"))        //<list>.add(T) returns a boolean
        println("se adiciono horse")
    println()

    val guestList = setOf("alexa", "john", "alice", "bob", "carol")
    val guest = readlnOrNull() ?: ""
    if (guest in guestList)
        println("hola $guest, bienvenido!")
    else
        println("disculpa, no estas invitado")
    println()

    println("cuantos gatos tienes???")
    val input = readlnOrNull() ?: "0"
    val cats = input.toInt()
    val howMany = if (cats == 0) {
        "no cats"
    } else if (cats in 1..3) {
        "few cats"
    } else if (cats in 4..6) {
        "several cats"
    } else "many cats"
    println("esta persona tiene $cats gatos")
    println()

    val petList = arrayListOf("cat","dot")
    if(petList.isEmpty()){
        println("gracias por darle casa a todos las mascotas")
    }else{
        println("por favor, ven y adopta una mascota. tenemos $petList")
    }


    println("por favor, ingersa tu edad:")
    val ageUser = (readlnOrNull() ?: "0").toInt()
    val userStatus = if(ageUser in 0..13){
        "child"
    }else if (ageUser in 14.. 18){
        "teen"
    }else{
        "adulto"
    }
    println("el usuario es $userStatus")



}