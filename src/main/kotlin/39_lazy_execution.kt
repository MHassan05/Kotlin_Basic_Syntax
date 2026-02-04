// Coroutine starts only when needed.

import kotlinx.coroutines.*

fun main() = runBlocking {
    val lazyJob = async(start = CoroutineStart.LAZY) {
        delay(1000)
        println("Lazy coroutine started")
        42
    }

    println("Before await")
    println("Result: ${lazyJob.await()}")
}