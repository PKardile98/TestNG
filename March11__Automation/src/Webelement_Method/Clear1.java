package Webelement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear1 {

	public static void main(String[] args) throws InterruptedException {
		
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("Pradeep1998");
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("email")).clear();
		
		driver.findElement(By.id("pass")).sendKeys("123456789");
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("pass")).clear();
		
		driver.close();
		
		
		
		

	}

}
