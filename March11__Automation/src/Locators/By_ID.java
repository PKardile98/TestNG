package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_ID {

	public static void main(String[] args) throws InterruptedException 
	
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Pradeep1998");
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("password")).sendKeys("123456789");
		
		Thread.sleep(4000);
		
		driver.close();
		
		

	}

}
