fun main(){
    /*
    * 'val':
    *        like 'const' in C/C++, 'final' in Java
    *        it is immutable.
    * 'var':
    *       like a normal variable
    *       it is mutable.
    */

    /*
       Type 	 Size (bits)  Size (bytes)	Description
       Byte	     8	           1	         Stores a whole number from -128 to 127.
       Short	 16	           2	         Stores a whole number from -32,768 to 32,767.
       Int	     32	           4	         The default type for integer numbers, stores a range of approximately ±2 billion.
       Long	     64	           8	         Used for very large whole numbers, with a range of approximately ±9 x 10¹⁸.
       Float	 32	           4	         Stores decimal numbers with single precision (around 6-7 decimal digits).
       Double	 64	           8	         The default type for floating-point numbers, offers double precision (around 15-16 decimal digits).
       Char      16            2             supporting a wide range of Unicode characters.
       Boolean   1                            Its size can be implementation-dependent but is conceptually a single bit.
     */



    var userName: String = "Hasan"; userName = "Hassan"
    var age: Int = 21
    println("Hello $userName, Your age is $age")

/*
Kotlin has 'type inference' which means it could automatically detect
variables data types, so following is also correct
var userName = "Hassan"
var age = 22  => for other datatypes explicitly declare data type, and default data type is int
var age = 22.2f => for float default is double
var num = 234L => for long default is int but if value is large then it could change to Long automatically
*/
    val integerMaxValue = Int.MAX_VALUE
    val integerMinValue = Int.MIN_VALUE
    println("Integer max value: $integerMaxValue")
    println("Integer min value: $integerMinValue")

    val byteMaxValue: Byte = Byte.MAX_VALUE
    val byteMinValue: Byte = Byte.MIN_VALUE
    println("Byte max value: $byteMaxValue")
    println("Byte min value: $byteMinValue")

    val shortMaxValue: Short = Short.MAX_VALUE
    val shortMinValue: Short = Short.MIN_VALUE
    println("Short max value: $shortMaxValue")
    println("Short min value: $shortMinValue")

    val longMaxValue = Long.MAX_VALUE
    val longMinValue = Long.MIN_VALUE
    println("Long max value: $longMaxValue")
    println("Long min value: $longMinValue")

}