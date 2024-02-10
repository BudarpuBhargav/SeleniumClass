package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//create ONE method for- drop down select methods for single , multiple and All selections

public class DropDownwithNoSelectTag {

	public static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		 //Multi Selection
		
		//driver.findElement(By.id("justAnInputBox")).click();
		//By DropDwnOpt = By.xpath(".//span[contains(@class,'comboTreeItemTitle')]");
		
		//Multi Selection With Cascade Option Select
		
		driver.findElement(By.id("justAnInputBox1")).click(); 
		
		//By DropDwnOpt = By.xpath(".//span[contains(@class,'comboTreeItemTitle')]");
		By DropDwnOpt = By.xpath("//span[@class='comboTreeItemTitle']");
	
		

		// single selection
		// SelectDropDownFromList(DropDwnOpt, "choice 7");

		// Multiple selection
		// SelectDropDownFromList(DropDwnOpt, "choice 7","choice 2 3","choice 5");

		// All option selection
		SelectDropDownFromList(DropDwnOpt, "all");
	}

	public static void SelectDropDownFromList(By DropDwnOpt, String... value) {
		List<WebElement> DropDownElement = driver.findElements(DropDwnOpt);

		System.out.println(DropDownElement.size());

		if (!value[0].equalsIgnoreCase("ALL")) {

			for (int i = 0; i < DropDownElement.size(); i++) {
				String DDText = DropDownElement.get(i).getText();

				for (int j = 0; j < value.length; j++) {
					if (value[j].equals(DDText)) {
						DropDownElement.get(i).click();
					}
				}
			}
		} else {
			try {
				for (WebElement e : DropDownElement) {
					String text=e.getText();
					if(text.isEmpty()) {
						
					}
					else {
						e.click();
					}
				}

			} catch (Exception e) {

			}

		}

	}

//	public static void SelectDropDownFromList (By DropDwnOpt, String...value ) {
//		List<WebElement> DropDownElement= driver.findElements(DropDwnOpt);
//		System.out.println(DropDownElement.size());
//		for(int i=0; i<DropDownElement.size();i++) {
//			String DDText=DropDownElement.get(i).getText();
//			System.out.println(DDText);
//			if(DDText.equals(value)) {
//				DropDownElement.get(i).click();
//				break;
//			}
//		}
//		
//	}
}
