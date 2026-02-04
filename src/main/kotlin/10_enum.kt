/*
Enums are like constant, but they are more powerful, because they can have properties and functions.
Enums classes are used when you want to represent fixed set of values.
 */


/*
enum class Direction{
    North,
    South,
    East,
    West
}
 */

fun main(){

    for(direction in Direction.entries){        // or Direction.values()
        println(direction)
    }

    println()

    println(Direction.NORTH.direction)
    println(Direction.NORTH.distance)
    println(Direction.NORTH.name)

    println()
    Direction.WEST.printData()

    println()
    println("Enter direction: east, west, south, north: ")
    val userInput = readln()
    val direction = Direction.valueOf(userInput.uppercase())

    when(direction){
        Direction.WEST -> println("The direction is West.")
        Direction.SOUTH -> println("The direction is South.")
        Direction.NORTH -> println("The direction is North.")
        Direction.EAST -> println("The direction is East.")
    }

}


enum class Direction(var direction: String, var distance: Int){


    // following are instance, objects created in our enum class.
    NORTH("north", 10),
    EAST("east", 15),
    WEST("west", 40),
    SOUTH("south", 20);     // this ';' is necessary here.

    fun printData(){
        println("Direction = $direction and Distance = $distance")
    }
}