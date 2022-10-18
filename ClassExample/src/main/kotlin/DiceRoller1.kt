import kotlin.random.Random

interface DiceRoller1 {

    fun rollDice() = Random.nextInt(0, 6)

}