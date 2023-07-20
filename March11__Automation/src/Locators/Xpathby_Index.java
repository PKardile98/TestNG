package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathby_Index {

	public static void main(String[] args) {
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.amazon.in/ref=nav_logo");
			
			driver.manage().window().maximize();
			
			// Syntax--(xpath expression)[index]
			//tagname[@attribute name=’attribute value’])[index]
			
			driver.findElement(By.xpath("//a[@class=\"nav-a  \"][8]")).click();
				

	}

}
