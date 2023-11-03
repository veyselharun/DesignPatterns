import java.time.LocalTime;

public final class LogHelperEager {
    private static LogHelperEager instance = new LogHelperEager();

    private int logStamp= 0;

    private LogHelperEager() {
        String message = "Stamp\tTime\tMessage";
        System.out.println(message);
    }

    public static LogHelperEager getInstance() {
        if (instance == null) {
            instance = new LogHelperEager();
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
