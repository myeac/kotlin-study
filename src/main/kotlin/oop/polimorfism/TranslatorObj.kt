package oop.polimorfism


class Translator {
    fun sayHello() {
        println("English:Hello!")
    }

    fun sayHello(language: String) {
        when (language) {
            "fr" -> println("french: bonjour!")
            "ch" -> println("chinese: ni hao!")
            else -> println("english: hello!")
        }
    }

}

fun executeTranslator() {
    val translator = Translator()
    translator.sayHello()
    translator.sayHello("fr")
    translator.sayHello("ch")
    translator.sayHello("de")
}