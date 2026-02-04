import kotlin.concurrent.thread

fun main(){
    println("Hello, World! 1")
    println("Hello, World! 2")
    println("Hello, World! 3")
    println("Hello, World! 4")
    println("Hello, World! 5")

    // following code is not gonna execute on main thread so it will not pause the main thread
    thread {
        Thread.sleep(5000)
        println("Thread 2 is finished.")
    }

    println("Hello, World! 6")
    println("Hello, World! 7")
    println("Hello, World! 8")
    println("Hello, World! 9")
    println("Hello, World! 10")
}