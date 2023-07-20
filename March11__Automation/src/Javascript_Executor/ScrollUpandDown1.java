package Javascript_Executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpandDown1 {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.Chrome.Driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/");
		
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		
		
		// Scroll Down
		Js.executeScript("window.scrollBy(0,10000)", "");
		
		Thread.sleep(5000);
		
		// Scroll Up 
		
		Js.executeScript("window.scrollBy(0,-10000)", "");
		
		driver.close();

	}

}
