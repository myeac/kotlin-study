package data_study.data_nested

/*

encapsulation
a nested class is created INSIDE ANOTHER CLASS
inner class ()

the inner class can access variables and methods of the outer class

 */

class CarNested {

    private val secretEngine = SecretEngine()
    var speed = 100

    fun driveSecretEngine() {
        secretEngine.run()
    }

    fun drive() {
        println("Driving at speed $speed")
    }


    inner class Engine {
        val rpm = 1000
        fun run() {
            println("engine running at $rpm")
            this@CarNested.speed = 60
            this@CarNested.drive()
        }
    }

    private inner class SecretEngine() {
        val rpm = 3000
        fun run() {
            println("engine running at $rpm")
            this@CarNested.speed = 210
            this@CarNested.drive()
        }
    }

}

fun executeCarNested() {
    val myCar = CarNested()
    println("engine")
    myCar.Engine().run()
    println()
    println("secret engine")
    myCar.driveSecretEngine()
}