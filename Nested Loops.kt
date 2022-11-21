// Nested Loops Concept
fun main () {
    for (i in 1..5) {
        for (j in 1..5) {
            println("$i $j")
        }
    }
}

fun main () {
    for (i in 1..5) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
} 
// * 
// **
// ***
// ****
// *****

fun main () {
    val numberOfStars = 6 - i
    for (i in 1..5) {
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }
} 
// ***** 
// ****
// ***
// **
// *

fun main() {
    val height = 10
    for (i in 1..height) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}

/**
**
***
****
*****
******
*******
********
*********
********** */

fun main() {
    val width = 5
    for (i in 1 until width step 2) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
    for (i in width downTo 1 step 2) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}
/*  *
   **
  ***
 ****
***** */

fun main() {
    for (i in 1..5) {
        val numberOfSpaces = 5 - i
        for (j in 1..numberOfSpaces) {
            print(" ")
        }
        val numberOfStars = i
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }
}
/*
    *
   ***
  *****
 *******
*********
*/