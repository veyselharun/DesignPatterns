import java.time.LocalTime;

public class LogHelperNoSingleton {

    private int logStamp= 0;

    public LogHelperNoSingleton() {
        String message = "Stamp\tTime\tMessage";
        System.out.println(message);
    }

    public void printLogMessage(String logMessage) {
        logStamp++;
        String logTime = LocalTime.now().toString();
        String message = logStamp + "\t" + logTime + "\t" + logMessage;
        System.out.println(message);
    }

}
