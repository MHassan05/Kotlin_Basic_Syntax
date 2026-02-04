fun main() {
    // readlnOrNull() returns a String?, which means it can be null if the user just presses Enter
    print("Enter any string: ")
    val text2: String? = readlnOrNull()

    if (text2 != null) {
        println("Length of input: ${text2.length}")
    } else {
        println("The input was null")
    }

    // Using the safe call operator (?.)
    // This automatically checks for null before accessing length
    println("Length using safe call: ${text2?.length}")

    // Using the Elvis operator (?:)
    // If text2 is null, use the default string "This was null."
    val text3: String = text2 ?: "This was null."

    // text3 is guaranteed to be non-null, so we can safely get its length
    println("Length after Elvis operator: ${text3.length}")
}
