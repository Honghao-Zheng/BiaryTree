package com.sparta.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class logWrapper {
    public static void logIt(Logger logger) {
        fileHandlerConfig.getFileHandler(logger);
        ConsoleHandlerConfig.consoleHandler(logger);
        logger.setUseParentHandlers(false);
        logger.setLevel(Level.ALL);
    }
}
