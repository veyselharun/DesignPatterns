import java.time.LocalTime;

public final class LogHelperSynchronized {
    private static LogHelperSynchronized instance;

    private int logStamp= 0;

    private LogHelperSynchronized() {
        String message = "Stamp\tTime\tMessage";
        System.out.println(message);
    }

    public static synchronized LogHelperSynchronized getInstance() {
        if (instance == null) {
            instance = new LogHelperSynchronized();
        }
        return instance;
    }

    public void printLogMessage(String logMessage) {
        logStamp++;
        String logTime = LocalTime.now().toString();
        String message = logStamp + "\t" + logTime + "\t" + logMessage;
        System.out.println(message);
    }
}
