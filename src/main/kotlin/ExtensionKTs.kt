fun getInputNumber() = readln().toIntOrNull() ?: 0

fun getInputText() = readlnOrNull() ?: ""

fun String.isNumeric() = this.toIntOrNull() != null
