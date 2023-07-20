package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listbox1 {

	public static void main(String[] args) throws InterruptedException 
	
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\"]")).sendKeys("Suhas");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("sukale");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("8975725507");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@data-type=\"password\"]")).sendKeys("12345678");
		
		//day
		
		driver.findElement(By.id("day")).click();
		driver.findElement(By.xpath("//option[@value=\"8\"]")).click();
		Thread.sleep(2000);
		
		//Month
		driver.findElement(By.id("month")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Oct')]")).click();
		Thread.sleep(2000);
		
		// Year
		driver.findElement(By.id("year")).click();
		driver.findElement(By.xpath("//option[contains(text(),'2020')]")).click();
		Thread.sleep(2000);
		

	}

}
