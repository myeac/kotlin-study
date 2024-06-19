package classestypes.companionobj

import kotlin.random.Random

class Lock(
    key: Key,
) {

    val secretCode: String

    init {
        secretCode = generateSecret()
        key.secretCode = secretCode
    }

    companion object {
        fun createKey() = Key()
    }

    fun generateSecret(): String {
        return Random(System.currentTimeMillis()).nextInt().toString()
    }

    fun unlock(key: Key) {
        if (key.secretCode == secretCode)
            println("lock is open")
        else
            println("key is not correct")
    }

}

class Key {
    var secretCode: String = ""
        set(value) {
            if (field == "")
                field = value
        }
}

fun executeLockKey(){
    val correctKey = Lock.createKey()
    val myLock = Lock(correctKey)
    myLock.unlock(correctKey)

    val randomKey = Lock.createKey()
    myLock.unlock(randomKey)

}