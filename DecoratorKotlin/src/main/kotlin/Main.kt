// Code without decorator pattern.

data class Student(val id: String, val name: String, val surname: String)

fun main(args: Array<String>) {

    val studentData = StudentData()
    studentData.addStudent("20221012", "Ahmet", "Ulucay")
    studentData.addStudent("20221013", "Ayse", "Demir")

    println(studentData.getStudent("20221013"))

    val validatingAddStudent = ValidatingAddStudent()
    validatingAddStudent.addStudent("20221014", "Fatma", "Asya")

    val loggingGetStudent = LoggingGetStudent()
    loggingGetStudent.getStudent("20221012")
}