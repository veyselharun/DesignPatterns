import java.time.LocalTime;

public final class LogHelperDoubleChecked {
    private volatile static LogHelperDoubleChecked instance;

    private int logStamp= 0;

    private LogHelperDoubleChecked() {
        String message = "Stamp\tTime\tMessage";
        System.out.println(message);
    }

    public static LogHelperDoubleChecked getInstance() {
        if (instance == null) {
            synchronized (LogHelperDoubleChecked.class) {
                if (instance == null) {
                    instance = new LogHelperDoubleChecked();
                }
            }
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
