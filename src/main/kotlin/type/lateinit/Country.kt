package type.lateinit

class Country {
    private lateinit var name: String

    fun setName(name: String) {
        this.name = name
    }

    fun getName() = name
}

fun executeCountry() {
    val myCountry = Country().apply {
        setName("Peru")
    }
    println("hola ${myCountry.getName()}!")
}