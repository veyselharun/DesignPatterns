class Player9 (name: String) {

    var score: Int = 0
        set(value) {
            field = if (value >= 0) {
                value
            } else {
                0
            }
        }

    var name = name
        get() = field.uppercase()

}