println("A" == "A") // true
println("A" == "B") // false
println( 1 < 2) // true
println( 1 > 2) // false
println( 1 <= 2) // true
println( 1 >= 2) // false
println( 1 != 2) // true
println( 1 != 1) // false

// YES / NO
// ON / OFF
// TRUE / FALSE

val isKotlinFun: Boolean = true
val isFishTasty: Boolean = false
println(isKotlinFun)   // Outputs true
println(isFishTasty)   // Outputs false 


// and operator &&
fun main() { 
    val finishedHomework = false // or true 
    val cleanedRoom = true // or false 
    val canPlayGames = finishedHomework && cleanedRoom 
    println(canPlayGames) 
} 

fun main() { 
    print(true && true)  // true 
    print(true && false)  // false 
    print(false && true)  // false 
    print(false && false)  // false 
}

// or operator ||
fun main() { 
    val carCleaned = false // or true 
    val grassCut = true // or false 
    val canGoToCinema = carCleaned || grassCut 
    println(canGoToCinema) 
} 

// not operator !
fun main() { 
    println(!true) // false 
    println(!false) // true 

    val isAmazing = true 
    print(!isAmazing) // false 
    
    isBoring = false 
    print(!isBoring) // true 
} 

/*
Reading logical expressions
You may find much longer and more complex logical expressions. It helps to read them aloud. You can read it in the following way:

&& as and,

|| as or,

! in front of a value as not and in front of a bracket as it is not true that.

Now practice by reading the following logical expressions out loud:

cleanedRoom && passedTest (should be "cleaned room and passed test").

!isGrounded || passedTest (should be "is not grounded or passed test").

cleanedRoom && !passedTest (should be "cleaned room and not passed test").

!(isGrounded && !passedTest) (should be "it is not true, he is grounded and didn't pass the test")

!(!cleanedRoom || !passedTest) (should be "it is not true, he has not cleaned room or not passed test")

Some logical expressions can be simplified. There is a rule that !(!a && !b) can be replaced with a || b or !(!a || !b) can be replaced with a && b. That means that the expression !(!cleanedRoom || !passedTest) can be replaced with cleanedRoom && passedTest and the expression !(isGrounded && !passedTest) can be replaced with !isGrounded || passedTest.   */