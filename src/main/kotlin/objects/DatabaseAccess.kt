package objects

//singleton solo existe 1 vez en el proyecto, no es necesasrio inicializar`
object DatabaseAccess {
    var connected = false
    fun connect() {
        connected = true
        println("connected to the database")
    }

    fun disconnect() {
        connected = false
        println("disconnected to the database")
    }
}

fun executeDatabaseAccess() {
    DatabaseAccess.connected = true
    if (DatabaseAccess.connected) {
        DatabaseAccess.disconnect()
    } else {
        DatabaseAccess.connect()
    }
    println("Database is connected :${DatabaseAccess.connected}")
}