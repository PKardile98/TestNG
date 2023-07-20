package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathby_Text {

	public static void main(String[] args) throws InterruptedException 
	
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		// Syntax-////Tagname[text()=’text value’]
		//Any keyword which is present in between angular brace(>) greater than symbol & angular brace (<) less than symbol is known as Text

		
		driver.findElement(By.xpath("//button[text()='Log in']")).click();	
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
