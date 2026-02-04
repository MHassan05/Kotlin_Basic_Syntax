// Tasks run one after another.

import kotlinx.coroutines.*

fun main() = runBlocking {
    val one = doTaskOne()
    val two = doTaskTwo()
    println("Result: ${one + two}")
}

suspend fun doTaskOne(): Int {
    delay(1000)
    return 10
}

suspend fun doTaskTwo(): Int {
    delay(1000)
    return 20
}