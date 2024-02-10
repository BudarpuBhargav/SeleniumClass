package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.browserstack.com/users/sign_up");

		
		  driver.findElement(By.id("user_full_name")).sendKeys("username");
		  driver.findElement(By.id("user_email_login")).sendKeys("bhargav546554567474yfgfggy@gmail.com");
		  driver.findElement(By.id("user_password")).sendKeys("Your_Password");
		  Thread.sleep(3000);
		  
		  
		  
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  
		  
		  //driver.findElement(By.id("user_submit")).click();
		 
		Thread.sleep(3000);
		Actions action = new Actions(driver);
//		By submit=By.xpath("//input[@id='user_submit']");
//		WebElement submitBtn= driver.findElement(submit);
//		//action.click(submitBtn).build().perform();
//		driver.findElement(By.xpath("//*[@id=\"user_submit\"]")).click();
//		Thread.sleep(3000);
//		
////		  Alert alert= driver.switchTo().alert();
////		  
////		  String alertMessage= driver.switchTo().alert().getText();
////		  
////		  System.out.println(alertMessage);
////		  
////		  alert.accept();
		 
	}

}
