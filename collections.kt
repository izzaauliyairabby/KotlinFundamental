// Collections
fun main() {
    val shoppinglist = ListOf(
        "Tomatoes",
        "Spaghetty",
        "chicken",
    )


    val newShoppingList = shoppinglist - "Chicken" + "Tofu"
    println(shoppinglist) // [Tomatoes, Spaghetty, Chicken]
    println(newShoppingList) // [Tomatoes, Spaghetti, Tofu]
}
// Collection Types, List, Set, Map
// List
fun main() {
val List = ListOf("A", "B")
val newList = List + "C"
println(List) // [A, B]
println(newList) // [A, B, C]

val str = "AB"
val newStr = str + "C"
println(str) // AB
println(newStr) // ABC

}

// Creating a list
// To create a list, the listOf function is used. The next values are then specified using arguments. 
fun main() {
    val list = listOf("A", "B", "C")
    println(list) // [A, B, C]
}

fun main() {
    val list: List<String> = listOf("A", "B", "C")
    println(list) // [A, B, C]
    val ints: List<Int> = listOf(1, 2, 3)
    println(ints) // [1, 2, 3]
}

// Adding Element to List
fun main() {
    val list = listOf("A", "B")
    println(list + "C") // [A, B, C]
    println(list + listOf("C", "D")) // [A, B, C, D]
    println(listOf("Z") + list) // [Z, A, B]
}

// Getting Size of List
fun main() {
    val list = listOf("A", "B", "C")
    println(list.size) // 3
}
// if List is empty
fun main() {
    val list = listOf("A", "B", "C")
    println(list.size == 0) // 3
    println(list.isEmpty()) // False

    val empty: Set<Int> = setOf()
    println(empty.size == 0) // True
    println(empty.isEmpty()) // True
}

// Getting Element in certain Positions
fun main() {
    val list = listOf("A", "B", "C")
    println(list[0]) // A
    println(list[1]) // B
    println(list[2]) // C
}

// checking if List contain an elements
fun main() {
    val letters = listOf("A", "B", "C")
    println(list.contains("A")) // true
    println(list.contains("Z")) // false
    println("A" in list) // true
    println("Z" in list) // false
}

// Opposite if not contain an element
fun main() {
    val letters = listOf("A", "B", "C")
    println("A" !in list) // false
    println("Z" !in list) // true
}

// iterating over list
fun main() {
val letters = listOf("A", "B", "C")
    for (letter in letters) {
        print(letter)
    }
}

// Using mutable List
fun main() {
    val list = mutableListOf("A", "B")
    list.add("C")
    println(list) // [A, B, C]
    list.remove("B")
    println(list) // [A, C]
}
// You can also change an element at a certain position using box brackets with index and assignment.
fun main() {
    val list = mutableListOf("A", "B", "C")
    list[1] = "Z"
    println(list) // [A, Z, C]
}


// Use a Set
// Creating a Set
fun main() {
    val set = setOf('A', 'B', 'C')
    println(set) // [A, B, C]
}

fun main() {
    val set: Set<Char> = setOf('A', 'B', 'C')
    println(set) // [A, B, C]
    val ints: Set<Long> = setOf(1L, 2L, 3L)
    println(ints) // [1, 2, 3]
}

// Adding Element to Sets
fun main() {
    val set = setOf('A', 'B')
    println(set + 'C') // [A, B, C]
    println(set + setOf('C', 'D')) // [A, B, C, D]
    println(setOf('Z') + set) // [Z, A, B]
}

// Establishing the size of a set
fun main() {
    val set = setOf('A', 'B', 'C')
    println(set.size) // 3
}
fun main() {
    val set = setOf('A', 'B', 'C')
    println(set.size == 0) // false
    println(set.isEmpty()) // false

    val empty: Set<Int> = setOf()
    println(empty.size == 0) // true
    println(empty.isEmpty()) // true
}
// Elements in sets are unique
fun main() {
    val set = setOf('A', 'B', 'C')
    println(set + 'B') // [A, B, C]
    println(set + setOf('B', 'D')) // [A, B, C, D]

    val list = listOf('A', 'B', 'C')
    println(list + 'B') // [A, B, C, B]
    println(list + listOf('B', 'D')) // [A, B, C, B, D]
}

fun main() {
    val set = setOf('A', 'B', 'A')
    println(set) // [A, B]
}

class User(val name: String)

fun main() {
    val set = setOf(User("A"), User("A"))
    println(set + User("A")) // [User@XXX, User@YYY, User@ZZZ]
}

data class User(val name: String)

fun main() {
    val set = setOf(User("A"), User("A"))
    println(set + User("A")) // [User(name=A)]
}

// Checking if a set contains an element
fun main() {
    val letters = setOf('A', 'B', 'C')
    println(set.contains('A')) // true
    println(set.contains('Z')) // false
    println('A' in set) // true
    println('Z' in set) // false
}

