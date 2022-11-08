fun main(args: Array<String>) {

    val a: Student = Student("B202210300", "Ayse", "Demir", "Sakarya University")

    val b: Student = Student.studentCreate("B202210300", "Ayse", "Demir")
    b.printInfo()

    val c: Student = Student.studentCreate("B202210300", "Ayse", "Demir")
    c.printInfo()

    // val c: Student2 = Student2("B202210300", "Ayse", "Demir", "Sakarya University")

    val d: Student2 = Student2.studentCreate("B202210300", "Ayse", "Demir")
}