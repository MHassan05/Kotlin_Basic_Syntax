/*
Collections:
            Collections are group of objects stored together in a single variable.
            They are similar to array but different
            Three types of Collections in this file,
            two groups(mutable and immutable) for each of following:
            - List
            - Set
            - Map
 */

fun main() {
    val namesImmutableList = listOf("Name 1", "Name 2", "Name 3") // Immutable list
    val namesMutableList = mutableListOf("Name 1", "Name 2", "Name 3")
    namesMutableList.add("Names 4")
    namesMutableList.remove("Name 2")

    /*
    Set can't contain duplicate elements
     */
    val namesImmutableSet = setOf("Name 1", "Name 2", "Name 3", "Name 2")
    val namesMutableSet = mutableSetOf("Name 1", "Name 2", "Name 3", "Name 2")

    val immutableMap = mapOf(1 to "Maria", 2 to "Alex", 3 to "John")
    val mutableMap = mutableMapOf(1 to "Maria", 2 to "Alex", 3 to "John")

    print("Mutable List: ")
    namesMutableList.forEach { print(it) }
    print("\n\nImmutable List: ")
    namesImmutableList.forEach { print(it) }
    print("\n\nMutable Set: ")
    namesMutableSet.forEach { print(it) }
    print("\n\nImmutable Set: ")
    namesImmutableSet.forEach { print(it) }
    print("\n\nMutable Map: ")
    mutableMap.forEach { (t, u) -> print("$t and $u, ") }
    print("\n\nImmutable Map: ")
    immutableMap.forEach { (t, u) -> print("$t and $u, ")  }

}