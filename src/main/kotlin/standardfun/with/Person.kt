package standardfun.with

fun executePersonWith() {
    val person = Person()
    with(person) {
        firstName = "jhon"
        lastName = "wayne"
        age = 43
        printPersonInfo()
    }
}

class Person() {
    var firstName = ""
    var lastName = ""
    var age = 0

    fun printPersonInfo() {
        println("$firstName $lastName is $age year old")
    }
}