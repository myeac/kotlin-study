package standardfun.apply

class LockApply() {
    fun unlock(key: KeyApply) {
        println("unlocked lock with key $key")
    }
}

class KeyApply() {
    var secretCode = ""
    fun carvel() {
        println("carving the key with code $secretCode")
    }
}

fun executeLockKey() {
    val key = KeyApply().apply {
        secretCode = "123"
        carvel()
    }
    LockApply().unlock(key)

    LockApply().unlock(
        KeyApply().apply {
            secretCode = "no matters"
            carvel()
        }
    )
}