package data_study.data_nested

class ComputerNested {
    fun bootUp() {
        println("bootin up computer")
        val os = OperatingSystem()
        os.startOs()
        println("Computer ready")
    }

    inner class OperatingSystem() {
        fun startOs() {
            println("OS started")
        }
    }
}

fun executeComputerNested() {
    val myComputer = ComputerNested()
    myComputer.bootUp()
}