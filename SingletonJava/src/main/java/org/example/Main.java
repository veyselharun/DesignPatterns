package org.example;

public class Main {
    public static void main(String[] args) {

        /* Without Singleton */
        Class1 myClass1 = new Class1();
        myClass1.makeOperation1();
        myClass1.makeOperation2();

        Class2 myClass2 = new Class2();
        myClass2.makeOperation1();
        myClass2.makeOperation2();


        /* With Singleton */
        /*
        Class1 myClass1 = new Class1();
        myClass1.makeOperation3();
        myClass1.makeOperation4();

        Class2 myClass2 = new Class2();
        myClass2.makeOperation3();
        myClass2.makeOperation4();
         */

    }
}