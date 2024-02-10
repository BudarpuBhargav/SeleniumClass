package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	//public static WebDriver driver;
	
	public static void main(String[] args) {
		 WebDriver driver= new ChromeDriver();
		 
		 driver.get("https://jqueryui.com/droppable/");
		 
		 driver.switchTo().frame(0);
		  
		 WebElement src = driver.findElement(By.id("draggable"));
		 WebElement target = driver.findElement(By.id("droppable"));
		 
		 ElimentUtility et = new ElimentUtility(driver);
		 et.dragDrop(src, target);
		 
		 //dragNdDrop(src, target);
		 
	}
 
	public static void dragNdDrop(WebElement src, WebElement target) {
		Actions action = new Actions(driver);
		//action.clickAndHold(src).moveToElement(target).release().build().perform();
		
		action.dragAndDrop(src, target).build().perform();
		
	}

}
