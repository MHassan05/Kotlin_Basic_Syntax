open class Vehicle(val name: String, val color: String) {
    open fun move(){
        println("$name is moving.")
    }

    open fun stop(){
        println("$name has stopped.")
    }
}

class Car(name: String, color: String, val engine: Int, val doors: Int): Vehicle(name, color){

}

class Plane(name: String, color: String, val engine: Int, val doors: Int): Vehicle(name, color){
    override fun move(){
        this.flying()
        super.move()        // call something from base class
    }

    fun flying(){
        println("Plane is flying.")
    }
}

fun main(){
    val car = Car("BMW", "RED", 1, 4)
    val plane = Plane("Boeing", "White", 4, 4)

    car.move()
    car.stop()

    plane.move()
    plane.stop()

}