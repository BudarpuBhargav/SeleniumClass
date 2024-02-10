package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class SelectElementClass {
	
	private WebDriver driver;

	public WebElement selectElement(By locator) {
		return driver.findElement(locator);
	}
	public void selectByIndex (By locator, int index) {
		
		Select select = new Select(selectElement(locator)); 
		select.deselectByIndex(index);
	}
	
	
	
}
