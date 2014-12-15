package Log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLog {

	public static void main(String[] args) {
		
		String message="ABCDEFG";
		
		System.out.println(".......");
		//new BatchLogUtil().getLogger().info(message);
		
		System.out.println("00000000");
		Logger logger = LoggerFactory.getLogger("");
	    logger.info("Hello World");
	}
	
	
}
