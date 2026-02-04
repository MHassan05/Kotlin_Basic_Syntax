class Account(var accountName: String) {
    private var balance = 0
    private var transactions = mutableListOf<Int>()

    fun deposit(amount: Int) {
        if (amount > 0) {
            transactions.add(amount)
            balance += amount
            println("$amount is deposited and current balance is $balance.")

        } else {
            println("Error! cannot deposit amount.")
        }
    }

    fun withdraw(withdrawal: Int) {
        if(withdrawal in 1 .. balance){
            balance -= withdrawal
            transactions.add(-withdrawal)
            println("$withdrawal is withdrawal and current balance is $balance.")
        }else{
            println("Error! cannot withdraw amount.")
        }
    }

    fun calculateBalance(): Int{
        this.balance = 0
        for (transaction in transactions){
            this.balance += transaction
        }
        return balance
    }
}

fun main(){
    val account = Account("Alex")
    account.deposit(500)
    account.withdraw(20)
    account.deposit(-20)
    account.withdraw(1000)
    account.withdraw(-10)
}