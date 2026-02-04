// GENERIC CLASS: T must be a CharSequence and be Comparable
class MessageProcessor<T>(val message: T) where T : CharSequence, T : Comparable<T> {

    fun display() {
        // Safe to use .length (from CharSequence)
        println("Message: '$message', Length: ${message.length}")
    }
}

// GENERIC FUNCTION: T must be a CharSequence and be Comparable
fun <T> findLongest(first: T, second: T): T
        where T : CharSequence, T : Comparable<T>
{
    // Safe to use .length (from CharSequence) and comparison (from Comparable)
    return if (first.length >= second.length) first else second
}

fun main() {
    val str1 = "Apple"
    val str2 = "Pineapple"

    // 1. Using the class
    val processor = MessageProcessor(str1)
    processor.display()

    // 2. Using the function
    val longest = findLongest(str1, str2)
    println("Longest is: $longest")

    // ERROR: Int satisfies Comparable but NOT CharSequence
    // val invalid = MessageProcessor(123)
}
