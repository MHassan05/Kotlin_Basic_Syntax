// Automatically cancels a coroutine if it exceeds time.

import kotlinx.coroutines.*

fun main() = runBlocking {
    try {
        withTimeout(1000) {
            repeat(5) {
                println("Doing work")
                delay(400)
            }
        }
    } catch (e: TimeoutCancellationException) {
        println("Timed out")
    }
}