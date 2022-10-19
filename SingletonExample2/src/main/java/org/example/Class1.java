package org.example;

public class Class1 {

    public void operationClass1() {
        // We should not be able to instantiate the object outside the class.
        // LogHelper lg = new LogHelper();
        LogHelper logHelper = LogHelper.getInstance();
        logHelper.logMessage("Ahmet enrolled the course.");
    }

}
