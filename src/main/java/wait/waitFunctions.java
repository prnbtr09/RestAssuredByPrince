package wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import static wait.Waits.exlicitWait;
public class waitFunctions{
	WebDriverWait wait=exlicitWait;
	
	
	/*
	 * Wait Method for Element Visibility
	 */
	public  void waitForElementVisibility(WebElement element) {
		this.wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void waitForElementVisibility(WebDriverWait wait, WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void waitForElementVisibility(FluentWait<WebDriver> wait, WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/*
	 * Wait Method for ElementToBeClicikable
	 */
	public void waitForElementToBeClickable(WebElement element) {
		this.wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public void waitForElementToBeClickable(WebDriverWait wait,WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public void waitForElementToBeClickable(FluentWait<WebDriver> wait,WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	/*
	 * Wait Method for ElementToBeSelected
	 */

	public void waitForElementToBeSelected(WebElement element) {
		this.wait.until(ExpectedConditions.elementToBeSelected(element));
	}
	public void waitForElementToBeSelected(WebDriverWait wait,WebElement element) {
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}
	public void waitForElementToBeSelected(FluentWait<WebDriver> wait,WebElement element) {
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}
	
	/*
	 * Wait Method for ElementToBeInvisible
	 */

	public void waitForElementToBeInvisible(WebElement element) {
		this.wait.until(ExpectedConditions.invisibilityOf(element));
	}
	public void waitForElementToBeInvisible(WebDriverWait wait,WebElement element) {
		wait.until(ExpectedConditions.invisibilityOf(element));
	}
	public void waitForElementToBeInvisible(FluentWait<WebDriver> wait,WebElement element) {
		wait.until(ExpectedConditions.invisibilityOf(element));
	}
	
	//TODO: We have to add more wait methods here

	

}
