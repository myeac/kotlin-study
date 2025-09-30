package breaks

//not a good practice
//skip part of a code, to another one
//interrupts the flow

fun labelIteratorFor() {
    loop@ for (i in 1..10) {
        for (j in 1..10) {
            if (i % 3 == 0)
                break@loop
            println("$i,$j")
        }
    }
}
