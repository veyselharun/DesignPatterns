

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
    // Below is the empty platoon. We can not iterate over it.
    // We will get error.
    // val platoon = Squad(Squad(), Squad())

    // Create a new platoon.
    val platoon = Squad(secondSquad, thirdSquad, bobaFett)

    // Does not compile without an iterator
    // Error: For-loop range must have an 'iterator()' method
    // for (trooper in platoon) {
        //println(trooper)
    //}

    for (trooper in platoon) {
        println(trooper)
    }
}



class TrooperIterator(private val units: List<Trooper>) : Iterator<Trooper> {

    private var i = 0

    private var iterator: Iterator<Trooper> = this

    override fun hasNext(): Boolean {
        if (i >= units.size) {
            return false
        }
        if (i == units.size - 1) {
            if (iterator != this) {
                return iterator.hasNext()
            }
        }
        return true
    }

    override fun next(): Trooper {
        if (iterator != this) {
            if (iterator.hasNext()) {
                return iterator.next()
            } else {
                i++
                iterator = this
            }
        }

        return when (val e = units[i]) {
            is Squad -> {
                iterator = e.iterator()
                this.next()
            }
            else -> {
                i++
                e
            }
        }
    }
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

    operator fun iterator(): Iterator<Trooper> {
        return TrooperIterator(units)
    }

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