package stepDefinitions;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import pageManagement.PageManager;

public class Login {
	PageManager manage=new PageManager();
	
	@Given("^User launched \"([^\"]*)\"$")
	public void user_launched(String URL) throws Throwable {
	
		manage.getLoginPageFunctions().launchURL(URL);
	System.out.println(Thread.currentThread());
	System.out.println("First Thread");
	}
	
	@Given("^User enter credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_and(String userName, String password) throws Throwable {
	   
		manage.driver.findElement(By.xpath("//a[text()='Downloads']")).click();
		manage.driver.findElement(By.xpath("//p[contains(text(),'Latest stable version ')]/a")).click();
	}
	
	@Given("^User Clicks on \"([^\"]*)\" button$")
	public void user_Clicks_on_button(String buttonName) throws Throwable {
	    
		//manage.getLoginPageFunctions().clickOnLoginButton(buttonName);
	}
	

}
