/*
The reified keyword in Kotlin is used with inline functions to overcome
JVM's type erasure and access the actual generic type information at runtime

By default, the Java Virtual Machine (JVM) erases generic type information during
compilation, meaning a List<String> is treated simply as a List at runtime.
This prevents operations like checking an object's type with is T or getting its
class reference (T::class) inside a generic function.
 */

fun main() {
    val list = mutableListOf(1, 2,360, 'a', 'b', 'c', "hello", "world")

    val specificList = getSpecificType<Int>(list)

    for (element in specificList){
        println(element)
    }

}

inline fun <reified T> getSpecificType(list: List<Any>): List<T>{
    val specificList = mutableListOf<T>()

    for (element in list){
        if (element is T){
            specificList.add(element)
        }
    }
    return specificList
}