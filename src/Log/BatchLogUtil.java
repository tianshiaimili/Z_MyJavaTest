package Log;

import java.io.File;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BatchLogUtil {

	
	private Logger logger;
	private String UTL_LOGFILE="D://batchlog.log";
	private String iniPath="D://batchlog.ini";
	/////
	
	public String getIniValue(String key) {
		Properties properties = null;
		try {
			properties = PropertiesUtils.loadPropertiesFile(iniPath);
		} catch (Exception ex) {
			throw new IllegalArgumentException(String.format("Can't load ini file, return null, reason=%s", ex.getMessage()));
		}
		return properties.getProperty(key);	
	}	
	////
	public int getIniValueForInt(String key) {		
		return Integer.valueOf(getIniValue(key));
	}
	
//logger method
public Logger getLogger(){
	
	
	if(logger == null){
		org.apache.log4j.Logger _logger = LogManager.exists(UTL_LOGFILE);
		
		String maxLogSize = getIniValue(IniFileConstant.MAX_LOG_SIZE);

		if(maxLogSize != null){
			int maxLogCount = 0;
			maxLogCount = getIniValueForInt(IniFileConstant.MAX_LOG_COUNT);	
	
			if(_logger == null){
				logger = LoggerUtils.createLoggerInstance(UTL_LOGFILE, LoggerUtils.RollingFileAppender, maxLogSize, maxLogCount);
			}else{
				File logfile = new File(UTL_LOGFILE);
				
				if( ! logfile.exists() ){
					logger = LoggerUtils.createLoggerInstance(UTL_LOGFILE, LoggerUtils.RollingFileAppender, maxLogSize, maxLogCount );
				}else{
					logger = LoggerFactory.getLogger(UTL_LOGFILE);					
				}
				
			}				
			
		}else{				
			if(_logger == null){
				logger = LoggerUtils.createLoggerInstance(UTL_LOGFILE, LoggerUtils.FileAppender );
			}else{
				File logfile = new File(UTL_LOGFILE);
				
				if( ! logfile.exists() ){
					logger = LoggerUtils.createLoggerInstance(UTL_LOGFILE, LoggerUtils.FileAppender );
				}else{
					logger = LoggerFactory.getLogger(UTL_LOGFILE);					
				}
				
			}
		}
		
	}
	return logger;		
}
public void setLogger(Logger logger){
	if(this.logger == null){
		this.logger = logger;
	}
}
}
