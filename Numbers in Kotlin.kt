// int
val i: int = 10
var i = 10

// positive and negative Int values
val x = 10
println(x) // 10

val y = -10
println(y) // -10

// int maxed out till 2billion, but if you need more, there is called long

// long
val i1 = 10 // i1 is int
val i2 = 10L //i2 is Long
val i3: Long = 10 // i3 is Long
val i4 = 2147483648 // i4 is Long inferred by Kotlin

// Double numbers
val d: Double = 10.0
//The same as
val d = 10.0

//Float numbers
val f: Float = 3.14F
// same as
val f = 3.14F 

// Basic arithmetic Parenthesis
println(1 + 1 * 3) // 7
println((1 + 2) * 3) // 9

// Prefix and Postfix Operations
fun main() {
    var a = 10
    println(a) // 10
    a++ // a = a+1
    println(a) //11
    a-- // a = a-1
    println(a) //10
}