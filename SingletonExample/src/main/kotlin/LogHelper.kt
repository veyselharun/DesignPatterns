object LogHelper {
    private var logId: Int = 0

    init {
        println("Initialization code.")
    }

    fun logMessage(message: String) {
        logId++
        println("Log Id: $logId; Log Message: $message")
    }

}