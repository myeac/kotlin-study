package data_study.data_nested

class AirplaneNested {

    private val engineOne = EnginePlane("engine one")
    private val engineTwo = EnginePlane("engine two")

    private fun getEngineStatus() {
        println("${engineOne.nameEngine} is = ${engineOne.status}")
        println("${engineTwo.nameEngine} is = ${engineTwo.status}")

        if (engineTwo.status && engineOne.status) {
            println("plane is ready to depart")
        } else {
            println("plane is not ready")
        }
    }

    fun startEngines() {
        engineOne.startEngine()
        engineTwo.startEngine()
        getEngineStatus()
    }

    fun offEngines() {
        engineOne.turnOffEngine()
        engineTwo.turnOffEngine()
        getEngineStatus()
    }

    fun turnOnEngineOne() {
        engineOne.startEngine()
        engineTwo.turnOffEngine()
        getEngineStatus()
    }

    fun turnOnEngineTwo() {
        engineOne.turnOffEngine()
        engineTwo.startEngine()
        getEngineStatus()
    }

    private inner class EnginePlane(
        name: String,
    ) {
        val nameEngine = name
        var status = false

        fun startEngine() {
            status = true
            println("engine one status is $status")
        }

        fun turnOffEngine() {
            status = false
            println("engine one status is $status")
        }
    }
}

fun executeAirplaneNested() {
    val airplane = AirplaneNested()
    airplane.startEngines()
}