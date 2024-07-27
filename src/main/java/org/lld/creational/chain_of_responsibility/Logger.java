package org.lld.creational.chain_of_responsibility;

public interface Logger {
    void setNextLogger(Logger nextLogger);
    void logMessage(int level, String message);
}
