import kotlinx.coroutines.*

fun main() {
    // GlobalScope launches a coroutine that is not tied to main()
    // It keeps running even if main finishes
    GlobalScope.launch {
        delay(1000)
        println("Running in GlobalScope")
    }

    // Without this delay, the program would exit before coroutine runs
    Thread.sleep(2000)
}
