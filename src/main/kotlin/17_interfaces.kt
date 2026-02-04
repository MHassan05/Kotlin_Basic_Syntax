/*
An interface is a contract. It tells a class what it must do, not how it does it.

use interfaces for:
    - loose coupling (code depends on behavior, not concrete class)
    - multiple implementations of the same idea
    - cleaner architecture ( very important)
    - easy testing and mocking

interface flyable{
    fun fly()
}

class Bird: flyable{
    override fun fly(){
        println("Flying")
    }
}

class Airplane: flyable{
    override fun fly(){
        println("Jet Flying")
    }
}

Now, bird is not airplane, but it can fly.
Use when multiple behavior is shared across unrelated classes.

Use Inheritance when you want to reuse code and use interfaces when you want to define behavior.
 */

interface Animal{
    fun sound()
}

class Dog: Animal{
    override fun sound(){
        println("Bark")
    }
}
class Cat: Animal{
    override fun sound(){
        println("Meow")
    }
}

fun makeAnimalSpeak(animal: Animal){
    animal.sound()
}

fun main(){
    val dog = Dog()
    val cat = Cat()

    makeAnimalSpeak(dog)
    makeAnimalSpeak(cat)
}