fun main() {
    val letters = setOf("A", "B", "C")
    println("A" !in list) // false
    println("Z" !in list) // true
}

// Iterating over sets

fun main() {
    val letters = setOf('A', 'B', 'C')
    for (letter in letters) {
        print(letter)
    }
}

fun main() {
    val set = mutableSetOf('A', 'B')
    set.add('C')
    println(set) // [A, B, C]
    set.remove('B')
    println(set) // [A, C]
}

// Map
// Creating a Map
fun main() {
    val capitals = mapOf("USA" to "Washington", "Poland" to "Warsaw", "Ukraine" to "Kyiv")
    //    val capitals = mapOf(
    //        Pair("USA", "Washington"),
    //        Pair("Poland", "Warsaw"),
    //        Pair("Ukraine", "Kyiv")
    //    )
    println(capitals) // {USA=Washington, Poland=Warsaw, Ukraine=Kyiv}
}

fun main() {
    val capitals: Map<String, String> =
        mapOf("USA" to "Washington", "Poland" to "Warsaw", "Ukraine" to "Kyiv")

    println(capitals) // {USA=Washington, Poland=Warsaw, Ukraine=Kyiv}

    val alphabet: Map<Char, Int> = mapOf('A' to 1, 'B' to 2, 'C' to 3)

    println(alphabet) // {A=1, B=2, C=3}
}

// Finding a value for a key 
fun main() {
    val alphabet: Map<Char, Int> = mapOf('A' to 1, 'B' to 2, 'C' to 3)
    val number: Int? = alphabet['A']
    println(number) // 1
    println(alphabet['B']) // 2
    println(alphabet['&']) // null
}

// Adding elements to a map
fun main() {
    val map1 = mapOf('A' to "Alex", 'B' to "Bob")
    val map2 = map1 + ('C' to "Celina")
    println(map1) // {A=Alex, B=Bob}
    println(map2) // {A=Alex, B=Bob, C=Celina}
    val map3 = mapOf('D' to "Daniel", 'E' to "Ellen")
    val map4 = map2 + map3
    println(map3) // {D=Daniel, E=Ellen}
    println(map4) // {A=Alex, B=Bob, C=Celina, D=Daniel, E=Ellen}
}

// Beware that duplicated keys are not allowed, so when you add a new association, it removes the old one.
fun main() {
    val map1 = mapOf('A' to "Alex", 'B' to "Bob")
    val map2 = map1 + ('B' to "Barbara")
    println(map1) // {A=Alex, B=Bob}
    println(map2) // {A=Alex, B=Barbara}
}

// remove certain key
fun main() {
    val map1 = mapOf('A' to "Alex", 'B' to "Bob")
    val map2 = map1 - 'B'
    println(map1) // {A=Alex, B=Bob}
    println(map2) // {A=Alex}
}

// Checking if a map contains a key
fun main() {
    val map = mapOf('A' to "Alex", 'B' to "Bob")
    println('A' in map) // true
    println('Z' in map) // false
}

fun main() {
    val map = mapOf('A' to "Alex", 'B' to "Bob")
    println(map.size) // 2
}

// Iterating over maps
fun main() {
    val map = mapOf('A' to "Alex", 'B' to "Bob")
    for (entry in map) {
        println("${entry.key} is for ${entry.value}")
    }
}

// A is for Alex
// B is for Bob

fun main() {
    val map = mapOf('A' to "Alex", 'B' to "Bob")
    for ((letter, name) in map) {
        println("$letter is for $name")
    }
}
// A is for Alex
// B is for Bob

// Mutable Map
fun main() {
    val map: MutableMap<Char, String> = mutableMapOf('A' to "Alex", 'B' to "Bob")
    map.put('C', "Celina")
    map['D'] = "Daria"
    println(map) // {A=Alex, B=Bob, D=Daria, C=Celina}
    map.remove('B')
    println(map) // {A=Alex, D=Daria, C=Celina}
}

// Practice Using Collections
//Step  1
class Comment(
    val userId: Int,
    val message: String
)
 
fun main() {
     // Step  2
    val comments: List<Comment> = listOf(
        Comment(5241, "Nice code"),
        Comment(6624, "Like it"),
        Comment(5224, "What’s going on?"),
        Comment(9001, "Check out my website"),
        Comment(8818, "Hello everyone :)")
    )
 
    // Step 3
    val blockedUserIds: Set<Int> = setOf(5224, 9001)
 
    // Step 4 
        val userIdToRelation: Map<Int, String> = mapOf(
        5241 to "friend",
        6624 to "close friend"
    )
 
    // Step 5
    for (comment in comments) {
        
        // Step 6
        if (comment.userId !in blockedUserIds) {
            
            val relation = userIdToRelation[comment.userId] ?: "unknown"
            
            // Step 7
            println("Comment ${comment.message} from $relation")
        }
    }
}