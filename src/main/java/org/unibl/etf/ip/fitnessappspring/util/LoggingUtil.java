package org.unibl.etf.ip.fitnessappspring.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LoggingUtil {

    public  static  void logException(Throwable t, Log log){
        StringBuilder builder = new StringBuilder();
        builder.append(t);
        builder.append(System.lineSeparator());
        for(StackTraceElement el : t.getStackTrace()){
            builder.append(el);
            builder.append(System.lineSeparator());
        }
        log.error(builder);
    }

    public static <T> void logException(Throwable t, Class<T> object){logException(t, LogFactory.getLog(object));}
}
