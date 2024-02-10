package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {
	
	//static WebDriver driver;

		public static void main(String args[]) throws InterruptedException {
			
			String browse= "Chrome";
			
			By username= By.name("username");
			By password =By.name("password");
			By loginBtn = By.className("orangehrm-login-button");
			
			DriverFactory df = new DriverFactory();
			WebDriver driver= df.intializeDriver(browse);
			df.launchURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			df.pageTitle();
			
			ElimentUtility et = new ElimentUtility(driver);
			Thread.sleep(3000); 
			et.Sendkeys(username, "Admin");
			et.Sendkeys(password, "admin123");
			et.Click(loginBtn);
			
		}
}
