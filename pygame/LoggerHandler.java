package utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggerHandler {

    private static Logger logger = Logger.getLogger(LoggerHandler.class);

    static {
        String timestamp = new SimpleDateFormat("yyyyMMdd-HHmmss").format(new Date());
        System.setProperty("current.Date", timestamp);//-${current.date}.log
        PropertyConfigurator.configure("./src/main/resources/log4j.properties");
        

    }

    public static void Info(String msg) {
    	logger.info(msg);
    	
        
    }
    
    public static void Warn(String msg) {
    	logger.warn(msg);
    	
        
    }
    public static void Debug(String msg) {
    	logger.debug(msg);
    	
        
    }
    public static void Error(String msg) {
    	logger.error(msg);
    	
        
    }

   
}
