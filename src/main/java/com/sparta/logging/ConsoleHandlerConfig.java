package com.sparta.logging;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConsoleHandlerConfig {
    static void consoleHandler(Logger logger) {
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        consoleHandler.setFormatter(new CustomerFormatter());
//        consoleHandler.setFilter(new CustomerFilter());
        logger.addHandler(consoleHandler);
    }
}
