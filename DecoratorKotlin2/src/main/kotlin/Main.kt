// Code with decorator pattern.

data class Student(val id: String, val name: String, val surname: String)

fun main(args: Array<String>) {

    val defaultStudentData = DefaultStudentData()
    defaultStudentData.addStudent("20221012", "Ahmet", "Ulucay")
    defaultStudentData.addStudent("20221013", "Ayse", "Demir")

    println(defaultStudentData.getStudent("20221013"))


    val validatingAddStudent = ValidatingAddStudent(defaultStudentData)
    validatingAddStudent.addStudent("20221014", "Fatma", "Asya")
    validatingAddStudent.getStudent("20221014")

    val loggingGetStudent = LoggingGetStudent(defaultStudentData)
    loggingGetStudent.getStudent("20221012")

    // Decorator pattern allowed us to compose behavior.
    val validatingLoggingStudent = LoggingGetStudent(validatingAddStudent)
    validatingLoggingStudent.addStudent("20221015", "Mehmet", "Munir")
    validatingLoggingStudent.getStudent("20221015")
}