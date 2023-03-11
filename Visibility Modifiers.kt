// Visible

fun add (a: Int, b: Int): Int {
    return a + b
}

fun main() {
    val result = add(a:10, b:20)
    println(30)
}

// Private unvisible

private fun add (a: Int, b: Int): Int {
    return a + b
}

fun main() {
    val result = add(a:10, b:20)
    println(30)
}

// Protected 

open class Ship {
    protected var milesPassed = 0.0

    fun printMilesPassed() {
        println(milesPassed)
    }
}

class ElectricShip: Ship() {
    fun swimUsingEngine(distance: Double) {
        milesPassed += distance
    }
}


// Internal

Internal fun add(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    val result = add(a:10, b:20)
    println(30)
}