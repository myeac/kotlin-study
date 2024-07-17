package data_study.data_class

// we use RegularUser and RegularUserData

fun executeToString(){
    val user1 = RegularUser("nombre", "email@email.com", "123")
    println(user1.toString())   //  RegularUser@3r2afwe     --  memory
}

fun executeToStringDATA(){
    val user1 = RegularUserData("nombre", "email@email.com", "123")
    println(user1.toString())   //  RegularUserData(name=nombre, email=email@email.com, password=123)
}