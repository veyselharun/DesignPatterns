package witCommand

fun main() {
    val t = Trooper()

    t.addOrder(moveGenerator(t, 1, 1))
    t.addOrder(moveGenerator(t, 2, 2))
    t.addOrder(moveGenerator(t, 3, 3))

    // Adding the move function to the mutable list of orders (move functions).
    // t.addOrder( fun() {t.move(x, y)} )

    // Do something
    t.executeOrders()
}

open class Trooper {
    private val orders = mutableListOf<Command>()

    fun addOrder(order: Command) {
        this.orders.add(order)
    }

    fun executeOrders() {
        while (orders.isNotEmpty()) {
            val order = orders.removeFirst()
            order()
            // We are calling the move function.
            // order() == fun() {t.move(x, y)}
        }
    }

    fun move(x: Int, y: Int) {
        println("Moving to $x:$y")
    }
}


// Command represents a function that returns void.
typealias Command = () -> Unit


// Higher order function. Returns a function.
val moveGenerator = fun(
    s: Trooper,
    x: Int,
    y: Int
): Command {
    return fun() {
        s.move(x, y)
    }
}


/*
fun moveGenerator(
    s: Trooper,
    x: Int,
    y: Int
): Command {
    return fun() {
        s.move(x, y)
    }
}
 */