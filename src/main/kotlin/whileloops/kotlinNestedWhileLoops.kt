package whileloops

fun nestedWhileLoop() {
    var row = 0
    var column = 0
    while (row <= 10) {
        while (column <= 10) {
            print("$row,$column \t")
            column++
        }
        row++
        column = 0
        println()
    }
}

