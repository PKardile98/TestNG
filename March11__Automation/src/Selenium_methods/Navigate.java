package Selenium_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		/* •	This method is to open an application, move forward, backward and refresh the browser.
		•	Navigate method can be used for alternate method for get method
		•	Can’t pass input directly to the navigate to call the to function*/
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/bus-tickets");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.redbus.in/bus-tickets");
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		driver.close();
		
		
		


	}

}
