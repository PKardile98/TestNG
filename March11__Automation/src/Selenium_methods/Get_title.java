package Selenium_methods;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_title {

	public static void main(String[] args) throws InterruptedException {
		
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/bus-tickets"); // get()-->to enter url in a browser 
		
		String title = driver.getTitle(); //getTitle()-->is use to get title of the web page as an output 
		System.out.println(title);
		
		driver.close();
		
		String expected_title="Online Bus Ticket Booking with best offers - redBus";
		
		if(title.equals(expected_title)) {
			
			System.out.println(" Correct Title ");
			
			
		}
		
		else {
			
			System.out.println(" Incorrect title");
		}
		

	}

}
