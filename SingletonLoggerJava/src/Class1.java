public class Class1 {

    public void makeOperation1() {
        LogHelperNoSingleton myLogger = new LogHelperNoSingleton();
        myLogger.printLogMessage("Class1 operation 1");
    }

    public void makeOperation2() {
        LogHelperNoSingleton myLogger = new LogHelperNoSingleton();
        myLogger.printLogMessage("Class1 operation 2");
    }

    public void makeOperation3() {
        LogHelper myLogger = LogHelper.getInstance();
        myLogger.printLogMessage("Class1 operation 3");
    }

    public void makeOperation4() {
        LogHelper myLogger = LogHelper.getInstance();
        myLogger.printLogMessage("Class1 operation 4");
    }

}
