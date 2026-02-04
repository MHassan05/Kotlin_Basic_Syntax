class LazyInitialization(var firstName: String){
    init{
        println("User: $firstName was created.")
    }
}

fun main(){
    val user1 = LazyInitialization("Alex")

    val user2 by lazy {
        LazyInitialization("User 2")
    }
    println(user1.firstName)
    println("user2 has not been created yet!")

    println(user2.firstName)


}
