/*
fun name (parameter){body}
*/

fun absolute (value: Int): Int {
    if (value >= 0) {
        return value
    { else }
        return -value
    }
}

fun main() {
    val height = 5
    for (i in 1..height) {
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

fun printStars(num: Int) {
    for (j in 1..num) {
        print("*")
    }
    println()
}

fun main() {
    val height = 5
    for (i in 1..height) {
        printStars(i)
    }
}

fun printStars(num: Int) {
    for (j in 1..num) {
        print("*")
    }
    println()
}

fun ascendingTriangle(height: Int) {
    for (i in 1..height) {
        printStars(i)
    }
}

fun main() {
    ascendingTriangle(5)
}

fun printStars(num: Int) {
    for (j in 1..num) {
        print("*")
    }
    println()
}

fun ascendingTriangle(height: Int) {
    for (stars in 1..height) {
        printStars(stars)
    }
}

fun descendingTriangle(height: Int) {
    for (stars in height downTo 1) {
        printStars(stars)
    }
}

fun isoscelesTriangle(width: Int) {
    ascendingTriangle(width - 1)
    descendingTriangle(width)
}

fun main() {
    println("Ascending triangle:")
    ascendingTriangle(5)
    println("Descending triangle:")
    descendingTriangle(5)
    println("Isosceles triangle:")
    isoscelesTriangle(5)

    // *
    // **
    // ***
    // ****
    // *****

//Add your function below this line

fun main() {
        var score = 0;
    println(score)
        score += getPoints(10, 1)
    println(score)
        score += getPoints(20, 2)
    println(score)
        score += getPoints(-10, 1)
    println(score)
        score += getPoints(5, 3)
    println(score)
        score += getPoints(-15, 2)
    }

// Default and Named Argument
fun openBrowser(url: String, incognitoMode: Boolean) {

    println("Opening $url" + if (incognitoMode) " in incognito mode" else "")

    // ...

}

// Usage

fun main() {

    openBrowser("website1.com", false) // Opening website1.com

    openBrowser("website2.com", false) // Opening website2.com

    openBrowser("website3.com", true) // Opening website3.com in incognito mode
}

fun openBrowser(url: String, incognitoMode: Boolean = false) {

    println("Opening $url" + if (incognitoMode) " in incognito mode" else "")

    // ...

}

// Usage

fun main() {

    openBrowser("website1.com") // Opening website1.com

    openBrowser("website2.com") // Opening website2.com

    openBrowser("website3.com", true) // Opening website3.com in incognito mode
}

fun cheer(how: String = "Hello, ", who: String = "World") {

    print("$how $who")
}

fun main() {

    cheer() // Hello, World

    cheer("Hi ") // Hi World

    cheer("Hi ", "Learner") // Hi Learner
}

// Named Argument
fun cheer(how: String = "Hello, ", who: String = "World") {

    print("$how $who")
}

fun main() {

    cheer(how = "Hi ") // Hi World

    cheer(who = "Learner") // Hello, Learner

    cheer(how = "Hi ", who = "Learner") // Hi Learner

    cheer(who = "Learner", how = "Hi ") // Hi Learner
}