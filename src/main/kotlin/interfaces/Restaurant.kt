package interfaces

interface Restaurant {
    fun provideFood()
    fun provideBill()
}

class LocalRestaurant : Restaurant {
    override fun provideFood() {
        println("tu local preferido que provee comida y bebidas")
    }

    override fun provideBill() {
        println("por favor paga 25")
    }
}

class FancyRestaurant : Restaurant {
    override fun provideFood() {
        println("tu local preferido que provee comida y bebidas de alta calidad")
    }

    override fun provideBill() {
        println("por favor paga 97")
    }
}

fun executeRestaurant() {
    val rest1 = LocalRestaurant()
    rest1.provideFood()
    rest1.provideBill()
    val rest2 = FancyRestaurant()
    rest2.provideFood()
    rest2.provideBill()
}