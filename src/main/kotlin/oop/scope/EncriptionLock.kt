package oop.scope

class EncriptionLock(
    private val privateKey: Int,
) {

    fun unblock(publicKey: Int): Boolean = formula(publicKey) == privateKey
    private fun formula(publicKey: Int) = publicKey / 2 + 5

}

fun executeEncription() {
    val myLock = EncriptionLock(40)
    println("Does the key 43 unlock my lock: ${myLock.unblock(43)}")
    println("Does the key 70 unlock my lock: ${myLock.unblock(70)}")
}