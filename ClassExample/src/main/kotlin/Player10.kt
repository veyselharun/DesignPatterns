import kotlin.random.*

class Player10 () : DiceRoller {

    override fun rollDice() = Random.nextInt(0, 6)

}

class Player11 () : DiceRoller1 {

}