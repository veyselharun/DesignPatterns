import LogHelper.printLogMessage

fun main(args: Array<String>) {
    val myClass1 = Class1()
    myClass1.makeOperation1()
    myClass1.makeOperation2()

    val myClass2 = Class2()
    myClass2.makeOperation1()
    myClass2.makeOperation2()
}


class Class1 {

    fun makeOperation1() {
        LogHelper.printLogMessage("Class1 operation 1")
    }

    fun makeOperation2() {
        LogHelper.printLogMessage("Class1 operation 2")
    }
}

class Class2 {

    fun makeOperation1() {
        LogHelper.printLogMessage("Class2 operation 1")
    }

    fun makeOperation2() {
        LogHelper.printLogMessage("Class2 operation 2")
    }
}