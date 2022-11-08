
// Default arguments are set using the = operator after the type.
data class Mailv2(
    val to: List<String>,
    val cc: List<String> = listOf(), // Default argument
    val title: String = "", //Default argument
    val message: String = "", // Default argument
    val important: Boolean = false // Default argument
)
