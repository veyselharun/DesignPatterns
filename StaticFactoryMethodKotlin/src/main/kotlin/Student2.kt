class Student2 private constructor(id: String, name: String, surname: String, university: String) {

    init {
        println("Make some initialization!")
    }


    companion object {

        private val university: String = "Sakarya University"

        fun studentCreate(id: String, name: String, surname: String): Student2 {
            return Student2(id, name, surname, university)
        }

    }

}