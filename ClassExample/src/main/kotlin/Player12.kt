class Player12(name: String) : Moveable(), DiceRoller1 {


}

open class Player13(name: String) : Moveable(), DiceRoller1 {

    override fun move(x: Int, y: Int) {
        this.x = y // must be declared protected
        this.y = x // must be declared protected
    }

}

class Player14(name: String) : Player13(name) {

    override fun move(x: Int, y: Int) {
        this.x = y // must be declared protected
        this.y = x // must be declared protected
    }
}