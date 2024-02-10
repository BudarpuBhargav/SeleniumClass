package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("");
		
		/* X-path- is a address or a path of an particular element in webpage used to identify element in page
		 * Types-
		 *1. Absolute- which is starts from root of HTML and specifies complete x-path of any element in page
		 *	Not recommended, risk, if any changes done on DOM (Document object model) it wont work
		 *
		 *2/ Relative X-path- Here, the structure starts with a double forward-slash (//) that states that the 
		 *	element can be searched anywhere on the web page. Relative XPath enables you to write from the middle 
		 *	of the HTML DOM structure without any need to write a long XPath.
		 * 
		 * Syntax:
		 * //TagName[@AttributeType='Attribute Value']
		 * 
		 * using TEXT
		 *  //Tagname[text()='text']
		 *  
		 *  contains
		 *  //tagname[contains(text(),'textValue']
		 *  
		 *  contains-@id
		 *  //tagname[contains(@id,'id value')]
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
	}

}
