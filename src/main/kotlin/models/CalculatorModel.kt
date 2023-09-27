package models

class CalculatorModel() {

    var total = 0.0

    fun addNumber(add: Double) {
        this.total += add
        println("+ $add")
        print("= $total")
    }

    fun sub(add: Double) {
        this.total -= add
        println("- $add")
        print("= $total")
    }

    fun div(add: Double) {
        this.total /= add
        println("/ $add")
        print("= $total")
    }

    fun mult(add: Double) {
        this.total *= add
        println("x $add")
        print("= $total")
    }

    fun reset() {
        total = 0.0
        println("reset")
        print("= $total")
    }

}

fun executeCalculator() {
    val cal = CalculatorModel()
    cal.addNumber(45.3)
    cal.mult(3.0)
    cal.div(2.0)
    cal.sub(32.1)
    cal.reset()
    cal.addNumber(23.42)
}