package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	private WebDriver driver;
	
	public WebDriver intializeDriver(String browser) {
		
		System.out.println("Browser name: "+ browser);
		
		if (browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
		}else if (browser.equalsIgnoreCase("edge")) {
			driver= new EdgeDriver();
		}
		return driver;
	}
	
	public void launchURL(String url) {
		driver.get(url);
	}
	public void pageTitle() {
		System.out.println(driver.getTitle()); 
	}
	public String currentUrl() {
		return driver.getCurrentUrl();
	}
	public void closeBrowse() {
		 driver.close();
	}
	public void quitBrowse() {
		 driver.quit();
	}
	
}
