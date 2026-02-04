/*
* This file contains control flow structure
* and Comparison and Logical Operators basic syntax
*
*  '&&' for AND operator and '||' for OR operator
* */

fun main() {
    print("Enter value 1: ")
    val num1 = readln().toInt()

    print("Enter value 2: ")
    val num2 = readln().toInt()

    print("Enter Operator(/,*,+,-, %): ")
    val operator = readln()

    /*
    val result: Int = if (operator == "/") {
        println("You divided $num1 and $num2")
        num1 / num2
    } else if (operator == "*") {
        println("You multiplied $num1 and $num2")
        num1 * num2
    } else if (operator == "+") {
        println("You added $num1 and $num2")
        num1 + num2
    } else if (operator == "-") {
        println("You subtracted $num1 and $num2")
        num1 - num2
    } else if (operator == "%") {
        println("You took module of $num1 and $num2")
        num1 % num2
    } else {
        println("Operator not defined.")
        0
    }
     */


    // alternative of above statement is using 'when' which works like 'switch-case'
    val result: Int = when (operator) {
        "/" -> {
            println("You divided $num1 and $num2")
            num1 / num2
        }

        "*" -> {
            println("You multiplied $num1 and $num2")
            num1 * num2
        }

        "+" -> {
            println("You added $num1 and $num2")
            num1 + num2
        }

        "-" -> {
            println("You subtracted $num1 and $num2")
            num1 - num2
        }

        "%" -> {
            println("You took module of $num1 and $num2")
            num1 % num2
        }

        else -> {
            println("Operator not defined.")
            0
        }
    }

    println("$num1 $operator $num2 = $result")


}