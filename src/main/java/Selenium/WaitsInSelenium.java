package Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsInSelenium {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		
	/*1.static wait
	 * 2.Dynamic wait
	 *	a.Implicit wait- implicit wait
	 *	b.explicit wait
	 *   -webdriver wait
	 *   -fluent wait
	 *   
	 *  driver.theread.sleep(ms)- static
	 */
		
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);x1
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}

	public static String waitForTitle(String title, int time) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.titleIs(title));
		return driver.getTitle();	
	}
}
