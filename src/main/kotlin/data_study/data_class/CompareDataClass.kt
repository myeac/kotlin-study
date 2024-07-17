package data_study.data_class

/*

------ .equals() or ==      ----    compares DATA not OBJ reference
------ .toString()          ----    prints out variable names and data
------ .copy()              ----    creates a copy with only some data changed
------ .

 */

class RegularUser(
    val name: String,
    val email: String,
    val password: String,
)

fun executeRegularUser() {
    val user1 = RegularUser("nombre", "email@email.com", "123")
    val user2 = RegularUser("nombre", "email@email.com", "123")
    println(user1 == user2) // false
}

data class RegularUserData(
    val name: String,
    val email: String,
    val password: String,
)

fun executeRegularUserDATA() {
    val user1 = RegularUserData("nombre", "email@email.com", "123")
    val user2 = RegularUserData("nombre", "email@email.com", "123")
    println(user1 == user2) // TRUE ---- compares content-data
}
