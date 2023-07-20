package Selenium_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_current_URL {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.redbus.in/bus-tickets"); // get()-->to enter url in a browser 
			
			String URL = driver.getCurrentUrl(); //getTitle()-->is use to get title of the web page as an output 
			System.out.println(URL);
			
			
			if(URL.equals("https://www.redbus.in/bus-tickets")) {
				
				
				System.out.println("Correct URL");
				
			}
			
			else {
				
				System.out.println("Incorrect URL");
			}
			
			Thread.sleep(5000);
			driver.close();
			
	}

}
