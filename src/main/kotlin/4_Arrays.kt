import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    /*
    val names: Array<String> = arrayOf("John", "Stephen", "Megan" )
    Alternate is following:
    val name = arrayOf("John", "Stephen", "Megan" )
     */

    val numbers = IntArray(20) { Random.nextInt(-100..100) }

    println("Array generate: ${numbers.joinToString(",")}")

    val min = findMinMax(numbers, false)
    val max = findMinMax(numbers, true)

    println("Max: $max \t Min: $min")
}

fun findMinMax(numbers: IntArray, searchMax: Boolean = true): Int{
    return if(searchMax) {
        findMax(numbers)
    } else {
        findMin(numbers)
    }
}

fun findMax(numbers: IntArray): Int {
    var max = numbers[0]

    for(num in numbers)
        if(num > max)
            max = num
    return max
}

fun findMin(numbers:IntArray): Int{
    var min = numbers[0]

    for (num in numbers)
        if(num < min)
            min = num
    return min
}