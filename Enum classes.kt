fun pay(amount: Double, method: PaymentMethod): Boolean { // Payment Method is enum class
    return when(method) {
        "CASH" -> payWithCash(amount)
        "CARD" -> payWithCard(amount)
        "CHECK" -> payWithCheck(amount)
        else -> {
            println("Unknown Payment Method")
            false
        }
    }
}


enum class PaymentMethod {
    CASH,
    CARD,
    CHECK,
}

fun main() {
    val success = pay(amount: 123.0, PaymentMethod.CHECK)
    println("Success: $success")

    println(PaymentMethod.CASH)
    println(PaymentMethod.CASH.ordinal) //0
    println(PaymentMethod.CARD.ordinal) //1
    println(PaymentMethod.CHECK.ordinal) //2

    for (method in PaymentMethod.values()) {
        println("At ${method.ordinal} there is $method")
    }

    val String1 = "CASH"
    val method = PaymentMethod.valueOf(String1)
    println(method)
    val String2: String = method.name
}


// Examples of enum classes

// Day
    enum class WeekDay {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

// Difficulty
enum class Difficulty {
    EASY,
    MEDIUM,
    HIGH
}

// Pizza Sizes
enum class PizzaSize {
    SMALL,
    MEDIUM,
    LARGE,
    EXTRALARGE
}

// Defining values in enum classes

enum class PizzaSize(
val sizeInCm: Int
) {
SMALL(15),
MEDIUM(20),
LARGE(25),
EXTRALARGE(30)
}

fun printSize(pizzaSize: PizzaSize) {
    println("$pizzaSize is ${pizzaSize.sizeInCm} cm")
} 

fun main() {
    printSize(PizzaSize.MEDIUM) // MEDIUM is 20 cm
    printSize(PizzaSize.EXTRALARGE) // EXTRALARGE is 30 cm
}

