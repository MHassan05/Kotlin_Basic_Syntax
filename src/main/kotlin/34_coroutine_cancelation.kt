import kotlinx.coroutines.*

fun main() = runBlocking {
    // You can cancel a coroutine cooperatively.
    val job = launch {
        repeat(5) { i ->
            println("Working $i")
            delay(500) // cancellation happens here
        }
    }

    delay(1200)
    job.cancel() // request cancellation
    println("Job cancelled")
}
