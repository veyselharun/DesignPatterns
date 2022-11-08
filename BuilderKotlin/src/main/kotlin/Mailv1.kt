data class Mailv1(
    val to: List<String>, // list of emails
    val cc: List<String>?, // is nullable - list of emails or null
    val title: String?, // is nullable
    val message: String?, // is nullable
    val important: Boolean, // Trailing comma. To easily change the order of arguments.
)
