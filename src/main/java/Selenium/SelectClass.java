package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	
	static WebDriver  driver;

	public static void main(String[] args) throws InterruptedException {
		
		//String browserInfo="Chrome";
		/*
		 * WebDriver driver= new ChromeDriver();
		 * 
		 * driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		 * 
		 * WebElement selectElement = driver.findElement(By.id("Form_getForm_Country"));
		 * 
		 * Select select = new Select(selectElement); 
		 * select.selectByIndex(2);
		 * Thread.sleep(3000); 
		 * select.selectByVisibleText("India"); 
		 * Thread.sleep(3000);
		 * select.selectByValue("China");
		 */
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		
		//DriverFactory df = new DriverFactory();
		//df.intializeDriver(browserInfo);
		//df.launchURL("https://www.orangehrm.com/en/book-a-free-demo/");
		
		By contryElement= By.id("Form_getForm_Country");
		//WebElement selectElement=selectElement(contryElement);
		//Select select = new Select(selectElement); 
		//selectByIndrx(contryElement,2);
		//selectByValue(contryElement,"India");
		//selectByText(contryElement,"India ");
		
		//String selecttype="value";
		selectDropdown("index", contryElement, "3");
		/*
		 * Thread.sleep(3000); selectDropdown("value", contryElement, "India");
		 * Thread.sleep(3000); selectDropdown("text", contryElement, "Aruba");
		 */
		} 

	public static WebElement selectElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void selectByIndrx (By locator, String index) {
		Select select = new Select(selectElement(locator));
		select.selectByIndex(Integer.parseInt(index));
		select.getOptions();
	}
	private static int parseint(String index) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void selectByValue (By locator, String value) {
		Select select = new Select(selectElement(locator));
		select.selectByValue(value);
		
	}
	public static void selectByText (By locator, String text) {
		Select select = new Select(selectElement(locator));
		select.selectByVisibleText(text);
	}
	
	public static void selectDropdown(String type,By locator, String value ) {
		
		Select select = new Select(selectElement(locator));
		
		switch (type) {
		case "index":
			select.selectByIndex(Integer.parseInt(value));
			break;
		case "value":
			select.selectByValue(value);
			break;
		case "text":
			select.selectByVisibleText(value);
			break;
		default:
			break;
		}
	}
}
