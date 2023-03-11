var name: String? = null
var i: Int? = null
var c: Char? = null

class User (
    val name: String)
var user: User? = null

fun processUser(user: User?): User? {
    return null
}

fun main () {
    val user = User(name: null) 
    val result: User? = processUser(user:null)
}

// Part of Kotlin’s language design is to avoid errors due to null values. The following code demonstrates this design choice.
var message: String = "Hello World"
message = null // compilation error

// Null pointer exception (NPE)
var length = message.length // This always works

// Defining a null value
var message: String? = "Hello World"            
message = null // this is ok

var message: String? = "Hello World"
message = null //Assign null to the variable
var length = message.length // Will cause a Null Pointer Exception

var message: String? = "Hello World"

message = null // Assign null to the variable

if (message != null) {

    var length =
        message.length // Will not cause an error because you have checked that the value is not null

    print(length)
} else {

    print(null)
}

// Safe call
var message: String? = "Hello World"
print(message?.length) //Will print 11
message = null //Assign null to the variable
print(message?.length) //Will print null

var message: String? = "Hello World"
print(message?.uppercase()) //Will print HELLO WORLD
message = null //Assign null to the variable
print(message?.uppercase()) //Will print null

// USING NULLABLE VALUES

class User(
    val name: String
) {
    fun cheer() {
        println("Hello, my name is $name")
    }
}

fun printUserName(user: User?) {
    println(user?.name)
    user?.cheer()
}

fun main() {
    val userWithDefault: User = user ?: User(name: "(undefined)")
    println(userWithDefault.name)
    userWithDefault.cheer()
}

fun main() { // assertion exception
    printUserName(User(name:"Jake"))
    println("***")
    printUserName(user:null)
}

fun printUserName(user: User?) {
    if (user != null) {
    println(user?.name)
    user?.cheer()
    }
}

//SMART CASTING
fun consume(a: Any) {
    if (a is String) {
println(a.length) // the type of a is String
    }
    if (a is Int) {
println(a * 10) // the type of a is Int
    }
}

fun main() {
    consume("ABC") // 3
consume(10) // 100
}

// Smart-casting can also be used to deal with nullability
fun consume(a: String?) {
    if (a != null) {
println(a.length) // the type of a is String
    } else {
println("Cannot handle null")
    }
}

fun main() {
    consume("ABC") // 3
    consume(null) // Cannot handle null
}

fun consumeA(a: String?) {
    if (a == null || a.length == 0) return // after || a is smart-casted to String
println(a.length) // the type of a is String
}

fun main() {
    consume("ABC") // 3
    consume(null)
consume("")
}

// limitation
var a: String? = null

fun main() {
    a = "Sam"
    if (a != null) {
println(a.length) // COMPILATION ERROR, smart-casting not allowed
    }
}


// CODE SOLUTION
//step 1 
data class Student(val fullName: String, var id: Int,var grade:Double)   
 
val students = listOf<Student>( 
    Student("John", 223,140.0), 
    Student("Mark", 548,120.0), 
    Student("Natali", 342,150.0), 
    Student("Sara", 781,130.0) 
) 
 
 
fun main() { 
//    step 4 
    println("Please, Enter the student's ID") 
    val id = readln().toInt() 
    println( getStudentById(id)) 
    println("Please, Enter the student's name") 
    val name= readln() 
    println(searchInStudents(name)?:"the student is not found") 
} 
//step 2 
fun getStudentById(id:Int):Student{ 
  return  students.find { it.id==id }!! 
} 
//step 3 
fun searchInStudents(name:String):Student?{ 
    return students.find { it.fullName.lowercase()==name.lowercase()} 
}
// Step 2
//step 1 
data class Student(val fullName: String, var id: Int,var gra  de:Double) 
 
val students = listOf<Student>( 
    Student("John", 223,140.0), 
    Student("Mark", 548,120.0), 
    Student("Natali", 342,150.0), 
    Student("Sara", 781,130.0) 
) 
//step 2 
fun getStudentById(id:Int):Student{ 
  return  students.find { it.id==id }!! 
} 

//step 3 
fun searchInStudents(name:String):Student?{ 
    return students.find { it.fullName.lowercase()==name.lowercase()} 
} 

//    step 4 
    println("Please, Enter the student's ID") 
    val id = readln().toInt() 
    println( getStudentById(id)) 
    println("Please, Enter the student's name") 
    val name= readln() 
    println(searchInStudents(name)?:"the student is not found") 