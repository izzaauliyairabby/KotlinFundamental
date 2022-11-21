// If and if-else statements

fun main() {
    val finishedHomework = true
    if (finishedHomework) {
        println("Can go to the cinema")
    }
}

fun main() {
    val finishedHomework = true
    if (finishedHomework) {
        println("Can go to the cinema")
    } else {
        println("Cannot go to the cinema")
    }
}

fun main() {
    val i = 1 // or 5
    if (i < 3) {
        println("Smaller")
    } else {
        println("Bigger")
    }
    // Prints Smaller if i == 1, or Bigger if i == 5
}

fun main() {
    val haveSomeExtraMoney = true
    val tip: Double =
        if (haveSomeExtraMoney) {
            10.0
        } else {
            0.0
        }
    println(tip) // 10.0
}

fun main() {
    val haveSomeExtraMoney = true
    val tip: Double =
        if (haveSomeExtraMoney) {
            println("Here you go") // Here you go
            1.0 // this value is ignored, because it is not the last one
            5.0 // this value is ignored, because it is not the last one
            10.0
        } else {
            println("Sorry, I am broke")
            0.0
        }
    println(tip) // 10.0
}

fun main() {
    val haveSomeExtraMoney = true
    val tip: Double = if (haveSomeExtraMoney) 10.0 else 0.0
    println(tip) // 10.0
}

fun main() {
    println("Is it going to rain?")
    val probability = 70
    if (probability <= 40) {
        println("Unlikely")
    } else if (probability <= 80) {
        println("Likely")
    } else if (probability < 100) {
        println("Yes")
    } else {
        println("What?")
    }
}


// Practice

fun main() {
    val hour = 9
    val userName = "Alex"

    if (hour <= 10) {
        print("Good morning, ")
    } else if (hour >= 20) {
        print("Good evening, ")
    } else {
        print("Hello, ")
    }

    if (userName == "admin") {
        println("what would you like to do?")
    } else {
        println("how can I help you, $userName?")
    } // Good Morning, How can i help you Alex?
}

fun main() {
    val hour = 11
    val userName = "admin"
    if (hour <= 10) {
        print("Good morning, ")
    } else if (hour >= 20) {
        print("Good evening, ")
    } else {
        print("Hello, ")
    }

    if (userName == "admin") {
        println("what would you like to do?")
    } else {
        println("how can I help you, $userName?")
    }
} //  Hello, what would you like to do?

fun main() {
    val password = "ABC"
    val error = if (password.length < 7) "Password is too short." else "Password is ok."
    print(error)
} // Password is too short


