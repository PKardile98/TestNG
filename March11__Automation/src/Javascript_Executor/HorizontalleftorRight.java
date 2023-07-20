package Javascript_Executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HorizontalleftorRight {

	public static void main(String[] args) throws InterruptedException {
		
		   System.setProperty("webdriver.Chrome.Driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
	        
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://blog.hubspot.com/website/horizontal-scrolling");
			
			JavascriptExecutor Js = (JavascriptExecutor) driver;
			
			//Scroll Right 
			Js.executeScript("window.scrollBy(10000,0)", "");
			
			Thread.sleep(3000);
			
			// Scroll Left 
			Js.executeScript("window.scrollBy(-10000,0)", "");

			driver.close();
	}

}
