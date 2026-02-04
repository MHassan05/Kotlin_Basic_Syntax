import kotlin.reflect.KProperty

/*
Delegation means: instead of a class doing everything itself,
it hands over (delegates) some responsibility to another object.

Real-life analogy:
A Restaurant Manager does NOT cook food himself.
He delegates cooking to a Chef.

Kotlin supports delegation in TWO main ways:
1) Class Delegation
2) Property Delegation
*/

/* ---------------------------------------------------
   1) CLASS DELEGATION
--------------------------------------------------- */

/*
This interface defines a responsibility.
Anyone who implements it must provide this behavior.
*/
interface Cook {
    fun cookFood(): String
}

/*
This is the real worker (Chef).
Chef actually knows HOW to cook.
*/
class Chef : Cook {
    override fun cookFood(): String {
        return "Chef is cooking delicious food"
    }
}

/*
Manager DOES NOT implement cooking logic.
Instead, it delegates the Cook responsibility to Chef.

`by chef` means:
"Whenever Cook methods are called on Manager,
 forward them to the chef object."
*/
class Manager(private val chef: Cook) : Cook by chef

fun classDelegationDemo() {
    val chef = Chef()
    val manager = Manager(chef)

    // Even though Manager has no cookFood() implementation,
    // the call is delegated to Chef.
    println(manager.cookFood())
}

/* ---------------------------------------------------
   2) PROPERTY DELEGATION
--------------------------------------------------- */

/*
Property delegation means:
The getter/setter logic of a property is handled
by another object.

Real-life analogy:
A BankAccount balance should:
- be validated
- log access
- control updates

Instead of writing logic inside the property,
we delegate it.
*/

/*
This class handles property access logic.
*/
class SecureBalance(private var balance: Int) {

    // Called when property value is READ
    operator fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        println("Accessing ${property.name}")
        return balance
    }

    // Called when property value is UPDATED
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        if (value < 0) {
            println("Invalid balance update blocked")
        } else {
            println("Updating ${property.name} to $value")
            balance = value
        }
    }
}

/*
BankAccount does NOT manage balance rules.
It delegates them to SecureBalance.
*/
class BankAccount {
    var balance: Int by SecureBalance(1000)
}

fun propertyDelegationDemo() {
    val account = BankAccount()

    println(account.balance)   // calls getValue
    account.balance = 2000     // calls setValue
    account.balance = -500     // blocked
}

/* ---------------------------------------------------
   MAIN FUNCTION
--------------------------------------------------- */

fun main() {
    classDelegationDemo()
    propertyDelegationDemo()
}

/*
KEY TERMS (Simple Definitions):

Delegation:
Giving responsibility to another object instead of handling it yourself.

Class Delegation:
A class delegates interface implementation to another class using `by`.

Property Delegation:
A property delegates its getter/setter logic to another object using `by`.

Why Delegation is better than inheritance:
- No tight coupling
- Easier to change behavior
- Follows "composition over inheritance"

This is NOT magic.
Kotlin just auto-generates forwarding code for you.
*/



