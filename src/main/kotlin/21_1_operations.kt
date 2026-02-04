

fun main() {
    val numberSets: List<Set<Int>> = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(7, 8, 9))

    print("Number Sets: ")
    for (numbers in numberSets) {
        numbers.forEach { print(it) }
    }
    println()

    // flatten: convert ND array to 1D array
    // x = y.flatten()
    numberSets.flatten().forEach {print(it)}

    /*
    String representation[joinToString, joinTo]
     */
    val numberString = listOf("one", "two", "three")
    println(numberString)
    println(numberString.joinToString())

    val listString = StringBuffer("The list of numbers: ")
    println(numberString.joinTo(listString))

    println(numberString.joinToString(separator = " | ", prefix = "start: ", postfix=" :end"))

    val numbersRange = (1..100).toList()
    println(numbersRange.joinToString(limit = 25, truncated = "<..>"))

    println(numberString.joinToString { "Element: ${it.uppercase()}" })

    // plus and minus operator
    val numbers = mutableListOf("one", "two", "three", "four")
    val plusList = numbers + "five"
    val minusList = numbers - mutableListOf("three", "four")
    println(plusList)
    println(minusList)




}