package Listbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/flights/");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[text()='From']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).sendKeys("Pune");
		Thread.sleep(5000);
		
		List<WebElement> City = driver.findElements(By.xpath("//ul[@role=\"listbox\"]"));
		
		Thread.sleep(5000);
		
		System.out.println("No. of City-->"+City.size());
		
		for(int i=0; i<City.size(); i++) {
			
			String Cityvalue = City.get(i).getText();
			
			System.out.println(Cityvalue);
			
			Thread.sleep(5000);
			
			if(City.get(i).getText().equals("Pune, India")) {
				
				System.out.println(City.get(i).getText());
				
				Thread.sleep(7000);
				
				City.get(i).click();
				Thread.sleep(5000);
				
				break;
			}
			
		}
		
		driver.close();
		
		// Destination 
		
		/*driver.findElement(By.id("dest")).sendKeys("mumbai");
		
		
        List<WebElement> DestCity = driver.findElements(By.xpath("//li[@select-id=\\\"results[0]\\\"]"));
		
		Thread.sleep(5000);
		
		System.out.println("No. of DestCity-->"+DestCity.size());
		
		for(int i=0; i<DestCity.size(); i++) {
			
			String DestCityvalue = DestCity.get(i).getText();
			
			System.out.println(DestCityvalue);
			
			if(DestCity.get(i).getText().equals("Dadar")) {
				
				System.out.println(DestCity.get(i).getText());
				Thread.sleep(5000);
				
				DestCity.get(i).click();
			}

	}*/

	}
}