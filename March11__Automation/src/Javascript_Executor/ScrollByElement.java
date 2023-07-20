package Javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByElement {

	public static void main(String[] args) throws InterruptedException {


		    System.setProperty("webdriver.Chrome.Driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
	        
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.w3schools.com/");
			
			JavascriptExecutor Js = (JavascriptExecutor) driver;
			
			WebElement D1=driver.findElement(By.xpath("//a[contains(text(),'Try it Yourself')]"));
			
			// Scroll by element
			Js.executeScript("arguments[0].scrollIntoView();", D1);
			
			Thread.sleep(4000);
            driver.close();
            
	}

}
