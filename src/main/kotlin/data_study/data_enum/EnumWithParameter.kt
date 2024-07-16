package data_study.data_enum

enum class ColorParameter(
    val timeUsed: Int,
) {
    RED(34),
    GREEN(12),
    BLUE(64)
}

fun executeColorParameter() {
    val greenValue = ColorParameter.GREEN.timeUsed      //      12
    val redName = ColorParameter.RED.name               //      RED
    val blueOrdinal = ColorParameter.BLUE.ordinal       //      2

    println(greenValue)
    println(redName)
    println(blueOrdinal)
}