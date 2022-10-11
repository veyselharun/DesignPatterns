

fun main(args: Array<String>) {

    // println("Hello World!")
    // println("Program arguments: ${args.joinToString()}")

    // Type Inference
    /*
    var message = "Hello World"
    var message: String = "Hello World"
    println(message)

    message = 56

    message = 56.toString()
    println(message)
     */

    // Values - Immutable, Read-only
    /*
    val message = "Hello World"
    message = "World"
     */

    // Comparison and Equality
    // == and equals() -> Structural equality. Check whether two values are
    // equal.
    // === -> Referential equality. Check whether two references point to the
    // same object.
    // For values represented by primitive types at runtime === is
    // equivalent to == .
    /*
    val a = 4000
    val b = 4000
    println(a == b)
    println(a.equals(b))
     */

    // For values represented by primitive types at runtime the === equality
    // check is equivalent to the == check.
    /*
    println(a === b)

    val firstString: String = "Test 1"
    val secondString: String = "Test 1"
    println(firstString === secondString)
     */


    // Null Safety
    /*
    val s: String = null
    val s: String? = null
     */

    // Short function
    //println(getGreeting())


    // Lists
    //val hobbits = listOf("Frodo", "Sam", "Pippin", "Merry")
    val hobbits: List<String> = listOf("Frodo", "Sam", "Pippin", "Merry")
    println(hobbits[3])

    val champions = setOf("France", "Germany", "Spain", "Italy",
        "Brazil", "France", "Brazil", "Germany")

    println(champions)
    println("Italy" in champions)
    println("Türkiye" in champions)

    val movieBatmans = mapOf(
        "Batman Returns" to "Michael Keaton",
        "Batman Forever" to "Val Kilmer",
        "Batman & Robin" to "George Clooney"
    )
    println(movieBatmans)
    println(movieBatmans["Batman Returns"])
    println(" Batman Begins " !in movieBatmans)


    val editableHobbits = mutableListOf("Frodo", "Sam", "Pippin", "Merry")
    editableHobbits.add("Bilbo")

    val edChampions = mutableSetOf("France", "Germany", "Spain", "Italy",
        "Brazil", "France", "Brazil", "Germany")
    edChampions.add("Türkiye")


    // val musketeers = arrayOf("Athos", "Porthos", "Aramis")
    val musketeers: Array<String> = arrayOf("Athos", "Porthos", "Aramis")
}

fun greet(greeting: String): Unit {
    println(greeting)
}

fun getGreeting(): String {
    return "Hello World"
}

fun getGreeting2() = "Hello World"

// If conditional
fun returnMinimum1(first: Int, second: Int): Int {
    if (first > second) {
        return second
    } else {
        return first
    }
}

fun returnMinimum2(first: Int, second: Int): Int {
    return if (first > second) {
        second
    } else {
        first
    }
}

fun returnMinimum3(first: Int, second: Int) = if (first > second) second else first