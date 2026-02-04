fun main() {
    // if a function can accept/return a function as a parameter
    // it is called a high-order function

    val myLambda = { a: Int -> println(a) }
    add(5, 9, myLambda)

    // alternate:
    add(10, 10, { a: Int -> println(a) })
    // alternate:
    add(10, 21) { a: Int -> println(a) }
}

fun add(a: Int, b: Int, action: (Int) -> Unit) {
    action(a + b)
}