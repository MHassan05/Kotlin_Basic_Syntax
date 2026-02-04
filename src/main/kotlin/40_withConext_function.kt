// withContext switches the coroutine to a different thread or dispatcher
//and waits for the result.

import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Main thread: ${Thread.currentThread().name}")

    val result = withContext(Dispatchers.IO) {
        // Runs on IO thread
        println("IO thread: ${Thread.currentThread().name}")
        100
    }

    println("Back to main, result = $result")
}