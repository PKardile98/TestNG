package Selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/bus-tickets"); // get()-->to enter url in a browser
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Wakad, pune");
		
		Thread.sleep(5000);
		
		driver.close(); //close()-->to close the current tab

	}

}
