// Get help from the "by" keyword.
// by keyword
// delegates the implementation of an interface to another object.
// delegates the implementation of the accessors for a property to another object.
// https://kotlinlang.org/docs/keyword-reference.html#soft-keywords
class ValidatingAddStudent(private val studentData: StudentData) : StudentData by studentData {

    override fun addStudent(id: String, name: String, surname: String) {
        if (name.length > 20) {
            throw RuntimeException("Student name is longer than 20 characters!")
        }

        studentData.addStudent(id, name, surname)
    }

}