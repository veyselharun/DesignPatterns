import java.util.stream.Stream


// Two adapters: one for power plugs and another one for USB ports.

fun main() {

    // This code won't work
    /*
    cellPhone(
        // Type mismatch: inferred type is UsbMini but UsbTypeC was expected
        charger(
            // Type mismatch: inferred type is USPlug but EUPlug was expected
            usPowerOutlet()
        )
    )*/

    cellPhone(
        charger(
            usPowerOutlet().toEUPlug()
        ).toUsbTypeC()
    )

    usPowerOutlet().toEUPlug()
    charger(usPowerOutlet().toEUPlug())
    charger(usPowerOutlet().toEUPlug()).toUsbTypeC()
    cellPhone(charger(usPowerOutlet().toEUPlug()).toUsbTypeC())
}


interface USPlug {
    val hasPower: Int
}

interface EUPlug {
    val hasPower: String // "TRUE" or "FALSE"
}

enum class Power {
    TRUE, FALSE
}


interface UsbMini {
    val hasPower: Power
}

interface UsbTypeC {
    val hasPower: Boolean
}


fun cellPhone(chargeCable: UsbTypeC) {
    if (chargeCable.hasPower) {
        println("I've Got The Power!")
    } else {
        println("No power")
    }
}


// Power outlet exposes USPlug interface
fun usPowerOutlet(): USPlug {
    return object : USPlug {
        override val hasPower = 1
    }
}


// Charger accepts EUPlug interface and exposes UsbMini interface
fun charger(plug: EUPlug): UsbMini {
    return object : UsbMini {
        override val hasPower = Power.valueOf(plug.hasPower)
    }
}


// Adapt the US plug to work with the EU plug
// Usage of extension function.
fun USPlug.toEUPlug(): EUPlug {
    val hasPower = if (this.hasPower == 1) "TRUE" else "FALSE"
    return object : EUPlug {
        // Transfer power
        override val hasPower = hasPower
    }
}


// Adapt Mini USB to USB-C
// Usage of extension function
// This keyword in the context of an extension function refers to the object we're extending
fun UsbMini.toUsbTypeC(): UsbTypeC {
    val hasPower = this.hasPower == Power.TRUE
    return object : UsbTypeC {
        override val hasPower = hasPower
    }
}










