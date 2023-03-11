// Interfaces Code
interface I
    {
        val a: Int = 123 // ERROR! You cannot define non-abstract properties in Interfaces
    }


// Abstract Classes
abstract class ShapeDrawer { 
    fun drawSquare(){ 
drawLine() 
    } 
    fun drawRectangle(){ 
        drawLine() 
    } 
    internal abstract fun drawLine() 
} 
class AndroidShapeDrawer():ShapeDrawer(){ 

    override fun drawLine() { 
        //code that draw lines for android platform 
        println("Test code -Draw line for  android platform") 
    } 
} 
class DesktopShapeDrawer():ShapeDrawer(){ 
    override fun drawLine() { 
        //code that draw lines for android platform 
        println("Test code -Draw line for  desktop platform") 
    } 
} 
fun main(){ 
    val androidDrawer:ShapeDrawer = AndroidShapeDrawer() 
    androidDrawer.drawSquare() 
    val desktopDrawer:ShapeDrawer = DesktopShapeDrawer() 
    desktopDrawer.drawSquare() 
} 

// Interface
// All methods are open
// Methods and members are abstracted by default
// A class can implement one or more interface

// Abstract class
// Methods can be open or non open 
// Methods and members can be abstract or non abstract
// A class can only be inherited  from one class

// Defining and using abstract classes 
abstract class SomeAbstractClass {
    abstract fun abstractMethod()
    fun callAbstractTwice() {
        abstractMethod() // You can use abstract methods inside the class, because it is assumed they
        // will be overridden in the child class.
        abstractMethod()
    }
}

class SomeRegularClass : SomeAbstractClass {
    override fun abstractMethod() {
        println("Calling abstract method")
    }
}

fun main() {
    val regular = SomeRegularClass()
    regular.abstractMethod() // Calling abstract method
    regular.callAbstractTwice()
    // Calling abstract method
    // Calling abstract method
}


// Use-case example of abstract classes
class AndroidShapeDrawer {
    fun drawLine(fromX: Int, fromY: Int, toX: Int, toY: Int) {
        /*...*/
    }
    fun drawSquare(x: Int, y: Int, size: Int) {
        /*...*/
    }
    fun drawRectangle(x: Int, y: Int, height: Int, width: Int) {
        /*...*/
    }
}

class WebsiteShapeDrawer {
    fun drawLine(fromX: Int, fromY: Int, toX: Int, toY: Int) {
        /*...*/
    }
    fun drawSquare(x: Int, y: Int, size: Int) {
        /*...*/
    }
    fun drawRectangle(x: Int, y: Int, height: Int, width: Int) {
        /*...*/
    }
}

class TerminalShapeDrawer {
    fun drawLine(fromX: Int, fromY: Int, toX: Int, toY: Int) {
        /*...*/
    }
    fun drawSquare(x: Int, y: Int, size: Int) {
        /*...*/
    }
    fun drawRectangle(x: Int, y: Int, height: Int, width: Int) {
        /*...*/
    }
}


abstract class ShapeDrawer {
 
    abstract fun drawLine(fromX: Int, fromY: Int, toX: Int, toY: Int)
 
    fun drawSquare(x: Int, y: Int, size: Int) {
        drawLine(x, y, x + size, y)
        drawLine(x + size, y, x + size, y + size)
        drawLine(x, y, x, y + size)
        drawLine(x, y + size, x + size, y + size)
    }
 
    fun drawRectangle(x: Int, y: Int, height: Int, width: Int) {
        drawLine(x, y, x + width, y)
        drawLine(x + width, y, x + width, y + height)
        drawLine(x, y, x, y + height)
        drawLine(x, y + height, x + width, y + height)
    }
}
 
 
class AndroidShapeDrawer: ShapeDrawer() {
    override fun drawLine(fromX: Int, fromY: Int, toX: Int, toY: Int) { /*...*/ }
}
 
class WebsiteShapeDrawer: ShapeDrawer() {
    override fun drawLine(fromX: Int, fromY: Int, toX: Int, toY: Int) { /*...*/ }
}
 
class TerminalShapeDrawer: ShapeDrawer() {
    override fun drawLine(fromX: Int, fromY: Int, toX: Int, toY: Int) { /*...*/ }
}
