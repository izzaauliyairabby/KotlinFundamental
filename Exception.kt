fun main() {
    try {
    val num: Int = "123".toInt()
    println(num)
    } catch (t: Throwable) {
        println("Caught")
    } catch (t: NumberFormatException) {
        println("Caught NumberFormatException")
    } catch (t: ArithmeticFormatException) {
        println("Caught ArithmeticFormatException")
    }  catch (t: Throwable) {
        println("Caught")
    }
    println("Done")
}

// Defining and throwing exceptions
class MyError: Throwable("Some message")

fun someFunction() {
    throw MyError()
println("Will not be printed")
}

fun main() {
    try {
someFunction()
println("Will not be printed")
    } catch (e: Throwable) {
println("Caught $e") // Caught MyError: Some message
    }
}


// Exception report and stack trace
class MyError: Throwable("Some message")

fun someFunction() {
    throw MyError()
println("Will not be printed")
}

fun main() {
someFunction()
println("Will not be printed")
}

Exception in thread "main" MyError: Some message
at TestKt.someFunction(Test2.kt:4)
at TestKt.main(Test2.kt:9)
at TestKt.main(Test2.kt)

// Finally block
fun someFunction() {
    throw Throwable("Some error")
println("Will not be printed")
}

fun main() {
    try {
someFunction()
println("Will not be printed")
    } finally {
println("Finally block was called") // Finally block was called
    }
println("Will not be printed")
}
fun someFunction() {
println("Will be printed") // Will be printed
}

fun main() {
    try {
someFunction()
println("Will be printed") // Will be printed
    } finally {
println("Finally block was called") // Finally block was called
    }
println("Will be printed") // Will be printed
}

// Important exceptions
// IllegalArgumentException 
// IllegalStateException
fun findClusters(number: Int) {
    if (number < 1) throw IllegalArgumentException("The number of clusters cannot be smaller than 1, it is $number")
    // ...
}

var userName = ""

fun printUserName() {
    if (userName == "") throw IllegalStateException("User name must not be empty")
    // ...
}

// Sealed Class
abstract class Animal
class Dog : Animal()
class Cat : Animal()

sealed class Result
class Success(val data: String) : Result()
class Failure(val exception: Throwable) : Result()

fun constructLabel(role: String, name: String): String {
    return when (role) {
        "ceo" -> "The boss"
        "manager" -> "Manager $name"
        "worker" -> name
        else -> "Unknown role"
    }
}

fun main() {
val label = constructLabel("manager", "Leonard")
println(label) // Manager Leonard
}

enum class Role {
    CEO,
    MANAGER,
    WORKER
}

fun constructLabel(role: Role, name: String): String {
    return when (role) {
        CEO -> "The boss"
        MANAGER -> "Manager $name"
        WORKER -> name
    }
}

fun main() {
val label = constructLabel(Role.MANAGER, "Leonard")
println(label) // Manager Leonard
}

sealed class Role
class CeoRole(): Role()
class ManagerRole(val name: String): Role()
class WorkerRole(val name: String): Role()

fun constructLabel(role: Role): String {
    return when (role) {
        is CeoRole -> "The boss"
        is ManagerRole -> "Manager ${role.name}"
        is WorkerRole -> role.name
    }
}

fun main() {
val label = constructLabel(ManagerRole("Leonard"))
println(label) // Manager Leonard
}

// Annotation Class
@Throws(ArithmeticException::class)
fun divide(a: Int, b: Int): Int {
    return a / b
}

@Throws(IllegalArgumentException::class)
fun findClusters(number: Int) {
    if (number < 1) throw IllegalArgumentException("The number of clusters cannot be smaller than 1, it is $number")
    // ...
}

annotation class MyAnnotation(val someDescription: String)

@MyAnnotation("Class annotation")
class A(
    @MyAnnotation("Constructor property annotation")
val a: Int
) {
    @MyAnnotation("Method annotation")
    fun b() {}
}