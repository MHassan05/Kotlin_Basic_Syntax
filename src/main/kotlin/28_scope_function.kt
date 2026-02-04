fun main() {

    var user = Users()
    user.firstName = "Alex"
    user.lastName = "Dobinca"
    user.age = 23

    // redundant use of 'use' can be reduced
    user = Users().apply{
        firstName = "Any First Name"
        lastName = "Any Last Name"
        age = 20
        // 'this' keyword could be used with these variables.
    }.also{
        println(it)
    }

    with(user) {            // could also be used like 'apply' for assigning
       println(firstName)
       println(lastName)
       println(age)
    }

    val text: String? = null
    text?.let{
        println(it)
    }

    val newUser: User? = null
    // following will cause error because of null
//    with(newUser){
//        println(firstName)
//        println(lastName)
//        println(age)
//    }
    // but following is safe
    newUser?.run{
        println(firstName)
        println(lastName)
        println(age)
    }

}

class Users() {
    var firstName: String = ""
    var lastName: String = ""
    var age = -1
}
