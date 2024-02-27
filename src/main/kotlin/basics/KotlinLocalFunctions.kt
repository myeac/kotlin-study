package basics

import getInputText

//listAnimals()
fun listAnimals() {

    fun listOneAnimal(animal: String) {
        println("I have a $animal")
    }

    val animals = listOf("cat", "dog", "hamster")
    for (animal in animals) {
        listOneAnimal(animal)
    }

}

/*
    mapOfUsersBank(
        hashMapOf(
            Pair("alice", 546.0),
            Pair("pepe", 234.0),
            Pair("carol", 12.0),
            Pair("brenda", 53.0),
            Pair("alma", 76.0)
        )
    )
*/
fun mapOfUsersBank(users: HashMap<String, Double?>) {
    fun doubleAmount(amount: Double?) = amount?.times(2)
    println(users)
    for (user in users.keys) {
        users[user] = doubleAmount(users[user])
    }
    println(users)
}

//printGreetingsName()
fun printGreetingsName() {
    fun sayHi(name: String) {
        println("hello $name coom estas??")
    }
    while (true) {
        println("ingrese un nombre")
        val name = getInputText()
        if (name.isEmpty()) break
        sayHi(name)
    }
}
