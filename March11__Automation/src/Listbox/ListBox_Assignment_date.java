package Listbox;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_Assignment_date {

	public static void main(String[] args) throws InterruptedException {
		
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Pradeep");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@ng-model=\"LastName\"]")).sendKeys("Kardile");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys("Sai park-2, teleranwadi road,kesnand,pune14");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@ng-model=\"EmailAdress\"]")).sendKeys("pradeepkardile97@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@ng-model=\"Phone\"]")).sendKeys("8975725507");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@ng-model=\"radiovalue\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id=\"msdd\"]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[text()='English']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@value=\"Movies\"]")).click();
		
		
		// Handling the list box for the date 
		
		WebElement Year = driver.findElement(By.id("yearbox"));
		WebElement Month = driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
		WebElement Day = driver.findElement(By.id("daybox"));
		
		// Total no. of Year
		
		Select D1 = new Select(Year);
		List<WebElement> YearSize = D1.getOptions();
		System.out.println("Total no. of Year -->" +YearSize.size());
		
		System.out.println();
		
		// Print all year 
		
		for(int i=0; i<YearSize.size(); i++) {
			
			String YearAll = YearSize.get(i).getText();
			
			System.out.println(" "+YearAll);
			
			if(YearAll.equals("1998")) {
				
				YearSize.get(i).click();
				
			}
			
			
		}
		
		Thread.sleep(3000);
		
		
		// total no. of months 
		
		Select D2 = new Select(Month);
		List<WebElement> ListMonths = D2.getOptions();
		
		System.out.println("Total no months-->"+ListMonths.size());
		
		// Printing the all months 
		
		for(int j=0 ; j<ListMonths.size(); j++) {
			
			String monthsValue = ListMonths.get(j).getText();
			System.out.println(" "+monthsValue);
			
			if(monthsValue.equals("June")) {
				
				ListMonths.get(j).click();
				
			}
			
		}
		
		Thread.sleep(3000);
		
		// total no. of days value 
		
		Select D3 = new Select(Day);
		List<WebElement> NoOfDay= D3.getOptions();
		
		System.out.println("Total no of Days"+NoOfDay.size());
		
		// Print all Values of the Days Box
		
		for(int k=0; k<NoOfDay.size(); k++) {
			
			String DayValues = NoOfDay.get(k).getText();
			
			System.out.println(DayValues);
			
			if(DayValues.equals("2")) {
				
				NoOfDay.get(k).click();
				
			}
			
			
		}
		
		Thread.sleep(3000);
		driver.close();
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
