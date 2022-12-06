package withoutBridge


fun main(args: Array<String>) {

    val stormTrooper = StormTrooper()
    val flameTrooper = FlameTrooper()
    val scoutTrooper = ScoutTrooper()

    println(listOf(stormTrooper, flameTrooper, scoutTrooper))
}


interface Trooper {
    fun move(x: Long, y: Long)
    fun attackRebel(x: Long, y: Long)

    // Assume we want to add shout functionality to stormtroopers.
    // fun shout(): String
}


open class StormTrooper : Trooper {
    override fun move(x: Long, y: Long) {
        // Move at normal speed
    }
    override fun attackRebel(x: Long, y: Long) {
        // Missed most of the time
    }
}

open class ShockTrooper : Trooper {
    override fun move(x: Long, y: Long) {
        // Moves slower than regular StormTrooper
    }
    override fun attackRebel(x: Long, y: Long) {
        // Sometimes hits
    }
}


class RiotControlTrooper : StormTrooper() {
    override fun attackRebel(x: Long, y: Long) {
        // Has an electric baton, stay away!
    }
}

class FlameTrooper : ShockTrooper() {
    override fun attackRebel(x: Long, y: Long) {
        // Uses flametrower, dangerous!
    }
}

class ScoutTrooper : ShockTrooper() {
    override fun move(x: Long, y: Long) {
        // Runs faster
    }
}