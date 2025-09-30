package asynchronous

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

/* SCOPE
    - provide LIFECYCLE METHODS for coroutines
    - allow to STOP coroutines
    - GlobalScope.launch {} - scope of the coroutines of the entire app
    - runBlocking - creates a scope and runs a coroutine in a blocking way
    - coroutineScope - create a new Scope - does not complete until all children coroutines complete
 */

fun scopeExamples(){
    val runBlockingExample = runBlocking {
        launch {
            delay(1000L)
            println("blocking task")
        }
    }

    val globalScopeExample = GlobalScope.launch {
        delay(1000L)
        println("globalScope task")
    }

    val coroutineScopeExample = coroutineScope {
        delay(1000L)
        println("custom coroutine scope task")
    }
}