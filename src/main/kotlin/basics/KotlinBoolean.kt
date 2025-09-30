fun demoBoolean(
    a: Int = 12,
    b: Int = 32
) {
    val dummyTrue = true
    val dummyFalse = false
    val dummyExpTrue = "a" == "a"
    val dummyExpFalse = "a" == "b"
    val dummyExp = "a" == "A"
    val dummyParams = a > b

    println("es a igual que a ---> $dummyExpTrue")
    println("es a igual que b ---> $dummyExpFalse")
    println("es a igual que A ---> $dummyExp")
    println("es $a mayor que $b ---> $dummyParams")

}
