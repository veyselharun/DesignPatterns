import java.security.MessageDigest
import java.math.BigInteger

fun main(args: Array<String>) {

    // println(hashMD5("Message"))
    // println(hashSHA1("Message"))

    val myValidator = Validator()

    // User default hasher which is md5
    myValidator.validate("Ayse", "Sifre")

    // Change strategy
    // :: operator allows to refer to a function as if it was a variable instead of invoking it.
    myValidator.currentHasher = Hashers::hashSHA1
    myValidator.validate("Mehmet", "Sifre")
}

class Validator {

    // Default hasher
    var currentHasher = Hashers::hashMD5

    val validate = fun(user: String, password: String) : Boolean {
        val hashedPassword = currentHasher(password)
        println("User: $user - Password: $hashedPassword")
        // Add control logic to check username and password
        // Return the result
        return true
    }
}

object Hashers {

    fun hashMD5(password: String): String {
        val myMessageDigest = MessageDigest.getInstance("MD5")
        val myBytes = myMessageDigest.digest(password.toByteArray())
        val myHashedString = BigInteger(1, myBytes).toString(16).padStart(32, '0')
        return myHashedString
    }

    fun hashSHA1(password: String): String {
        val myMessageDigest = MessageDigest.getInstance("SHA-1")
        val myBytes = myMessageDigest.digest(password.toByteArray())
        val myHashedString = BigInteger(1, myBytes).toString(16).padStart(32, '0')
        return myHashedString
    }
}
