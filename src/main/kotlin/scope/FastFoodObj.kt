package scope

open class OriginalRestaurant() {

    protected fun applyFormula(): String {
        return "prepare burgers with love and care"
    }

}


class Franchise : OriginalRestaurant() {
    fun prepareBurgers() {
        println("Preparing burgers according to the secret formula")
        println(applyFormula())
    }
}

fun executeRestaurant() {
    val restaurant = Franchise()
    restaurant.prepareBurgers()
}