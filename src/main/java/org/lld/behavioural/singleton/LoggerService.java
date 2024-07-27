package org.lld.behavioural.singleton;
//lazy initialzation
public class LoggerService {
    private static LoggerService logger = null;

    private LoggerService() {}

    synchronized public static LoggerService getLogger() {
        if (logger == null) {
            logger = new LoggerService();
        }

        return logger;
    }
}
