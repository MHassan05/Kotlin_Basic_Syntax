class House(var items: Array<String>){
    inner class Room{
        fun displayHouseNo(position: Int){
            println("Room is of ${items[position]}")
        }
    }
}

fun main(){
    val house = House(arrayOf("House 0", "House 1", "House 2", "House 3"))
    house.Room().displayHouseNo(3)
}