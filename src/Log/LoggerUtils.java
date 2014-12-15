package Log;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.DailyRollingFileAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.RollingFileAppender;
import org.slf4j.LoggerFactory;

public class LoggerUtils {
	private static org.slf4j.Logger logger = LoggerFactory.getLogger(LoggerUtils.class.getClass());
	
	
	private static final String AppenderName = "A2";
	public static final int FileAppender = 1;
	public static final int DailyRollingFileAppender = 2;
	public static final int RollingFileAppender = 3;
	public static org.slf4j.Logger createLoggerInstance(String logFilePath, int logType) {
		return createLoggerInstance(logFilePath, logType, null, 0);
	}
	public static org.slf4j.Logger createLoggerInstance(String logFilePath, int logType, String maxFileSize, int maxBackupIndex) {
		Logger rootLogger = Logger.getRootLogger();
		
		Logger log4j = Logger.getLogger(logFilePath);
		log4j.setAdditivity(false);		
		log4j.setLevel(rootLogger.getLevel());		
		log4j.addAppender(createFileAppender(getLayout(), logFilePath, logType, maxFileSize, maxBackupIndex));		
		log4j.addAppender(getConsoleAppender());
		
		org.slf4j.Logger logger = LoggerFactory.getLogger(logFilePath);
		
		return logger;
	}

	private static Appender getConsoleAppender() {
		Logger rootLogger = Logger.getRootLogger();
		
		while( rootLogger.getAllAppenders().hasMoreElements() ) {
			Object obj = rootLogger.getAllAppenders().nextElement();
			if( obj instanceof ConsoleAppender){
				return (ConsoleAppender) obj;
			}
		}
		return null;
	}

	private static Layout getLayout() {
		return getConsoleAppender().getLayout();
	}
	private static Appender createFileAppender(Layout layout, String logFilePath, int type, String maxFileSize, int maxBackupIndex) {
		String message = String.format("log file(%s)  can't find.", logFilePath);
		if(logFilePath == null){
			throw new IllegalArgumentException(message);
		}
		Appender appender = null;
		boolean isFound = true;
		
		try {
			switch (type) {
			case FileAppender:
				appender = new FileAppender(layout, logFilePath);
				break;
			case DailyRollingFileAppender:
				appender = new DailyRollingFileAppender(layout, logFilePath, "dd/MM/yyyy");
				break;
			case RollingFileAppender:
				RollingFileAppender rollingFileAppender = new RollingFileAppender(layout, logFilePath);
				rollingFileAppender.setMaxFileSize(maxFileSize);
				rollingFileAppender.setMaxBackupIndex(maxBackupIndex);
				appender = rollingFileAppender;				
				break;
			default:
				break;
			}
			
			
		} catch (IOException e) {
			logger.warn(String.format("create Log file fail, reason=%s", e.getMessage()));
			isFound = false;
		}
		if( !isFound ) {
			throw new IllegalArgumentException(message);
		}
		return appender;
		
	}
}
