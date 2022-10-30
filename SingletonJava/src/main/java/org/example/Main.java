package org.example;

public class Main {
    public static void main(String[] args) {

        Class1 class1 = new Class1();
        class1.operationClass1();

        Class2 class2 = new Class2();
        class2.operationClass2();

        class1.operationClass1();
        class2.operationClass2();

        Class1 newClass = new Class1();
        newClass.operationClass1();
    }
}