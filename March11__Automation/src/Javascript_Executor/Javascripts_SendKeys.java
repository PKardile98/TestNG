package Javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascripts_SendKeys {

	public static void main(String[] args) throws InterruptedException {
		
		   System.setProperty("webdriver.Chrome.Driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
	        
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			
			//WebElement D1 =driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
			WebElement D2=driver.findElement(By.id("email"));
			WebElement D3=driver.findElement(By.id("pass"));
			
			JavascriptExecutor Js = (JavascriptExecutor) driver;
			
			//SendKeys
			
			//Js.executeScript("document.getElementById('email').value='Pradeep12345';", D2);
			//Thread.sleep(5000);
			//Js.executeScript("document.getElementById('pass').value='123456';", D3);
		
			// Second Way
			Js.executeScript("arguments[0].value='"+ "Pradeep123" +"';", D2);
			Thread.sleep(5000);
			Js.executeScript("arguments[0].value='"+ "12345" +"';", D3);
			
	}

}
