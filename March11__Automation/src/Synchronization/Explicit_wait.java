package Synchronization;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.Chrome.Driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		WebDriverWait My_Wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		
		WebElement Element = My_Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("src")));
		
		Element.sendKeys("Pune");
		
        WebDriverWait My_Wait1= new WebDriverWait(driver, Duration.ofSeconds(15));
		
		WebElement Element_1 = My_Wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("dest")));
		
		Element_1.sendKeys("Banglore");
		

		
		driver.quit();
	}

}
