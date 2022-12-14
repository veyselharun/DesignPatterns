// In this example we add a squad class composed of troopers without
// using composite pattern.
// We can make this implementation more elegant using composite pattern.

package withoutComposite

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
    val trooperList = listOf(bobaFett.copy(), bobaFett.copy(),
        bobaFett.copy())
    //val squad = Squad(listOf(bobaFett.copy(), bobaFett.copy(),
    //    bobaFett.copy()))
    val squad = Squad(trooperList)
    squad.move(2L, 2L)
    squad.attackRebel(3L, 2L)


    // What happens when we change our interface?
    // For example, we need to add a new function to it like fun retreat().
    // We need to change the Squad class.
}


// Add a squad of stormtroopers
// This class implements Trooper interface because we want a squad act as a
// single unit like a troop. We want all functionality of Trooper must be
// implemented by this class.
class Squad(private val units: List<Trooper>) : Trooper {
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