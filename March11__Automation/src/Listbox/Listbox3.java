package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox3 {

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
			
			WebElement Day= driver.findElement(By.id("day"));
			
			WebElement Month= driver.findElement(By.id("month"));
			
			WebElement Year= driver.findElement(By.id("year"));
			
			Thread.sleep(5000);
			
			String DOB = "2-Jun-1998";
			String[] Date =DOB.split("-");
			
			// 0--2
			// 1--6
			// 3--1998
				
				Listbox(Day, Date[0]);
				Listbox(Month, Date[1]);
			    Listbox(Year, Date[2]);
			    
			    
			}
			
			public static void Listbox(WebElement element,String Text )  {
				
				Select Select10 = new Select(element);
				Select10.selectByVisibleText(Text);
				
				
		
				
			}
			
		
	
	
	
	
	
	

}
