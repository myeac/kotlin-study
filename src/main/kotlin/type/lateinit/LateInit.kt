package type.lateinit

import type.cast.getNetworkService

/*
    create a non null variavel
    non initialized variables
    need to initialize the variable before using it
    accessing it before initializing it throws and exception
    can be used only on var variables
    use .isInitialized to check if it is
 */

lateinit var networkService: String

fun executeLateInitExamples() {
    networkService = getNetworkService().toString()
    println(networkService)
}

/*
used in
    - dependency injection
    - unit testing
 */