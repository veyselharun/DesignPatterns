abstract class Moveable {

    protected var x: Int = 0
    public var y: Int = 0
    // private var y: Int = 0 // Error in accessing from child classes

    open fun move(x: Int, y: Int) {
        this.x = x
        this.y = y
    }
}