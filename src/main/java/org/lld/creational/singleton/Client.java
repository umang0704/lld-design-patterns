package org.lld.creational.singleton;
//using enum
 enum LoggerEnum {
    LOGGER;

    public void log(String message) {
        System.out.println(message);
    }
}

public class Client {
    public static void main(String[] args) {
        LoggerEnum logger = LoggerEnum.LOGGER;
        logger.log("Hello World");
    }
}
