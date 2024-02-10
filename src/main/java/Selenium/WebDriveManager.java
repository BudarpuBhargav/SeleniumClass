package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriveManager {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String browser = "Chrome";
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver =new  ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver =new  FirefoxDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			driver =new  EdgeDriver();
		}
		
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");
		
		//identification od elements in WEB + actions
		
		// 1st way
		driver.findElement(By.id("Form_getForm_Name")).sendKeys("Bhargav");
		driver.findElement(By.id("Form_getForm_Email")).sendKeys("Bhargav");
		
		// 2nd way
		WebElement fisrstName =driver.findElement(By.id("Form_getForm_Name"));
		WebElement email =driver.findElement(By.id("Form_getForm_Email"));
		
		fisrstName.clear();
		fisrstName.sendKeys("qedfew");
		email.clear();
		email.sendKeys("gmail");
		
		// 3rd way
		By fName =By.id("Form_getForm_Name");
		By Email= By.id("Form_getForm_Email");
		
		driver.findElement(fName).sendKeys("qqwqq");
		driver.findElement(Email).sendKeys("asdjijf");
		
		WebElement name =driver.findElement(fName);
		WebElement mail =driver.findElement(Email);
		
		name.sendKeys("wdwfcwecfwe");
		mail.sendKeys("asjdldioewjdowjo");
		
		WebElement link= driver.findElement(By.tagName("a"));
		
		System.out.println(link);
	}

}
