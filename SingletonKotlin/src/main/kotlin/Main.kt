fun main(args: Array<String>) {

    val class1 = Class1()
    class1.operationClass1()

    val class2 = Class2()
    class2.operationClass2()

    class1.operationClass1()
    class2.operationClass2()

    val newClass = Class1()
    newClass.operationClass1()
}