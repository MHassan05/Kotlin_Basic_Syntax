// Tasks run at the same time using async.

import kotlinx.coroutines.*

fun main() = runBlocking {
    val one = async { doTaskOne() }
    val two = async { doTaskTwo() }

    println("Result: ${one.await() + two.await()}")
}