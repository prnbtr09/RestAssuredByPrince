package CommonPageMethods;

import org.openqa.selenium.WebElement;

import common.commonfunctions;
import wait.Waits;
import wait.waitFunctions;

public class Pages_CommonMethods extends commonfunctions{
	waitFunctions wait=new waitFunctions(); 
	public void enterDataTextField(WebElement fieldName, String text) {
	
		fieldName.sendKeys(text);
	}
	
	
	public void clickOnField(WebElement field) {
		field.click();
	}
	
	
	public void waitForElementToBeClickable(WebElement field) {
	
		wait.waitForElementToBeClickable(field);
	}

}
