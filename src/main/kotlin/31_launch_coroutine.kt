import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
The launch coroutine builder in Kotlin is used to start a new coroutine that runs
concurrently and does not return a result to the caller, a pattern known as "fire-and-forget".
It is an extension function of CoroutineScope and is primarily used for tasks like updating the UI,
logging events, or making network calls where you don't need to wait for a return value.
 */

fun main() {

    val startTime = System.currentTimeMillis()
    println("Main program starts: ${Thread.currentThread().name}")

    // launch
    val parentJob = CoroutineScope(Dispatchers.Default).launch {
        val job1 = launch {
            val result1 = getData(Thread.currentThread().name)
            println(result1)
        }
        // job1.join()     // write only if you want to execute them sequentially
        val job2 = launch {
            val result2 = getData2(Thread.currentThread().name)
            println(result2)
        }
    }
    runBlocking { parentJob.join() } // wait for coroutine to finish

    println("Main program ends:  ${Thread.currentThread().name}")
    println("total time: ${System.currentTimeMillis() - startTime}")

}

/*
suspend function:
- Can PAUSE execution without blocking the thread
- Can ONLY be called from:
  1) another suspend function
  2) a coroutine

Important:
suspend does NOT mean:
- new thread
- async execution by itself

It only means:
"This function may suspend at some point"
 */

private suspend fun getData(threadName: String): String {
    println("Fake Work starts: ${Thread.currentThread().name}")
    delay(2000)
    println("Fake work ends: ${Thread.currentThread().name}")
    return "Result 1"
}

private suspend fun getData2(threadName: String): String {
    println("Fake2 Work starts: ${Thread.currentThread().name}")
    delay(2000)
    println("Fake2 work ends: ${Thread.currentThread().name}")
    return "Result 2"
}

