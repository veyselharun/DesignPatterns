// Get help from the "by" keyword.
// by keyword
// delegates the implementation of an interface to another object.
// delegates the implementation of the accessors for a property to another object.
// https://kotlinlang.org/docs/keyword-reference.html#soft-keywords
class LoggingGetStudent(private val studentData: StudentData) : StudentData by studentData {

    override fun getStudent(id: String): String {
        println("Getting student information for id : $id")
        return studentData.getStudent(id)
    }

}