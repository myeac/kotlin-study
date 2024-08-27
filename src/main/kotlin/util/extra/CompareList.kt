package util.extra

const val stringPoint = "."
const val versionSize = 2
const val doNotShow = false
const val show = true

fun showInAppUpdate(
    currentVersion: List<Int>,
    initVersion: List<Int>,
    finalVersion: List<Int>,
): Boolean {
    val validateNumbers = mutableListOf<Boolean>()
    for (version in 0..versionSize) {
        if (currentVersion[version] in initVersion[version]..finalVersion[version])
            validateNumbers.add(doNotShow)
        else
            validateNumbers.add(show)
    }
    return validateShowInAppUpdate(validateNumbers)
}

fun validateShowInAppUpdate(
    list: List<Boolean>,
): Boolean {
    list.forEach {
        if (it) return show
    }
    return doNotShow
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
