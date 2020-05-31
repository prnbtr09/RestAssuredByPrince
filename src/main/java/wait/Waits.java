package wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.WebDriverWait;

import driverManagement.BaseDriver;


public class Waits extends BaseDriver{
	
	public static WebDriverWait exlicitWait;

	public static void implicitWait(long time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	

	public static void explicitWait(long timeInSeconds) {

		exlicitWait=new WebDriverWait(driver, timeInSeconds);
	}
	
	
	
}
