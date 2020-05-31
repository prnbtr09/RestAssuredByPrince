package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageManagement.PageManager;

public class LoginPageObjects extends PageManager {

	
	@FindBy(name="UserName")
	public WebElement userName;
	
	
	@FindBy(name="Password")
	public WebElement password;
	
	@FindBy(xpath="//input[@name='Login']")
	public WebElement loginBtn;
}
