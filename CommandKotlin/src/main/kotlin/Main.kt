package withoutCommand

fun main() {
    val t = Trooper()

    t.move(1, 1)
    t.move(2, 2)
    t.move(3, 3)

}

open class Trooper {

    fun move(x: Int, y: Int) {
        println("Moving to $x:$y")
    }

}
