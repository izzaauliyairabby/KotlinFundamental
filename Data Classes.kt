Class dog  (
    val name: String,
    val age: Int
)

fun main() {
    val dog1 = Dog(name: "Cookie", age: 1)
    val dog2 = Dog(name: "Pluto", age: 7)
    val dog3 = Dog(name: "Cookie", age: 1)
}

// Basic
println(dog1 == dog1) // true
println(dog1 == dog2) // true
println(dog1 == dog3) // true

// 
println(dog1)
println(dog1)
println(dog2)
println(dog.name)

fun main() {
println("A" == "A") // true
println("A" == "B") // false
}

class Dog(
val name: String
)

fun main() {
val pluto1 = Dog("Pluto")
val pluto2 = Dog("Pluto")

println(pluto1 == pluto2) // false
println(pluto1 == pluto1) // true
}

// The number is not really useful, it only helps us know if two objects are the same or not.
println(pluto1) // Dog@404b9385
println("Dog: $pluto1") // Dog: Dog@404b9385

data class Dog(
val name: String
)

// data modifier before a class
fun main() {
val pluto1 = Dog("Pluto")
val pluto2 = Dog("Pluto")
val rex = Dog("Rex")

println(pluto1 == pluto2) // true
println(pluto1 == pluto1) // true
println(pluto1 == rex) // false
}

println(pluto1) // Dog(name=Pluto)
println("Dog: $pluto1") // Dog: Dog(name=Pluto)

data class Dog(
val name: String,
val age: Int
)

val dog = Dog("Pluto", 7)
val (name, age) = dog
println(name) // Pluto
println(age) // 7

data class Dog(
val name: String,
val age: Int
)

fun main() {
val dog = Dog("Pluto", 7)
val (age, name) = dog
println(age) // Pluto
println(name) // 7
}

data class Dog(
val name: String,
val age: Int
)

fun main() {
println(dog.copy()) // Dog(name=Pluto, age=7)
println(dog.copy(age = 8)) // Dog(name=Pluto, age=8)
println(dog.copy(name = "Neptune")) // Dog(name=Neptune, age=7)
}

// Pair and Triple
// Double
fun main() {
val pair = Pair(1.0, 'A')
println(pair.first) // 1.0
println(pair.second) // A
val (number, letter) = pair
    // the type of number is Double
    // the type of letter is Char
println(number) // 1.0
println(letter) // A
}

// to, pairing two function
fun main() {
val pair = 1.0 to 'A'
println(pair.first) // 1.0
println(pair.second) // A
val (number, letter) = pair
    // the type of number is Double
    // the type of letter is Char
println(number) // 1.0
println(letter) // A
}

// Triple
fun main() {
val pair = Triple(1F, "ABC", true)
println(pair.first) // 1.0
println(pair.second) // ABC
println(pair.third) // true
val (number, letters, boolean) = pair
    // the type of number is Double
    // the type of letters is Char
    // the type of boolean is Boolean
println(number) // 1.0
println(letters) // ABC
println(boolean) // true
}