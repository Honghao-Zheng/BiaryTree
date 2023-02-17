package com.sparta.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class fileHandlerConfig {
    static void getFileHandler(Logger logger) {
        try {
            var fileHandler = new FileHandler("src/main/resources/logFile.log", true);
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new CustomerFormatter());
//            fileHandler.setFilter(new CustomerFilter());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
