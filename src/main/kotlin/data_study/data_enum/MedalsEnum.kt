package data_study.data_enum

enum class MedalsEnum(
    val position: Int,
) {
    GOLD(1),
    SILVER(2),
    BRONZE(3),
    NONE(4)
}

fun executeMedalsEnum() {
    println(getMedal(1))
    println(getMedal(2))
    println(getMedal(8))

    println(getPositionMedal(MedalsEnum.SILVER))

    println(getPosition(MedalsEnum.BRONZE))

}

private fun getPositionMedal(medal: MedalsEnum) {
    when (medal) {
        MedalsEnum.GOLD -> println("primera posicion")
        MedalsEnum.SILVER -> println("segunda posicion")
        MedalsEnum.BRONZE -> println("tercera posicion")
        else -> println("sin podio")
    }
}

private fun getPosition(medal: MedalsEnum) = medal.position

private fun getMedal(position: Int): MedalsEnum {
    return when (position) {
        1 -> MedalsEnum.GOLD
        2 -> MedalsEnum.SILVER
        3 -> MedalsEnum.BRONZE
        else -> MedalsEnum.NONE
    }
}