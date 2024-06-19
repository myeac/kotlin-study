package standardfun.run

fun executeNewRestaurant() {
    val rest = NewRestaurant().run {
        standardDish = "pescado"
        todaySpecial = "lomo"
        printMenu()
        this
    }
    println(rest)
}

class NewRestaurant {
    var standardDish = ""
    var todaySpecial = ""
    fun printMenu() {
        println("the standarmenu dish is $standardDish")
        println("the todays special dish is $todaySpecial")
    }
}