package expressions

enum class WhenClassEnum {
    CARPETA,
    CASA,
    NOJO,
    MESA
}

fun expressionWhen() {

    val valorNumero = 1

    when (valorNumero) {
        1 -> println("el valor es 1")
        2 -> println("el valor es 2")
        3, 4 -> println("el valor es 3 o 4")
        else -> println("no se encontro valor")
    }

    val valorEnum = WhenClassEnum.CARPETA
    val valueWhen = when (valorEnum) {
        WhenClassEnum.CARPETA -> println("valor es CARPETA")
        WhenClassEnum.CASA -> println("valor es CASA")
        WhenClassEnum.NOJO -> println("valor es NOJO")
        WhenClassEnum.MESA -> println("valor es MESA")
    }

    val valorName = "Lucius"
    val valorLastName = when (valorName) {
        "Troy" -> "Mendez"
        "Lucius" -> "Malfor"
        "Harry" -> "Potter"
        else -> "no debe ser nombrado"
    }


    val valorEdad = when (valorNumero) {
        in 0..5 -> println("bebe")
        in 6..10 -> println("niño")
        in 11..15 -> println("adolescente")
        in 16..20 -> println("joven")
        in 21..35 -> println("joven adulto")
        else -> "adulto"
    }

}