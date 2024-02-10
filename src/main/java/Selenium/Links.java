package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		
	List <WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		/*for (WebElement e : links) {
			System.out.println(e.getAttribute("href"));
		}*/
		
		for(int i=0; i<links.size(); i++) {
			
			String linkText = links.get(i).getText();
			
			if(!linkText.isEmpty()) {
				System.out.println(i+" )"+linkText );
				System.out.println(links.get(i).getAttribute("href")); 
				System.out.println("");
			}
		}
	}

}
