//package test;
//
//
//
//import java.io.File;
//import java.io.IOException;
//import java.util.Date;
//
////import com.relevantcodes.extentreports.ExtentReports;
//
////import cetera.test.helpers.ExtentCucumberReporter;
////import cetera.test.runner.RunnerTest;
//
//public class Report {
//
//	public static String iNIFile = "src/main/resources/ResultConfig.ini";
//	public static Date d = new Date();
//	public static String folderName = d.toString().replace(":", "_").replace(" ", "_");
//	public static int screenshotsCounter;
//	public static String resultfolderpath;
//	public static int currentLogID;
//
//	RunnerTest runnerTest = new RunnerTest();
//	static File HTMLFile = new File(RunnerTest.HTMLpath);
//	static ExtentCucumberReporter extentReporter = new ExtentCucumberReporter(HTMLFile);
//
//	/**
//	 * @author anshulmadan
//	 * @Description: Add step log to report
//	 */
//	public static  void addStepLog(String logs) {
//		extentReporter.addStepLog(logs);
//	}
//
//	/**
//	 * @author anshulmadan
//	 * @Description: fail the test step
//	 */
//	public static void letsfailtestcase() {
//
//		extentReporter.failtestcase();
//	}
//	/**
//	 * @author anshulmadan
//	 * @Description: flush the report
//	 */
//	public static void finishReport() {
//
//		extentReporter.done();
//	}
//	/**
//	 * @author anshulmadan
//	 * @Description: fail the test step
//	 */
//	public static void passTestcase() {
//
//		extentReporter.passTestCase();
//	}
//	
//	/**
//	 * @author anshulmadan
//	 * @Description: fail the test step
//	 */
//	public static void skipTestcase() {
//
//		extentReporter.skipTestcase();
//	}
//	
//	/**
//	 * @author anshulmadan
//	 * @Description: Add scenario log to report
//	 */
//	public static  void addScenarioLog(String logs) {
//		extentReporter.addScenarioLog(logs);
//	}
//
//	/**
//	 * @author anshulmadan
//	 * @Description: Add screen shots to report
//	 */
//	public static void addScreenCaptureFromPath(String path) throws IOException {
//		try {
//			extentReporter.addScreenCaptureFromPath(path);
//		} catch (Exception ex) {
//			extentReporter.addStepLog("screenshots path does not exist");
//		}
//	}
//
//	public static void CreatehtmlFile() {
//		try {
//			String resultfolderpath = System.getProperty("user.dir") + "/target/cucumber-reports/" + folderName;
//			File resultfolder = new File(resultfolderpath);
//			boolean success = (resultfolder).mkdir();
//			if (success) {
//				String fileName = folderName + ".HTML";
//				String htmlFile = resultfolderpath + File.separator + fileName;
//				ExtentReports extent = new ExtentReports("");
//				extent.loadConfig(new File(htmlFile));
//
//			}
//		} catch (Exception Ex) {
//		}
//
//	}
//
//	public static void logMessage(String status, String additionalinformation) {
//		try {
//			switch (status) {
//			case "Pass":
//				// Logging.info(additionalinformation);
//				addStepLog(additionalinformation);
//				break;
//			case "Fail":
//				// Logging.error(additionalinformation);
//				addStepLog(additionalinformation);
//				// getScreenshot();
//				break;
//			case "Warning":
//				// Logging.warn(additionalinformation);
//				addStepLog(additionalinformation);
//				break;
//			case "Skip":
//				// .info(additionalinformation);
//				addStepLog(additionalinformation);
//				break;
//			case "None":
//				// Logging.info(additionalinformation);
//				addStepLog(additionalinformation);
//				break;
//			case "INFO":
//				// Logging.info(additionalinformation);
//				addStepLog(additionalinformation);
//				break;
//			}
//
//		} catch (Exception Ex) {
//		}
//
//	}
//
//}
//
