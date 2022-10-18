

fun main() {

    // Single-expression function
    println(getGreeting())

}


fun greet(greeting: String): Unit {
    println(greeting)
}

fun getGreeting(): String {
    return "Hello World"
}

fun getGreeting2() = "Hello World"