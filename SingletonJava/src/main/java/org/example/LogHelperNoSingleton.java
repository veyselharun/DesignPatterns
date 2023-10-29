package org.example;

import java.time.LocalTime;

public class LogHelperNoSingleton {

    private int logStamp= 0;

    public LogHelperNoSingleton() {
        String message = "Stamp\tTime\t\t\tType\tMessage";
        System.out.println(message);
    }

    public void printLogMessage(LogType logType, String logMessage) {
        logStamp++;
        String logTime = LocalTime.now().toString();
        String message = logStamp + "\t\t" + logTime + "\t" + logType + "\t" + logMessage;
        System.out.println(message);
    }

}
