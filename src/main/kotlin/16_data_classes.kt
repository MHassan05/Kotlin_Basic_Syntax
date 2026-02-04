/*
Structural Equality: (==) -> Values are the same
Referential Equality: (===) _. same object in memory

Data classes => Automatically generates toString(), equals(), hasCode(), copy()
 */



data class CheckUser(val name: String)

fun main() {
    val u1 = CheckUser("ali")
    val u2 = CheckUser("ali")

    println(u1 == u2)   // true
    println(u1 === u2)  // false because two different objects, with same data but different memory

    println(u1)
    println(u2)
    

}
