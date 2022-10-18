

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

    // Collections
    /*
    val hobbits = listOf("Frodo", "Sam", "Pippin", "Merry")
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


    val musketeers = arrayOf("Athos", "Porthos", "Aramis")
    val musketeers: Array<String> = arrayOf("Athos", "Porthos", "Aramis")
     */

    // For loop
    /*
    val items1 = listOf("apple","banana", "kiwifruit")
    for (item in items1) {
        println(item)
    }

    val items2 = listOf("apple","banana", "kiwifruit")
    for (index in items2.indices) {
        println("item at $index is ${items2[index]}")
    }

    for (i in 0..9) {
        println(i)
    }

    for (i in 0 until 10) {
        println("for until $i")
    }

    for (i in 9 downTo 0) {
        println("for downTo $i")
    }

    for (i in 0..9 step 2) {
        println(i)
    }

    for (i in 0 until 10 step 2) {
        println("for until $i")
    }
     */


    // While loop
    /*
    var x = 0
    while (x < 10) {
        x++
        println("while $x")
    }

    var x = 5
    do {
        println("do while $x")
        x--
    } while (x > 0)
     */

    multiLineExample()

}



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


// When expression
fun describe(obj: Any): String =
    when (obj) {
        1          -> "One"
        "Hello"    -> "Greeting"
        is Long    -> "Long"
        !is String -> "Not a string"
        else       -> "Unknown"
    }


// Working with Text
// String Interpolation
fun archenemy(heroName: String) = when (heroName) {
    "Batman"     -> "Joker"
    "Superman"   -> "Lex Luthor"
    "Spider-Man" -> "Green Goblin"
    else         -> "Sorry, no idea"
}

fun printResult() {
    val hero = "Batman"
    println("Archenemy of $hero is ${archenemy(hero)}")
}

// Multiline Strings
fun multiLineExample() {
    println("Twinkle, Twinkle Little Bat\n" +
            "How I wonder what you're at!\n" +
            "Up above the world you fly,\n" +
            "Like a tea tray in the sky.\n" +
            "Twinkle, twinkle, little bat!\n" +
            "How I wonder what you're at!")

    println("""Twinkle, Twinkle Little Bat
           How I wonder what you're at!
           Up above the world you fly,
           Like a tea tray in the sky.
           Twinkle, twinkle, little bat!
           How I wonder what you're at!""")

    println("""
        Twinkle, Twinkle Little Bat
        How I wonder what you're at!
           Up above the world you fly,
           Like a tea tray in the sky.
           Twinkle, twinkle, little bat!
           How I wonder what you're at!""".trimIndent())

    val message = """
        Twinkle, Twinkle Little Bat
        How I wonder what you're at!
        Up above the world you fly,
        Like a tea tray in the sky.
        Twinkle, twinkle, little bat!
        How I wonder what you're at!
    """.trimIndent()

    println(message)

    // Escape quotes
    println("From \" Alice's Adventures in Wonderland\" ")

    println(""" From " Alice's Adventures in Wonderland" """)
}

