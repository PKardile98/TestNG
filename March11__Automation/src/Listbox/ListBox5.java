package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox5 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
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
		
		String Day= "//select[@id=\"day\"]/options";
		
		String Month= "//select[@id=\"month\"]/options";
		
		String Year= "//select[@id=\"year\"]/options";
		
		
		String DOB = "2/Jun/1998";
		String[] Date =DOB.split("/");
		
		// 0--2
		// 1--6
		// 3--1998
		
		SelectDropdown(Day, Date[0]);
		SelectDropdown(Month, Date[1]);
		SelectDropdown(Year, Date[2]);
		
		Thread.sleep(3000);
		
		driver.close();
		
			
	}
	
	public static void SelectDropdown(String element , String values) {
		
		
		List<WebElement> B1 = driver.findElements(By.xpath(element));
		System.out.println(B1);
		System.out.println(B1.size());
		
		for(int i=0; i<B1.size(); i++) {
			
			System.out.println(B1.get(i).getText());
			
			if(B1.get(i).getText().equals(values))
            {
				B1.get(i).click();
				
			}
			
			
		}
		
		
	}
	
	
	
	

}
