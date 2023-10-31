import java.time.LocalTime;

public class LogHelper {
    private static LogHelper instance;

    private int logStamp= 0;

    private LogHelper() {
        String message = "Stamp\tTime\tMessage";
        System.out.println(message);
    }

    public static LogHelper getInstance() {
        if (instance == null) {
            instance = new LogHelper();
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
