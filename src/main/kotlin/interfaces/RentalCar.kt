package interfaces

fun initRentalCar() {
    val dealer = CarDealer()
    var myCar = dealer.rentAffordableCar()
    myCar.rent()

    myCar = dealer.rentLuxuryCar()
    myCar.rent()

}

interface RentalCar {
    var price: Int
    fun rent()
}

class AffordableCar : RentalCar {
    override var price: Int = 1000
    override fun rent() {
        println("the affordable car costs 1000.00")
    }
}

class LuxuryCar : RentalCar {
    override var price: Int = 5000
    override fun rent() {
        println("the affordable car costs 5000.00")
    }
}

class CarDealer {
    fun rentAffordableCar(): RentalCar {
        return AffordableCar()
    }

    fun rentLuxuryCar(): RentalCar {
        return LuxuryCar()
    }
}
