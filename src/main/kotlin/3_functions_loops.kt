//fun clearScreen() {
//    // ANSI escape code to clear screen (ESC[2J) and move cursor to home (ESC[H])
//    print("\u001b[H\u001b[2J")
//    System.out.flush() // Flush the output stream to ensure the command is sent immediately
//

//fun sum(vararg numbers: Int): Int {
//    var result = 0
//    for (number in numbers)
//        result += number
//    return result
//}
//
//fun subtract(vararg numbers: Int): Int {
//    var result = numbers[0]
//    for (number in numbers)
//        result -= number
//    return result
//}
//
//fun multiply(vararg numbers: Int): Int {
//    var result = 1
//    for (number in numbers)
//        result *= number
//    return result
//}
//
//fun divide(number: Int, number2: Int) = number / number2


fun main() {

//    for(i in 1..10){  // include 10
//        print(i)
//    }
//    println()

//    for (i in 1 until 10) {     // exclude 10
//        print(i)
//    }
//    println()

//    for (i in 10 downTo 1){     // count 10 - 1
//        print(i)
//    }
//    println()

//    for (i in 1 until 10 step 2){
//        print(i)    // output: 1 3 7 9
//    }

    var number = 1
    outer@ while(number <= 10){
        print(number)
        print(": ")
        number++
        var i = 0
        while(i < 10){
            ++i
            if(i == 5)
                break@outer
            print(i)
        }
        println()
    }

}