import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
Kotlin coroutines are a concurrency design pattern that simplifies asynchronous programming
by allowing you to write non-blocking code in a sequential, readable style. Often described
as "lightweight threads," they enable you to run thousands of concurrent tasks without the
high memory overhead associated with traditional system threads.

Coroutines work within a thread. We can create thousands of coroutines without any memory problem.
 */

/*
Go to build.gradle.kts file and paste following line of code:
implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.2")

or you can get latest version from:
https://github.com/Kotlin/kotlinx.coroutines
 */

fun main() {    // executed on main thread

    val startTime = System.currentTimeMillis()
    println("Main program starts: ${Thread.currentThread().name}")

    // When you want to group a bunch of coroutine, use coroutine scope
    // program can't wait for coroutine to finish, so you might see the output. but you can use sleep
    // at end for illustration, alternative is also written below
    val parentJob = CoroutineScope(Dispatchers.Default).launch {
        println("Fake threads starts: ${Thread.currentThread().name} ")
        delay(2000)
        println("Fake thread ends:  ${Thread.currentThread().name}")
    }


    runBlocking { parentJob.join() } // wait for coroutine to finish

    println("Main program ends:  ${Thread.currentThread().name}")
    println("total time: ${System.currentTimeMillis() - startTime }")

}

