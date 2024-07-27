package org.lld.creational.chain_of_responsibility;

public class ChainPatternDemo {
    private static Logger getChainOfLoggers() {
        Logger errorLogger = new ErrorLogger(3);
        Logger debugLogger = new DebugLogger(2);
        Logger infoLogger = new InfoLogger(1);

        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);

        return infoLogger;
    }

    public static void main(String[] args) {
        Logger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(1, "This is an information.");
        loggerChain.logMessage(2, "This is a debug level information.");
        loggerChain.logMessage(3, "This is an error information.");
    }
}
