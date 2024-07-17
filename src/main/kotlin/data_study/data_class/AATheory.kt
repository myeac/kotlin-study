package data_study.data_class

/*

create classes just for storing data
primary constructor has at least one parameter
all primary constructors parameters need to be val or var
can have a body, but not required

data class User(
)

 */


data class User(
    val name: String,
    val email: String,
    val password: String,
)

fun executeDataClassUser() {
    val user = User(
        "mi nombre",
        "mi email",
        "mi contraseña"
    )
}
