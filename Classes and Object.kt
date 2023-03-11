class Employee (
    val name: String,
    val position: String,
)

{
    
fun main() {
    val employee1 = Employee( name: "Alex", position: "Manager")
    val employee2 = Employee(name: "Bob", position: "Waiter")
}
}

println(employee1.name) // Alex
println(employee1.position) // Manager
println(employee2.name) // Bob
println(employee2.position) // Waiter
employee2.position = "Manager"

// More on properties and primary constructor


class Student

class Teacher

class Subject

class Subject(
    val name: String,
    val teacher: Teacher,
    val isObligatory: Boolean,
)

class Teacher(
    val name: String,
    val surname: String,
    val birthday: String,
    val status: String,
)

fun main() {
    // I use named arguments convention here
    val remigiuszFrost =
        Teacher(name = "Remigiusz", surname = "Frost", birthday = "23.07.1987", status = "ACTIVE")
    val biology1 = Subject(name = "Biology 1", teacher = remigiuszFrost, isObligatory = true)
    println(biology1.isObligatory) // true
    println(biology1.teacher.birthday) // 23.07.1987
    println(biology1.teacher.status) // ACTIVE
}

class Student(
    val id: Int,
    val name: String,
    val surname: String,
)

class Grade(val points: Int, val studentId: Int, val topicId: Int)

class Student(
    val id: Int,
    val name: String,
    val surname: String,
)