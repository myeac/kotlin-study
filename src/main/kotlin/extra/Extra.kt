package extra

private fun mostrarInAppUpdate(
    v1: String,
    v2: String,
): Int {
    var vNum1 = 0
    var vNum2 = 0

    var i = 0
    var j = 0
    while ((i < v1.length || j < v2.length)) {
        // Storing numeric part of
        // version 1 in vnum1
        while (i < v1.length && v1[i] != '.') {
            vNum1 = (vNum1 * 10 + (v1[i] - '0'))
            i++
        }
        println("version one numero - $vNum1")

        // storing numeric part
        // of version 2 in vnum2
        while (j < v2.length && v2[j] != '.') {
            vNum2 = (vNum2 * 10 + (v2[j] - '0'))
            j++
        }
        println("version two numero - $vNum2")

        if (vNum1 > vNum2) return 1
        if (vNum2 > vNum1) return -1

        // if equal, reset variables and
        // go for next numeric part
        vNum2 = 0
        vNum1 = vNum2
        i++
        j++
    }
    return 0

}

fun executeMostrarInAppUpdate(){
    //llamar cualquier metodo

    val versionInit: String = "5.165.2"
    val versionFinal: String = "5.165.1"

    println("version UNO - $versionInit")
    println("version DOS - $versionFinal")

    if (mostrarInAppUpdate(versionInit, versionFinal) < 0) {
        println("la version UNO - $versionInit es MENOR")
    } else if (mostrarInAppUpdate(versionInit, versionFinal) > 0) {
        println("la version DOS - $versionFinal es MENOR")
    } else {
        println("ambas versiones son iguales")
    }
}