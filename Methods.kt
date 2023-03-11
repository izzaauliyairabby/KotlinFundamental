class Barista(
    val name: String
) {
    fun makeCoffe() {
        println("$name Making Coffe")
    }
}

fun main() {
    val barista = Barista(name: "Jake")
    barista.makeCoffe()
}

fun makeLatte (type: String, size: Int): Coffe {
    println("$name makes coffe of $type size $size")
    return Coffe(type, size)
}

class Coffe(
    val type: String,
    val size: Int,
)

fun text() {
    val text = "THIS IS COFFE"
    println(text.uppercase())
    println(text.lowercase())
    println(text.replace())
}

// Receiver
/*If you want to call a method, you need to have an object. You can then call this method on an object. 

For instance, when you have a class Dog with a method feed, to call this method outside the class, you need to first have an object of type Dog. */
class Dog(val name: String) {

    val hunger = 62

    fun feed() {

        println("Feeding $name")

        hunger = 0
    }
}

fun main() {

    val dog = Dog("Rex")

    dog.feed() // Feeding Rex
}

// Exercise: Practice defining Classes, Methods and Functions

// full Player class and fullName function 

class Player(var name:String, var surName:String) 

{ 

  var totalScore = 0 

    var personalBestScore = 0 

    fun fullName (): String{ 

        return name +" "+surName; 

    } 

} 

 
// full Scores class and checkBest function 

class Scores() 

{ 

   fun checkBest(best:Int, current:Int): Int 

{ 

if(best < current) 

      	{ 

            return current; 

      	} 

        return best; 

} 

    

} 

 

fun main()  

{ 

    // initalise Player objects 

val P1 = Player("Nicola", "Tesla") 

val P2 = Player("Thomas", " Edison " ) 

// create working variables 

val scoring = Scores()  // instance of the Scores class to allow access to checkBest function 

var lvlScore= 0 // variable to simulate Player level score 

 

// Level 1 

lvlScore = 12 // insert simulated values for level score 

P1.totalScore += lvlScore; // use the combined operator (+=) to add the lvlScore to totalScore 

// suppy the parameters for the checkBest function by accessing the Player properties 

P1.personalBestScore = scoring.checkBest(P1.personalBestScore,lvlScore); 

 

lvlScore = 34 

P2.totalScore += lvlScore; 

P2.personalBestScore = scoring. checkBest(P2.personalBestScore,lvlScore); 

 

// Level 2 

lvlScore = 56 // insert simulated values for level score 

P1.totalScore += lvlScore; // use the combined operator (+=) to add the lvlScore to totalScore 

// suppy the parameters for the checkBest function by accessing the Player properties 

P1.personalBestScore = scoring.checkBest(P1.personalBestScore,lvlScore); 

 

lvlScore = 78 // insert simulated values for level score 

P2.totalScore += lvlScore; 

P2.personalBestScore = scoring. checkBest(P2.personalBestScore,lvlScore); 

 

// Level 3 

lvlScore = 99 // insert simulated values for level score 

P1.totalScore += lvlScore; // use the combined operator (+=) to add the lvlScore to totalScore 

// suppy the parameters for the checkBest function by accessing the Player properties 

P1.personalBestScore = scoring.checkBest(P1.personalBestScore,lvlScore); 

 

lvlScore = 10 

P2.totalScore += lvlScore; 

P2.personalBestScore = scoring.checkBest(P2.personalBestScore,lvlScore); 

 

// conditional check using an if statement to determine the winner 

if(P1.totalScore > P2.totalScore) 

{ 

// access the Player properties to construct the String to print 

println("The winner is "+ P1.fullName() +  " with a Score of  "+P1.totalScore); 

println("Personal Best Score is = " +P1.personalBestScore); 

} 

else 

{ 

println("The winner is "+ P2.fullName() + " with a Score of "+P2.totalScore); 

println("Personal Best Score is = " +P2.personalBestScore); 

} 

} 

class Player(var name:String, var surName:String) 
{ 
    fun fullName (): String{ 
        return name +" "+surName; 
    } 
} 

fun main()  
{ 
    // initalise Player objects 
val P1 = Player("Nicola", "Tesla") 
val P2 = Player("Thomas", " Edison " ) 
} 

class Player(var name:String, var surName:String) 
{ 
  var totalScore = 0 
    var personalBestScore = 0 
    fun fullName (): String{ 
        return name +" "+surName; 
    } 
} 
 
 
 
 
// full Scores class and checkBest function 
class Scores() 
{ 
   fun checkBest(best:Int, current:Int): Int 
{ 
if(best < current) 
      	{ 
            return current; 
      	} 
        return best; 
} 
    
} 

fun main()  
{ 
    // initalise Player objects 
val P1 = Player("Nicola", "Tesla") 
val P2 = Player("Thomas", " Edison " ) 
// create working variables 
val scoring = Scores()  // instance of the Scores class to allow access to checkBest function 
var lvlScore= 0 // variable to simulate Player level score 
 
// Level 1 
lvlScore = 12 // insert simulated values for level score 
P1.totalScore += lvlScore; // use the combined operator (+=) to add the lvlScore to totalScore 
// suppy the parameters for the checkBest function by accessing the Player properties 
P1.personalBestScore = scoring.checkBest(P1.personalBestScore,lvlScore); 
 
lvlScore = 34 
P2.totalScore += lvlScore; 
P2.personalBestScore = scoring. checkBest(P2.personalBestScore,lvlScore); 
 
// Level 2 
lvlScore = 56 // insert simulated values for level score 
P1.totalScore += lvlScore; // use the combined operator (+=) to add the lvlScore to totalScore 
// suppy the parameters for the checkBest function by accessing the Player properties 
P1.personalBestScore = scoring.checkBest(P1.personalBestScore,lvlScore); 
 
lvlScore = 78 // insert simulated values for level score 
P2.totalScore += lvlScore; 
P2.personalBestScore = scoring. checkBest(P2.personalBestScore,lvlScore); 
 
// Level 3 
lvlScore = 99 // insert simulated values for level score 
P1.totalScore += lvlScore; // use the combined operator (+=) to add the lvlScore to totalScore 
// suppy the parameters for the checkBest function by accessing the Player properties 
P1.personalBestScore = scoring.checkBest(P1.personalBestScore,lvlScore); 
 
lvlScore = 10 
P2.totalScore += lvlScore; 
P2.personalBestScore = scoring.checkBest(P2.personalBestScore,lvlScore); 
 
// conditional check using an if statement to determine the winner 
if(P1.totalScore > P2.totalScore) 
{ 
// access the Player properties to construct the String to print 
println("The winner is "+ P1.fullName() +  " with a Score of  "+P1.totalScore); 
println("Personal Best Score is = " +P1.personalBestScore); 
} 
else 
{ 
println("The winner is "+ P2.fullName() + " with a Score of "+P2.totalScore); 
println("Personal Best Score is = " +P2.personalBestScore); 
} 
} 
