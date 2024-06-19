package classestypes.init

class ComputerInit(
    val operatingSystem: String,
) {

    init {
        println("el sistema operativo $operatingSystem esta instalando")
    }

}

fun callComputerInit() {

    val sys = ComputerInit("linux")

}