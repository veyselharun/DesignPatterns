package withBridge


fun main() {
    val stormTrooper = StormTrooper(Rifle(), RegularLegs())
    val flameTrooper = StormTrooper(Flamethrower(), RegularLegs())
    val scoutTrooper = StormTrooper(Rifle(), AthleticLegs())

    println(listOf(stormTrooper, flameTrooper, scoutTrooper))
}


interface Trooper {
    fun move(x: Long, y: Long)

    fun attackRebel(x: Long, y: Long)
}


data class StormTrooper(
    private val weapon: Weapon,
    private val legs: Legs
) : Trooper {
    override fun move(x: Long, y: Long) {
        legs.move(x, y)
    }

    override fun attackRebel(x: Long, y: Long) {
        println("Attacking")
        weapon.attack(x, y)
    }
}


interface Weapon {
    fun attack(x: Long, y: Long): Long
}

interface Legs {
    fun move(x: Long, y: Long): Int
}


class Rifle : Weapon {
    override fun attack(x: Long, y: Long) = 3L
}

class Flamethrower : Weapon {
    override fun attack(x: Long, y: Long) = 3L * 2
}

class Batton : Weapon {
    override fun attack(x: Long, y: Long) = 3L * 3
}


class RegularLegs : Legs {
    override fun move(x: Long, y: Long) = 1
}

class AthleticLegs : Legs {
    override fun move(x: Long, y: Long) = 1 * 2
}