fun main() {

    // Comparable, Comparator: sorted, sortedWith, compareBy, sortedBy, thenBy

    val numbers = mutableListOf<Int>(2, 5, 1, 40, 20, 100, 60)
    print("Sorted Numbers: ")
    numbers.sorted().forEach { print(" $it ") }
    println()

    val laptops = mutableListOf<Laptop>(
        Laptop("Dell", 2025, 4, 600),
        Laptop("Acer", 2020, 16, 800),
        Laptop("Apple", 2022, 8, 1000),
    )

//    println("\n")
//    laptops.sorted().forEach { println(it) }
//    println("\n")
//    laptops.sortedWith(ComparatorRam()).forEach { println(it) }
//    println("\n")
//    laptops.sortedWith(ComparatorYear()).forEach { println(it) }
    println("\n")
    laptops.sortedWith(compareBy { it.price }).forEach { println(it) }
    println("\n")
    laptops.sortedBy { it.ram }.forEach { println(it) }
    println("\n")
    laptops.sortedWith(compareBy<Laptop> { it.year }.thenBy{it.price}).forEach { println(it) }
}

data class Laptop(val brand: String, val year: Int, val ram: Int, val price: Int)
//data class Laptop(val brand: String, val year:Int, val ram: Int, val price: Int): Comparable<Laptop>{
//    override fun compareTo(other: Laptop): Int {
//        return if(this.price > other.price ) {
//            println("In if statement: Swapping ${this.brand} with ${other.brand}")
//            1
//        } else if (this.price < other.price) {
//            println("In else if statement: Swapping ${this.brand} with ${other.brand}")
//            -1
//        }else {
//            println("In else statement: Swapping ${this.brand} with ${other.brand}")
//            0
//        }
//    }
//}

class ComparatorRam : Comparator<Laptop> {
    override fun compare(laptop1: Laptop, laptop2: Laptop): Int {
        return if (laptop1.ram > laptop2.ram) 1 else if (laptop1.ram < laptop2.ram) -1 else 0
    }
}

class ComparatorYear : Comparator<Laptop> {
    override fun compare(laptop1: Laptop, laptop2: Laptop): Int {
        return if (laptop1.year > laptop2.year) 1 else if (laptop1.year < laptop2.year) -1 else 0
    }
}