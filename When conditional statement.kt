/*use when as an expression,

use when with a value, 

and use when with a value as an expression. */

// when statement
fun main() {
    println("Is it going to rain?")
    val probability = 70
        when {
            probability < 40 -> {
            println("Unlikely")
            }
            probability <= 80 -> {
            println("Likely")
            }
            probability < 100 -> {
            println("Yes")
            }
            else -> {
                println("What?")
            }
        }
    }

    fun main() {
        println("Is it going to rain?")
        val probability = 70
            when {
                probability < 40 -> println("Unlikely")
                probability <= 80 -> println("Likely")
                probability < 100 -> println("Yes")
                else -> println("What?")
            }
        }

// Using when as an expression
fun main() {
    println("Is it going to rain?")
    val probability = 70
    val text = when {
            probability < 40 -> "Unlikely"
            probability <= 80 -> "Likely"
            probability < 100 -> "Yes"
            else -> "What?"
        }
        println(text)
    } 

// when with a value
fun main() {
    val number = 1 // or 2, 3, 4, 5, 6
        when (number) {
            1 -> {
                println("Missed hit")
            }
            2, 3, 4, 5 -> {
                println("Hit with value $number")
            }
            6 -> {
                println("Critical hit")
            }
        }
    }

    fun main() {
        val number = 1 // or 2, 3, 4, 5, 6
        val text = when (number) {
                1 -> "Missed hit"
                2, 3, 4, 5 -> "Hit with value $number"
                6 -> "Critical hit"
                else -> "Unsupported value"
            }
            println(text)
        }

// Using ranges in when statements
fun main() {
    val number = 1 // or 2, 3, 4, 5, 6
    val text = when (number) {
            1 -> "Missed hit"
            in 2..5 -> "Hit with value $number"
            6 -> "Critical hit"
            else -> "Unsupported value"
        }
        println(text)
    }

// Type check
fun main() {
        var value = "ABC"
    
        println(value is String) // true
        println(value is Int) // false
        println(value is Boolean) // false
        println(value is Any) // true
    
        value = 123
    
        println(value is String) // false
        println(value is Int) // true
        println(value is Boolean) // false
        println(value is Any) // true
    }

    fun main() {
        val something: Any = "ABC" // or 123, 0.1, true
            when (something) {
                is String -> println("This is String")
                is Int -> println("This is Int")
                is Double -> println("This is Double")
                is Boolean -> println("This is Boolean")
            }
            println(text)
        }

// Practice
fun main() {
    val value = 0

    when {
        value > 0 -> println("Positive")
        value < 0 -> println("Negative")
        else -> println("Other")
    }
} // other

fun main() {

    val dogType = "Border Collie"

    val expectedWeight =
        when (dogType) {
            "Labrador Retriever" -> "25 - 36"
            "Fox Terrier" -> "7 - 8"
            "Border Collie" -> "12 - 20"
            "Foxhound" -> "31 - 32"
            else -> "(unknown)"
        }

    println("The weight of $dogType should be $expectedWeight kg")
} //The weight of Border Collie should be 12 - 20 kg

fun main() {
    val name = "Rex"
    val age = 3

    val status =
        when (age) {
            1 -> "puppy"
            in 2..10 -> "dog"
            else -> "older dog"
        }

    println("$name is $status")
} // rex is dog

fun main() {
    val i = 16
    when {
        i > 0 -> print("Number is positive.")
        i == 0 -> print("Number is zero.")
        i < 0 -> print("Number is negative.")
    }
} // number is positive

// Task 1
val weekday = “Friday”
println("On $weekday, the opening hours are:")
if (weekday == "Monday") {
    println("8 AM to 12 PM")
    } else if (weekday == "Tuesday") {
    println("8 AM to 6 PM")
    }
    when {
            weekday == "Monday" -> println("8 AM to 12 PM")
            }

// Task 2
val weekday = “Friday” 
val hour = 20 
val isOpen = when (weekday) {
            "Monday" -> hour >= 8 && hour <= 12
    }

// Task 1 Answer
if (weekday == "Monday") {
    println("8 AM to 12 PM")
} else if (weekday == "Tuesday") {
    println("8 AM to 6 PM")
} else if (weekday == "Wednesday") {
    println("8 AM to 6 PM")
} else if (weekday == "Thursday") {
    println("8 AM to 6 PM")
} else if (weekday == "Friday") {
    println("8 AM to 9 PM")
} else if (weekday == "Saturday") {
    println("9 AM to 4 PM")
} else if (weekday == "Sunday") {
    println("8 AM to 4 PM")
}

// Task 2 Answer
when {
    weekday == "Monday" -> println("8 AM to 12 PM")
    weekday == "Tuesday" -> println("8 AM to 6 PM")
    weekday == "Wednesday" -> println("8 AM to 6 PM")
    weekday == "Thursday" -> println("8 AM to 6 PM")
    weekday == "Friday" -> println("8 AM to 9 PM")
    weekday == "Saturday" -> println("9 AM to 4 PM")
    weekday == "Saturday" -> println("8 AM to 4 PM")
}

// Task 3 Answer
fun main() {

    // 1.
    val weekday = "Friday"
     
    // 2.
    println("On $weekday, the opening hours are:")
     
    // 3.
    if (weekday == "Monday") {
        println("8 AM to 12 PM")
    } else if (weekday == "Tuesday") {
        println("8 AM to 6 PM")
    } else if (weekday == "Wednesday") {
        println("8 AM to 6 PM")
    } else if (weekday == "Thursday") {
        println("8 AM to 6 PM")
    } else if (weekday == "Friday") {
        println("8 AM to 9 PM")
    } else if (weekday == "Saturday") {
        println("9 AM to 4 PM")
    } else if (weekday == "Sunday") {
        println("8 AM to 4 PM")
    }
    
    }

// Task 4 Answer
val weekday = "Friday"
   val hour = 20
 
   val isOpen = when (weekday) {
        "Monday" -> hour >= 8 && hour <= 12
        "Tuesday", "Wednesday", "Thursday" -> hour >= 8 && hour <= 18
        "Friday" -> hour >= 8 && hour <= 21
        "Saturday" -> hour >= 9 && hour <= 16
        "Sunday" -> hour >= 8 && hour <= 16
        else -> false
    }
    if (isOpen) {
        println("Little Lemon is open now")
    } else {
        println("Little Lemon is closed now")
    }
