// In this example we add a squad class composed of troopers
// using composite pattern.

package withComposite

// Typealias example
typealias PointsOfDamage = Long
typealias Meters = Int


// const example
const val RIFLE_DAMAGE = 3L
const val REGULAR_SPEED: Meters = 1


fun main() {

    // After adding a squad of stormtroopers create and add
    // stormtroopers to the squad.
    val bobaFett = StormTrooper(Rifle(), RegularLegs())

    // Create the object using primary constructor
    val squad = Squad(listOf(bobaFett.copy(), bobaFett.copy(), bobaFett.copy()))

    squad.attackRebel(1, 2)

    // Create the object using secondary constructor
    val secondSquad = Squad(
        bobaFett.copy(),
        bobaFett.copy(),
        bobaFett.copy()
    )

    // Create the object using secondary constructor
    val thirdSquad = Squad(
        bobaFett.copy(),
        bobaFett.copy(),
        bobaFett.copy(),
        bobaFett.copy()
    )

    // Create a platoon that is composed of a number of squads.
    val platoon = Squad(Squad(), Squad())
}


// Add a squad of stormtroopers
// This class implements Trooper interface because we want a squat act as a
// single unit like a troop. We want all functionality of Trooper must be
// implemented by this class.
class Squad(private val units: List<Trooper>) : Trooper {

    // Secondary constructor
    // --vararg-- keyword in the constructor tells us that this constructor
    // takes variable number of troopers as argument.
    // With --this-- keyword we call primary constructor.
    // --toList()-- is an adapter function that converts the units to a list.
    // Then we call the primary constructor the list of troopers.
    constructor(vararg units: Trooper) : this(units.toList())

    override fun move(x: Long, y: Long) {
        for (u in units) {
            u.move(x, y)
        }
    }

    override fun attackRebel(x: Long, y: Long) {
        for (u in units) {
            u.attackRebel(x, y)
        }
    }
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
    fun attack(x: Long, y: Long): PointsOfDamage
}


interface Legs {
    fun move(x: Long, y: Long): Meters
}


class Rifle : Weapon {
    override fun attack(x: Long, y: Long) = RIFLE_DAMAGE
}

class Flamethrower : Weapon {
    override fun attack(x: Long, y: Long) = RIFLE_DAMAGE * 2
}

class Batton : Weapon {
    override fun attack(x: Long, y: Long) = RIFLE_DAMAGE * 3
}


class RegularLegs : Legs {
    override fun move(x: Long, y: Long) = REGULAR_SPEED
}

class AthleticLegs : Legs {
    override fun move(x: Long, y: Long) = REGULAR_SPEED * 2
}