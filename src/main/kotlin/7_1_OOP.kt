// 1 Default Constructor (no parameters)
class CarDefault {
    var name: String = ""
    var model: String = ""
    var color: String = ""
    var doors: Int = 0

    fun move() = println("The car is moving.")
    fun stop() = println("The car has stopped.")
}
/*
Advantages:
+ Simple to declare.
+ Properties can be set later.
Disadvantages:
- Verbose, must assign properties manually.
- Less concise and readable when many properties exist.
*/

// 2 Primary Constructor with Parameters as Properties
class CarPrimary(var name: String = "", var model: String = "", var color: String = "", var doors: Int = 0) {
    fun move() = println("The car is moving.")
    fun stop() = println("The car has stopped.")
}
/*
Advantages:
+ Concise, properties initialized at object creation.
+ Supports default values and named parameters.
Disadvantages:
- Less flexible if you want to initialize properties later individually.
*/

// 3 Primary Constructor + init block (for custom initialization)
class CarInit(var name: String, var model: String) {
    var color: String
    var doors: Int

    init {
        this.color = "Unknown" // default value
        this.doors = 4         // default value
        println("Car $name of model $model initialized with $doors doors and color $color")
    }

    fun move() = println("The car is moving.")
    fun stop() = println("The car has stopped.")
}
/*
Advantages:
+ Allows custom logic during initialization.
+ Good for derived/default values or validation.
Disadvantages:
- Slightly more verbose.
*/

// 4 Secondary Constructor (alternative way to initialize)
class CarSecondary {
    var name: String
    var model: String
    var color: String
    var doors: Int

    // Primary constructor (default)
    constructor() {
        name = ""
        model = ""
        color = ""
        doors = 0
    }

    // Secondary constructor
    constructor(name: String, model: String, color: String, doors: Int) : this() {
        this.name = name
        this.model = model
        this.color = color
        this.doors = doors
    }

    fun move() = println("The car is moving.")
    fun stop() = println("The car has stopped.")
}
/*
Advantages:
+ Flexible, allows multiple ways to create objects.
+ Can have multiple secondary constructors for different scenarios.
Disadvantages:
- More verbose and less idiomatic in Kotlin compared to primary constructor.
*/

fun main() {
    // Default constructor
    val car1 = CarDefault()
    car1.name = "Tesla"
    car1.model = "S Plaid"
    car1.color = "Red"
    car1.doors = 4

    // Primary constructor
    val car2 = CarPrimary(name = "Ford", model = "Mustang", color = "Blue", doors = 2)

    // Primary constructor + init block
    val car3 = CarInit(name = "Honda", model = "Civic")

    // Secondary constructor
    val car4 = CarSecondary("BMW", "X5", "Black", 5)

    // Test functions
    car1.move(); car2.move(); car3.move(); car4.move()
}
