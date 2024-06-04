package standardfun.let

import java.util.*

fun runClientsName() {

    val clients = arrayListOf<String?>()

    do {
        println("enter client name")
        val input = readlnOrNull()
        input?.let {
            if (it.isEmpty())
                clients.add(null)
            else
                clients.add(it)
        }
    } while (input?.lowercase(Locale.getDefault()) != "stop")
    println(clients)

    clients.forEach {
        it?.let {
            println("Hello $it")
        }
    }
}