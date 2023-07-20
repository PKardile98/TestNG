package Webelement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear2 {

	public static void main(String[] args) throws InterruptedException 
	
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		
		 WebElement Qwerty = driver.findElement(By.id("email"));
		 
		 Qwerty.sendKeys("Pradeep1998");
		 
		 Thread.sleep(3000);
		 Qwerty.clear();
		 Thread.sleep(3000);
		 Qwerty.sendKeys("Prashant");
		 
		 
		 WebElement Qwerty1 = driver.findElement(By.id("pass"));
		 
		 Qwerty1.sendKeys("123qwerty");
		 Thread.sleep(3000);
		 Qwerty1.clear();
		 Thread.sleep(3000);
		 Qwerty1.sendKeys("qwertyuiop");
		 
		 
		 Thread.sleep(3000);
		 driver.close();	
		 
		 
		 

	}

}
