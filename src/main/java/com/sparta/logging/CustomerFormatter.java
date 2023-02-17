package com.sparta.logging;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class CustomerFormatter extends Formatter {
    @Override
    public String format(LogRecord record) {
        return  record.getSourceMethodName()+ "Called then "
                +record.getMessage()+ "\n";
    }
}
