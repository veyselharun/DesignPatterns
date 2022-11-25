open class StudentData {

    private val studentList = mutableListOf<Student>()

    open fun getStudent(id: String): String {
        for (student in studentList) {
            if (student.id == id) {
                return student.name
            }
        }

        return "Unknown"
    }

    open fun addStudent(id: String, name: String, surname: String) {
        studentList.add(Student(id, name, surname))
    }

}