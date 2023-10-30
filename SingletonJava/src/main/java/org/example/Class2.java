package org.example;

public class Class2 {
    public void makeOperation1() {
        LogHelperNoSingleton myLogger = new LogHelperNoSingleton();
        myLogger.printLogMessage(LogType.INFO, "Class1 operation");
    }

    public void makeOperation2() {
        LogHelperNoSingleton myLogger = new LogHelperNoSingleton();
        myLogger.printLogMessage(LogType.ERROR, "Class2 operation");
    }

    public void makeOperation3() {
        LogHelper myLogger = LogHelper.getInstance();
        myLogger.printLogMessage(LogType.ERROR, "Class2 operation");
    }

    public void makeOperation4() {
        LogHelper myLogger = LogHelper.getInstance();
        myLogger.printLogMessage(LogType.ERROR, "Class2 operation");
    }

}
