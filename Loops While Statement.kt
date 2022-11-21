fun main() {
    print(1)
    print(2)
}

fun main() {
    println("Will be printed")
    if (true) {
        print("Will be printed")
    }
    if (false) {
        print("Will not be printed!")
    }
        println("Will be printed")
}

fun main() {
        while (false) {
            println("Will not be printed")
        }
        if (false) {
            println("Will not be printed")
        }
    }

fun main() {
    while (true) {
        println("Prints forever!")
    }
}

fun main() {
        var toBePrinted = true
        while (toBePrinted) {
            println("Will be printed once")
            toBePrinted = false
        }
    }

fun main() {
    var printedTimes = 0
    while (printedTimes <= 2) {
        println("Line $printedTimes");
        printedTimes += 1
        // or
        // printedTimes = printedTimes + 1
    }
}

// Mathematical sequences

fun main() {
        var num = 0
        while (num < 100) {
            println(num)
            num += 7 // or num = num + 7
        }
    }

fun main() {
    var num = 1
    while (num <= 100) {
        println(num)
        num *= 2 // or num = num * 2
    }
}

fun main() {
        var i = 1
        while (i * i <= 100) {
            println(i * i)
            i++
            // or i += 1
            // or i = i + 1
        }
    }
