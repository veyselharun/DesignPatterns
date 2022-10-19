package org.example;

public final class LogHelper {

    private static LogHelper instance;
    private int logId = 0;

    // We should not be able to instantiate the object outside the class.
    private LogHelper() {
        //
    }

    public static LogHelper getInstance() {
        if (instance == null) {
            instance = new LogHelper();
        }

        return instance;
    }

    public void logMessage(String message) {
        logId++;
        System.out.println("Log Id: " + logId + "; Log Message: " + message);
    }
}
