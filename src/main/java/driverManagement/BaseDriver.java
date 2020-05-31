package driverManagement;



import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

//import java.sql.Connection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import Utils.Propertiesmethods;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseDriver{
	public static WebDriver driver=null;
	private static String browserName="";
	Propertiesmethods propMethods=null;

	
	//private static Connection DBConn;
	
	@SuppressWarnings("deprecation")
	public static void setUpBrowserSession() throws IOException {
		Propertiesmethods propMethods=new Propertiesmethods();
		browserName=propMethods.getPropertyValue("browser");
		
		if(browserName.equalsIgnoreCase("Chrome")) {	
			System.out.println(System.getProperty("user.dir"));
Map<String, Object> preferences=new HashMap<String, Object>();
			
			System.out.println(System.getProperty("user.dir"));
			preferences.put("download.default_directory", System.getProperty("user.dir")+File.separator+"Downloads");
			preferences.put("safebrowsing.enabled", "false"); 
			preferences.put("download.prompt_for_download", "false");
			System.out.println(System.getProperty("user.dir")+File.separator+"Downloads");
			
			ChromeOptions options=new ChromeOptions();
				//for adding capabilities as chrome options implements capabilities
			options.setCapability("CapabilityType.ACCEPT_SSL_CERTS", true);
			options.setExperimentalOption("prefs", preferences);
			//addarguments option for running the test case in headless chrome browser
			//options.addArguments("--headless");
			//managing driver
			//WebDriverManager.chromedriver().setup();
			WebDriverManager.chromedriver().setup();
			
			driver=new ChromeDriver(options);
			
			//WebDriverManager.chromedriver().setup();
		}else if(browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options=new FirefoxOptions();
			//options.addArguments("--headless");
			driver=new FirefoxDriver(options);
		}			System.out.println(browserName);
	}
		/*
	 * public static Connection setUpDBSession() {
	 * 
	 * DBConn=DBConnection.connectDataBase();
	 * 
	 * return DBConn; }
	 */

}
