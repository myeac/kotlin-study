package oop.abstraction

abstract class DefaultOven() {
    val cookingSpeed = 120
    open val avrgTemperature = 180

    abstract fun cooking()
}

class Bosch : DefaultOven() {
    override val avrgTemperature = 120
    override fun cooking() {
        println("bosch oven is cooking in $cookingSpeed seconds at $avrgTemperature temperature")
    }
}

class Roaster:DefaultOven(){
    override val avrgTemperature = 180
    override fun cooking() {
        println("roaster roast in $cookingSpeed minutes at $avrgTemperature temperature")
    }
}