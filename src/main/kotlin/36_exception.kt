// Unhandled exceptions cancel the coroutine and propagate upward.

import kotlinx.coroutines.*

fun main() = runBlocking {
    try {
        launch {
            throw Exception("Something went wrong")
        }.join()
    } catch (e: Exception) {
        println("Caught exception: ${e.message}")
    }
}