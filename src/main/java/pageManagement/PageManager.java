package pageManagement;

import org.openqa.selenium.support.PageFactory;

import CommonPageMethods.Pages_CommonMethods;
import PageFunctions.LoginPageFunctions;
import pageObjects.LoginPageObjects;

public class PageManager extends Pages_CommonMethods{
	
	public PageManager() {
		PageFactory.initElements(driver, this);
	}

	//page objects
	public LoginPageObjects getLoginPageObjects() {
		
		return new LoginPageObjects();
	}

	//page functions
	public LoginPageFunctions getLoginPageFunctions() {
		
		return new LoginPageFunctions();
	}
	
	
}
