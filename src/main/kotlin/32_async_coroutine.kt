import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    // async coroutine builder
    /*
    The primary asynchronous coroutine builder in Kotlin used for returning a value is async.
    This builder starts a new coroutine concurrently and returns a Deferred<T> object,
    which is a lightweight, non-blocking future that promises to provide a result later.
     */

    val startTime = System.currentTimeMillis()
    println("Main program starts: ${Thread.currentThread().name}")

    // launch
    val parentJob = CoroutineScope(Dispatchers.Default).launch {
        val jobDeferred1: Deferred<String> = async {
           getData(Thread.currentThread().name)
        }

        val jobDeferred2: Deferred<String> = async {
            getData2(Thread.currentThread().name)
        }
        println(jobDeferred1.await() + "\n${jobDeferred2.await()}")
    }
    runBlocking { parentJob.join() } // wait for coroutine to finish

    parentJob.invokeOnCompletion {
        it?.let{
            println("Parent job failed: ${it.message}")

        }?:println("Parent job is success")
    }

    println("Main program ends:  ${Thread.currentThread().name}")
    println("total time: ${System.currentTimeMillis() - startTime}")
}

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