package data_type.data_study.data_enum

/*

collection of constants
constants defined are data_type.objects
the constants have properties

 */

enum class ColorEnum {
    RED, GREEN, BLUE
}

fun decideColor(color: ColorEnum) {
    when (color) {
        ColorEnum.RED -> println("you choose red")
        ColorEnum.GREEN -> println("you choose green")
        ColorEnum.BLUE ->  println("you choose blue")
    }
}