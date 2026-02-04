interface OnClickListener {
    fun onClick()
}

class Button(text: String, onClickListener: OnClickListener)

fun main(){
    val loginButton = Button("Login", object : OnClickListener{     // anonymous object
        override fun onClick() {
            // login the user
        }
    })

    val signupButton = Button("Signup", object : OnClickListener{
        override fun onClick() {
            // sing-up the user
        }
    })


}
