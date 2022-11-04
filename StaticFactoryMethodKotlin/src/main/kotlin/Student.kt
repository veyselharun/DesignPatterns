class Student(id: String, name: String, surname: String, university: String) {

    init {
        println("Make some initialization!")
    }

    fun printInfo() {
        println(this.toString())
    }

    companion object {

        private val university: String = "Sakarya University"

        fun studentCreate(id: String, name: String, surname: String): Student {
            if (StudentTrack.studentList.containsKey(id)) {
                return StudentTrack.studentList[id]!!
            } else {
                val myStudent = Student(id, name, surname, university)
                StudentTrack.studentList.put(id, myStudent)
                return myStudent
            }
        }

    }

}