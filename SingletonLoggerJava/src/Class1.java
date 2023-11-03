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

    public void opSynchronized() {
        LogHelperSynchronized myLogger = LogHelperSynchronized.getInstance();
        myLogger.printLogMessage("Class1 operation - Synchronized");
    }

    public void opEager() {
        LogHelperEager myLogger = LogHelperEager.getInstance();
        myLogger.printLogMessage("Class1 operation - Eager");
    }

    public void opDoubleChecked() {
        LogHelperDoubleChecked myLogger = LogHelperDoubleChecked.getInstance();
        myLogger.printLogMessage("Class1 operation - Double Checked Locking");
    }
}
