package asynchronous

import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

/*Multithreading
    - thread is a sequence of execution
    - sequential programming - instructions are executed in order
    - parallel programming - instructions are executed in parallel
    - won't block UI thread (principal thread) - responsive program
*/

/*Coroutines y concepts
    - scope - create and run coroutines, provides LIFECYCLE VENTS
    - context - the scope provides a context in which the coroutine runs
    - suspending functions - functions that can be run in a coroutine - can be suspended
    - jobs - a handle on a coroutine
    - deferred - a future result of a coroutine
    - dispatcher - manages which threads the coroutine runs on
    - error handling
 */

fun coroutinesStart(){
    GlobalScope.launch {
        delay(200L)
        println("World!")
    }

    println("Hello, ")
    Thread.sleep(3000L)
}