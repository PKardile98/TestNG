package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathby_contains_Attributes {

	public static void main(String[] args) throws InterruptedException 
	
	
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//Syntax-//tagname[contains(@attribute name,’attribute value’)]
		
		driver.findElement(By.xpath("//input[contains(@type,\"text\")]")).sendKeys("Pradeep1998");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@class,\"inputtext _55r1 _6luy _9npi\")]")).sendKeys("1998");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@class,\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\")]")).click();
		
		
		
		

	}

}
