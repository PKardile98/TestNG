package Webelement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_click {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		driver.manage().window().maximize();
		
		// Send keys
		
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("Pradeepkardile@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Pradeep1998");
		Thread.sleep(3000);
		
		// click 
		
		driver.findElement(By.xpath("data-test-id=\"password-login-button\"")).click();
		Thread.sleep(3000);
		
		driver.quit();

	}

}
