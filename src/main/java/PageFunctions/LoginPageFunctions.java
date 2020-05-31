package PageFunctions;

import Utils.Propertiesmethods;
import pageObjects.LoginPageObjects;

public class LoginPageFunctions extends LoginPageObjects{
	
	public void launchURL(String URL) {
		
		String appURL=Propertiesmethods.getPropertyValue("URL");
		
		System.out.println(appURL);
		driver.get(appURL);
	}

	
	public void enterCredentials(String User, String Pass) {
		
		enterDataTextField(userName, User);
		enterDataTextField(password, Pass);
	}
	
	
	public void clickOnLoginButton(String btnName) {
		clickOnField(loginBtn);
	}
}
