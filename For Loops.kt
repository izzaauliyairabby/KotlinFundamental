// For loops concept
val letters = listOF("A", "B", "C")
for letter in letters {
    println ("The next letter is $letter")
}

//Iterate numbers
fun main () {
    for (i in 1 until 5) {
        println(i)
    }
}

fun main () {
    for (i in 5..1) {
        println(i)
    }
}

fun main () {
    for (j in 10..1 step 3) {
        println(j)
    }
}

fun main() {
    val a = 0
    val b = 5
    for (i in a until b) {
        println(i)
    }
}

fun main() {
    val a = 5
    val b = 0
    for (i in a downTo b) {
        println(i)
    }
}

fun main() {
    val a = 0
    val b = 10
    val c = 3
    for (i in a..b step c) {
        println(i)
    }
}

fun main() {
    val a = 0
    val b = 9
    val c = 3
    for (i in a until b step c) {
        println(i)
    }
}

fun main() {
    val a = 10
    val b = 1
    val c = 3
    for (i in a downTo b step c) {
        println(i)
    }
}

fun main() {
    for (num in 5 downTo 1) {
        println("$num lemonades are left")
        println("Glupglupglup")
    }
    println("That is it")
    println("Now I have to go")
}
