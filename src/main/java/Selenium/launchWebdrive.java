package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchWebdrive {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.12.1");
		
		String pageTitle = driver.getTitle();
		
		System.out.println(pageTitle);
		
	driver.quit();
	driver.getTitle();
	}
	
}
