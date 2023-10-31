public class Class1 {

    public void makeOperation1() {
        LogHelperNoSingleton myLogger = new LogHelperNoSingleton();
        myLogger.printLogMessage("Class1 operation");
    }

    public void makeOperation2() {
        LogHelperNoSingleton myLogger = new LogHelperNoSingleton();
        myLogger.printLogMessage("Class2 operation");
    }

    public void makeOperation3() {
        LogHelper myLogger = LogHelper.getInstance();
        myLogger.printLogMessage("Class2 operation");
    }

    public void makeOperation4() {
        LogHelper myLogger = LogHelper.getInstance();
        myLogger.printLogMessage("Class2 operation");
    }

}
