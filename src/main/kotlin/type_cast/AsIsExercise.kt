package type_cast

import kotlin.random.Random

open class NetworkService {}

class FTPService : NetworkService() {
    fun transferFile() {
        println("transferring a file via FTP")
    }
}

fun getNetworkService(): NetworkService {
    return if (Random.nextInt() % 2 == 0)
        NetworkService()
    else
        FTPService()
}

fun executeAsIsExercise() {
    for (i in 1..10) {
        println("$i..")
        val service = getNetworkService()
        (service as? FTPService)?.transferFile()
    }
}