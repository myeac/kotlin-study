package extra

import extra.VersionStatus.*

const val INC = 10
const val VALUE_ZERO = 0

fun showInAppUpdateBox(
    currentVersion: String,
    initialVersion: String,
    finalVersion: String,
): Boolean {
    val currentVersionObj = VersionNameModel(currentVersion)
    val initialVersionObj = VersionNameModel(initialVersion)
    val finalVersionObj = VersionNameModel(finalVersion)

    var currentVsInit = getResultOfTwoVersions(currentVersionObj, initialVersionObj)
    var currentVsFinal = getResultOfTwoVersions(currentVersionObj, finalVersionObj)

    return validateVersionResults(currentVsInit, currentVsFinal)
}

fun validateVersionResults(
    resultInit: VersionStatus,
    resultFinal: VersionStatus,
): Boolean {
    return when {
        resultInit == IGUAL && resultFinal == MENOR ||
        resultInit == IGUAL && resultFinal == IGUAL ||
        resultInit == MAIOR && resultFinal == MENOR ||
        resultInit == MAIOR && resultFinal == IGUAL -> true
        resultInit == MENOR && resultFinal == MENOR ||
        resultInit == MAIOR && resultFinal == MAIOR -> false
        else -> false
    }
}


fun getResultOfTwoVersions(
    currentV: VersionNameModel,
    firebaseV: VersionNameModel,
): VersionStatus {
    currentV.resetIterator()
    firebaseV.resetIterator()
    while (currentV.isAvailable() || firebaseV.isAvailable()) {
        val diff = currentV.readAsInteger() - firebaseV.readAsInteger()
        if (diff > VALUE_ZERO) {
            return MAIOR
        }
        if (diff < VALUE_ZERO) {
            return MENOR
        }
    }
    return IGUAL
}

enum class VersionStatus(
    val status: Int,
) {
    MAIOR(1),
    MENOR(-1),
    IGUAL(0),
}

class VersionNameModel(
    private val string: String,
) {

    private var iterator = 0
    private var number = 0

    fun isAvailable(): Boolean {
        return iterator < string.length
    }

    fun resetIterator() {
        iterator = 0
    }

    fun readAsInteger(): Int {
        number = 0
        while (iterator < string.length) {
            val letter = string[iterator++]
            if (letter == '.')
                break
            number = number * INC + (letter - '0')
        }
        return number
    }

}