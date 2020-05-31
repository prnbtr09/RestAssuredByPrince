package Logs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.seleniumhq.jetty9.util.log.Log;

public class Logging {
	
	public static Logger log = LogManager.getLogger(Log.class.getName());

	public static void startTestCase() throws Throwable{
		throw new Throwable();
		//log.info("*********************************Execution Started********************************");
		
	}

	public static void endTestCase() {

		log.info("*********************************Execution Completed******************************");

	}

	public static void info(String message) {
		log.info(message);
		// Reporter.addStepLog(message);
	}

	public static void warn(String message) {
		log.warn(message);
	}

	public static void error(String message) {
		log.error(message);
	}

	public static void fatal(String message) {
		log.fatal(message);
	}

	public static void debug(String message) {
		log.debug(message);
	}

}
