package data_class

// we use RegularUser and RegularUserData

fun executeCopyDATA() {
    val user1 = RegularUserData("nombre", "email@email.com", "123")
    val user2 = user1.copy(email = "another@email.com")
    println(user2.toString())   //  RegularUserData(name=nombre, email=another@email.com, password=123)
}