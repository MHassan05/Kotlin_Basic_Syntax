fun main(){
    // Retrieving single elements: elementAt, first, last, random
    val numbersString = listOf("one", "two", "three", "four", "five")
    println(numbersString.elementAt(3))
    println(numbersString.first())
    println(numbersString.last())


    println("\n")
    println(numbersString.first{it.length > 3})
    println(numbersString.last{it.startsWith('f')})

    println("\n")
    println(numbersString.random())
    println(numbersString.isEmpty())


    // Aggregate operations: sum, count, average, maxOrNull, minOrNull, sumOf
    val numbers = listOf(6, 10, 14, 4, 100)
    println("The sum is ${numbers.sum()}")
    println("The count is ${numbers.count()}")
    println("The average is ${numbers.average()}")
    println("The max value is ${numbers.maxOrNull()}")
    println("The min value is ${numbers.minOrNull()}")
    println("The sum is ${numbers.sumOf{ it * 2}}")

}
