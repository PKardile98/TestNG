package Selenium_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit {

	public static void main(String[] args) throws InterruptedException {


		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.redbus.in/bus-tickets"); // get()-->to enter url in a browser 
			
			driver.get("https://www.w3schools.com/sql/sql_having.asp");
			
			Thread.sleep(5000);
			
			driver.quit(); //quite()-->to close all the tabs of the browser
		
		

	}

}
