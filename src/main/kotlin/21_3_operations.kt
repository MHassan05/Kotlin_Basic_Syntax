fun main() {
    // (Grouping: groupBy)
    val numberString = mutableListOf("one", "two", "three", "four", "five")
    println(numberString.groupBy { it.first().uppercase() })
    println(numberString.groupBy(keySelector = { it.first() }, valueTransform = { it.uppercase() }))


    // Retrieving collection’s part:
    //      slice, take, takeLast, drop, dropLast, takeWhile, takeLastWhile,
    //      dropWhile, dropLastWhile, chunked, windowed
    numberString.add("six")
    println("\n")
    println(numberString.slice(1..3))
    println(numberString.slice(0..4 step 2))
    println(numberString.slice(setOf(3, 5, 0)))

    println("\n")
    println(numberString.take(3))
    println(numberString.takeLast(3))
    println(numberString.drop(1))
    println(numberString.dropLast(5))

    println("\n")
    println(numberString.takeWhile { !it.startsWith("f") })
    println(numberString.takeLastWhile { it != "three" })
    println(numberString.dropWhile { it.length == 3 })
    println(numberString.dropLastWhile { it.contains("i") })

    println("\n")
    val numbers = (1..9).toList()
    println(numbers.chunked(3))
    println(numbers.chunked(3) { it.sum() })

    println("\n")
    println(numbers.windowed(3))
    println(numbers.windowed(3){it.sum()})
}