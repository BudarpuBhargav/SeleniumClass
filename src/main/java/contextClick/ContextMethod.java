package contextClick;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMethod {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException{
		
		driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		//WebElement contextClick= driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		By subMenuLocator=By.xpath("//li[@class='toctree-l2 current']");
		By contextClick=By.xpath("//*[text()='right click me']");
		By contextSelectList= By.xpath("//li[contains(@class,'context-menu-icon')]");
		Actions action = new Actions(driver);
		//action.contextClick(contextClick).perform();
		//driver.findElement(By.className("reference internal current")).click();
		//action.click(driver.findElement(subMenuLocator)).perform();
		//clickAction(subMenuLocator);
		//System.out.println(menuOptions(locator).size());
		
		//clickAction(subMenuLocator);
		//action.click(driver.findElement(subMenuLocator)).build().perform();
		//driver.findElement(By.xpath("//li[@class='toctree-l2 current']")).click();
		contextClickAction(contextClick);
		System.out.println(menuOptions(contextSelectList).size());
		Thread.sleep(3000);
		
		//printList(contextSelectList,"edit");
		
		//driver.switchTo().alert().accept();
		
		List <String> menuList=rightClickList(contextSelectList);
		System.out.println(menuList);
		
		clickonMenuList(contextSelectList, "quit");
		driver.switchTo().alert().accept();
		}

	
	public static  List<WebElement> menuOptions(By locator){
		return driver.findElements(locator); 
	}
	
	public static WebElement getWebElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void clickAction(By locator){
		Actions action = new Actions(driver);
		action.click(getWebElement(locator)).build().perform();
	}
	
	public static void contextClickAction(By locator){
		Actions action = new Actions(driver);
		action.contextClick(getWebElement(locator)).build().perform();
	}
	public static void printList(By locator, String value) {
		for (WebElement e :menuOptions(locator)) {
			String text=e.getText();
			System.out.println(text);
			if(text.equalsIgnoreCase(value)) {
				e.click();
				break;
			}
		}
	}
	//add list of items to Array List and print total size
	public static List<String> rightClickList(By locator){
		
		List<String> rightClickList =new ArrayList<String>();
		List<WebElement> menuList= driver.findElements(locator);
		
		System.out.println("Menu Size   "+menuList.size());
		for(WebElement e : menuList) {
			String itemText =e.getText();
			rightClickList.add(itemText);
		}
		return rightClickList;
	}
	
	public static void clickonMenuList(By locator, String value) {
		List<WebElement> list=driver.findElements(locator);
		
		for(WebElement e: list) {
			String listText=e.getText();
			
			if(listText.equalsIgnoreCase(value)) {
				e.click();
			}
			
		}
		
	}
}

	

