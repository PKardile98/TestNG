package Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrames2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		    System.setProperty("webdriver.Chrome.Driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
	        
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://demo.automationtesting.in/Frames.html");
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
			
			WebElement Outerframe =driver.findElement(By.xpath("//div[@id=\"Multiple\"]//iframes"));

			driver.switchTo().frame(Outerframe);
			
			
	}

}
