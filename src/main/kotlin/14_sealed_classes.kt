/*
A sealed class is sued when you want a fixed, know set of types.
You know all possible cases in advance, and no new ones are allowed.
Sealed classes make your code safe, predictable, and impossible to forget cases.
 */

sealed class Result(val message: String){
    fun showMessage(){
        println("Result = $message")
    }
    class Success(message: String) : Result(message)
    sealed class Error(message: String): Result(message){
        class RecoverAble(message: String) : Error(message)
        class NonRecoverable(message: String): Error(message)
    }
}

fun getData(result: Result){
    when(result){
        is Result.Success -> result.showMessage()
        is Result.Error.NonRecoverable -> result.showMessage()
        is Result.Error.RecoverAble -> result.showMessage()
    }
}

fun main(){
    val success = Result.Success("Success!")
    val error = Result.Error.RecoverAble("Recoverable Error!")
    val nonError = Result.Error.NonRecoverable("Non Recoverable Error!")

    getData(success)
    getData(error)
    getData(nonError)

}