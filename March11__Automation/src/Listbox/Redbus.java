package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.redbus.in/");
			Thread.sleep(3000);
			
			driver.manage().window().maximize();
			
			driver.findElement(By.id("src")).sendKeys("Pun");
			Thread.sleep(5000);
			
			List<WebElement> City = driver.findElements(By.xpath("//li[@select-id=\"results[0]\"]"));
			
			Thread.sleep(5000);
			
			System.out.println("No. of City-->"+City.size());
			
			for(int i=0; i<City.size(); i++) {
				
				String Cityvalue = City.get(i).getText();
				
				System.out.println(Cityvalue);
				
				
				
				if(City.get(i).getText().equals("Wakad")) {
					
					System.out.println(City.get(i).getText());
					
					Thread.sleep(5000);
					
					City.get(i).click();
				}
				
			}
			
			// Destination 
			
			driver.findElement(By.id("dest")).sendKeys("mumbai");
			
			
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
				
			}		

	     }

      }
