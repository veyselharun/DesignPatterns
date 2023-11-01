import java.time.LocalTime

object LogHelper {
    private var logStamp = 0
    init {
        val message = "Stamp\tTime\tMessage"
        println(message)
    }
    fun printLogMessage(logMessage: String) {
        logStamp++
        val logTime = LocalTime.now().toString()
        val message = logStamp.toString() + "\t" + logTime + "\t" + logMessage
        println(message)
    }
}