package interfaces

fun initRestaurant() {
    var myFood: Food = FastFoodRestaurant().buyFood()
    myFood.feed()

    myFood = FrenchRestaurant().todaySpecial()
    myFood.feed()
}

interface Food {
    fun feed()
}

class FastFoot : Food {
    override fun feed() {
        println("fast food will feed you")
    }
}

class FrenchFood : Food {
    override fun feed() {
        println("french food will feed you AND delight you")
    }
}

class FastFoodRestaurant {
    fun buyFood(): Food {
        return FastFoot()
    }
}

class FrenchRestaurant {
    fun todaySpecial(): Food {
        return FrenchFood()
    }
}