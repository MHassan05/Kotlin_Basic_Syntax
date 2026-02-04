fun main() {
    var number = 1
    val lastNumber = 20
    var count = 0

    print("Even numbers from $number - $lastNumber: ")
    while (number <= lastNumber) {

        if (isEven(number)) {
            count++;
            print("$number ")
        }

        number++
    }
    println()
    println("Total even counts: $count")
}

fun isEven(number: Int) = number % 2 == 0
