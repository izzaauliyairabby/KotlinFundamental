// Object Oriented Programming
// Procedural
// Functional

// Interfaces and Polymorphysm. Its mean many form

Interfaces Animal {
    val breed: String
    fun pet()
}

class Cat(
    val name: String
    override val breed: String
): Animal {
    override fun pet() {
        println("Mrauuuuu")
    }
}

// Compile-time Polymorphism

fun main (args: Array<String>) {
  println(doubleof(4))
  println(doubleof(4.3))
  println(doubleof(4.323))
}
 
fun doubleof(a: Int):Int {
  return 2*a
}
 
fun doubleOf(a:Float):Float {
  return 2*a
}
 
fun doubleof(a:Double):Double {
  return 2.00*a
}

// 8
// 8.6
// 8.646

// Runtime Polymorphism

fun main(args: Array<string>){
  var a = Sup()
  a.method1()
  a.method2()
   
  var b = Sum()
  b.method1()
  b.method2()
}
 
open class Sup{
   open fun method1(){
       println("printing method 1 from inside Sup")
   }
   fun method2(){
       println("printing method 2 from inside Sup")
   }
}
 
class Sum:Sup(){
   override fun method1(){
       println("printing method 1 from inside Sum")
   }
}

// printing method 1 from inside Sup
// printing method 2 from inside Sup
// printing method 1 from inside Sum
// printing method 2 from inside Sup

interface Animal

class Dog(val name: String) : Animal {
    fun retrieve(item: String) {
        println("Retrieving $item")
    }
}

class Cat : Animal {
    fun pet() {
        println("Mrr")
    }
}

fun play(animal: Animal) {
    when (animal) {
        is Dog -> animal.retrieve("stick")
        is Cat -> animal.pet()
    }
}

fun main() {
    play(Dog("Rex")) // Retrieving stick
    play(Cat("Garfield")) // Mrr
}