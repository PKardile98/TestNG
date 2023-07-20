package Selenium_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_size {

	public static void main(String[] args) throws InterruptedException {
		/*check the browser size immediate open of browser
		 to check the size to call the printing statement and inside the printing statement to call the function driver.manage().window().getSize()
		 return dimension arguments in terms of width and height*/
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/bus-tickets");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		System.out.println(driver.manage().window().getSize());
		
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
