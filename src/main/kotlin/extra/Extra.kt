package extra

const val stringPoint = "."
const val versionSize = 2

fun showInAppUpdate(
    currentVersion: List<Int>,
    initVersion: List<Int>,
    finalVersion: List<Int>,
): Boolean {
    for (version in 0..versionSize) {
        if (currentVersion[version] !in initVersion[version]..finalVersion[version]) {
            return true
        }
    }
    return false
}

fun String.versionNameToList(): List<Int> {
    val sendList = mutableListOf<Int>()
    val stringList = this.split(stringPoint)
    stringList.forEach {
        val value = it.toIntOrNull()
        if (value != null) {
            sendList.add(value)
        }
    }
    return if (sendList.size == 3)
        sendList.toList()
    else
        listOf()
}
