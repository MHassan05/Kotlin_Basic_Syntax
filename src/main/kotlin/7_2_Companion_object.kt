
class CompanionClassExample {
    companion object {       // code in this block belongs only to class not to instance
        fun sum(a: Int, b: Int) = a + b
    }
}


class Database  private constructor() {

    companion object {
        private var instance: Database ? = null

        // if creating instance first time then create it else return same instance
        fun getInstance(): Database  {
            return instance ?: Database ().also { instance = it }
        }
    }
}

// same as the above code but in concise way
object AppDatabase  {
    init {
        println("AppDatabase  created. ")
    }
}

fun main() {

    // val calc = CompanionClassExample()
    // val results = calc.sum(10, 10)  // Error!

    val result = CompanionClassExample.sum(10, 10)
    println("$result")


    val instance = Database .getInstance()
    println(instance)

    val instance2 = Database .getInstance()
    println(instance2)

    println(AppDatabase )
    println(AppDatabase )

}



