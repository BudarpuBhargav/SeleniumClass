package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ElimentUtility {

	private WebDriver driver;

	public ElimentUtility(WebDriver driver) {
		this.driver = driver;
	}

	public List<WebElement> getWebelements(By locator) {
		return driver.findElements(locator);
	}

	public WebElement getWebElement(By locator) {
		return driver.findElement(locator);
	}

	public void Sendkeys(By locator, String value) {
		getWebElement(locator).sendKeys(value);
	}
	
	public void Click(By locator) {
		getWebElement(locator).click();
	}
	
	public void dragDrop(WebElement src, WebElement target ) {
		Actions action = new Actions(driver);
		action.clickAndHold(src).moveToElement(target).release().build().perform();
	}
}

