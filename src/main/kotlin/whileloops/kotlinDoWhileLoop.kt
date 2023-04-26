package whileloops

fun exampleDoWhileLoop() {
    val puzzlePieced = 20
    var piecesPlaced = 0

    do {
        piecesPlaced++
        println("pieza colcoada #$piecesPlaced")
    } while (piecesPlaced < puzzlePieced)
}

