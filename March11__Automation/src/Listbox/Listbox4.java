package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox4 {

	public static void main(String[] args) throws InterruptedException {
		
		
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
		
	
		// Question 1
		// How will you get total no. size of the list.
		
		Select S1 = new Select(Day);
		List<WebElement> ListDay = S1.getOptions();
		System.out.println("Total Days-->"+ListDay.size());
		
		Thread.sleep(5000);
		
		
		// Question 2 
		// How will print all value 
		
		for(int i=0; i<ListDay.size(); i++) {
			
			
			String DayValues = ListDay.get(i).getText();
			System.out.println(DayValues);
			
			if(DayValues.equals("2")) {
				
				ListDay.get(i).click();
			}
		}
		
		
		// Month
		
		Select S2 = new Select(Month);
		List<WebElement> ListMonth = S2.getOptions();
		System.out.println("Total months-->"+ListMonth.size());
		
		for(int j=0; j<ListMonth.size(); j++) {
			
			String MonthsValues = ListMonth.get(j).getText();
			System.out.println(MonthsValues);
			
			if(MonthsValues.equals("Jun")) {
				
				ListMonth.get(j).click();
			}
			
		}
		
		// Year 
		
		Select S3 = new Select(Year);
		List<WebElement> ListYear = S3.getOptions();
		System.out.println("Total years-->"+ListYear.size());
		
		for(int k=0; k<ListYear.size(); k++) {
			
			String Yearvalues = ListYear.get(k).getText();
			System.out.println(Yearvalues);
			
			if(Yearvalues.equals("1998")) {
				
				ListYear.get(k).click();
			}
			
		}
		driver.close();
		
		
		
		
		
		
		
        
	}

}
