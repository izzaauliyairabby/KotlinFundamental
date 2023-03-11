fun factorial(number: Int): Int {

    if (number <= 1) {
        return 1
    }
    return factorial(number - 1) * number
}

fun main() {
    println(factorial(1)) // 1
    println(factorial(2)) // 2
    println(factorial(3)) // 6
    println(factorial(4)) // 24
    println(factorial(5)) // 120
    println(factorial(6)) // 720
}