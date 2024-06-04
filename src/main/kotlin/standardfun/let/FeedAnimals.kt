package standardfun.let

fun feedAnimals() {

    var listAnimals = mutableListOf<String?>()
    var listSize = 3

    for (i in 1..listSize) {
        println("input an animal")
        var animalName = readlnOrNull()
        animalName?.let { name ->
            if (name.isEmpty())
                listAnimals.add(null)
            else
                listAnimals.add(name)
        }
    }

    listAnimals.forEach {
        it?.let {
            println("feeding the $it")
        }
    }

}