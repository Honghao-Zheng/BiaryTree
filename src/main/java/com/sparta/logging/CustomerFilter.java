package com.sparta.logging;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class CustomerFilter implements Filter {
    @Override
    public boolean isLoggable(LogRecord record) {
        return record.getMessage().contains("INFO");
    }
}
