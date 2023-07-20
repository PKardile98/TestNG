package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox2 {

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
		
		
		// 1. Select by visible text
		
		//Day
		/*Select Select1 = new Select(Day);
		Select1.selectByVisibleText("2");
		
		//Month
		Select Select2 = new Select(Month);
		Select2.selectByVisibleText("Jun");
		
		//Year
		Select Select3 = new Select(Year);
		Select3.selectByVisibleText("1998");*/
		
		// 2. Select by value
		
		//Day
		/*Select Select4 = new Select(Day);
		Select4.selectByValue("2");
		
		//Month
		Select Select5 = new Select(Month);
		Select5.selectByValue("6");
		
		//Year
		Select Select6 = new Select(Year);
		Select6.selectByValue("1998");*/
		
		// 3. select by index
		
		//Day
		Select Select7 = new Select(Day);
		Select7.selectByIndex(1);
		
		//Month
		Select Select8 = new Select(Month);
		Select8.selectByIndex(5);
		
		//Year
		Select Select9 = new Select(Year);
		Select9.selectByIndex(22);	
		
		
		
		
		
		
		
		
		

	}

}
