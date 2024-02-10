package Selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByGenericMethod {
	//static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		By links = By.id("twotabsearchtextbox");
		By classes = By.xpath("//*[@id=\"nav-search-bar-form\"]/div[3]/div");

		// int totalLinkCount= getWebelements(links).size();
		// System.out.println(totalLinkCount);

		// Sendkeys(links, "Mobile");

		ElimentUtility et = new ElimentUtility(driver);
		int totalLinkCount = et.getWebelements(links).size();
		System.out.println(totalLinkCount);

		et.Sendkeys(links, "Mobile");
		et.Click(classes);
		
	}

	public static List<WebElement> getWebelements(By locator) {
		return driver.findElements(locator);
	}

	public static WebElement getWebElement(By locator) {
		return driver.findElement(locator);
	}

	public static void Sendkeys(By locator, String value) {
		getWebElement(locator).sendKeys(value);
	}
}
