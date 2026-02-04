fun main() {
    val a = 5
    val b = 5

   try {
        println(a / b)
    } catch (e: ArithmeticException){
        println("You can't divide by zero ${e.message}")
    } finally {
        println("Divide by Zero.")
    }
}