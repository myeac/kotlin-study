package breaks

import getInputText

//ends the for
fun breakIterationFor() {
    var onlyNumbers = arrayListOf(2, 4,6, 7, 10, 12)
    for (number in onlyNumbers) {
        if (number % 2 != 0)
            break
        println("half of $number is ${number / 2}")
    }
}

fun includeAnimals() {
    val animals = arrayListOf<String>()
    for (i in 1..5) {
        println("please enter an animal")
        val inputAnimal = getInputText()
        if (inputAnimal == "snake") {
            println("snaked are proibited")
            break
        }
        animals.add(inputAnimal)
        println("current animals $animals")
    }
}