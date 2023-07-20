package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

import net.bytebuddy.utility.RandomString;

public class Zerodha3 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		//3. Take a screenshot for the Kite login page and store it in the project folder 
		//three times using the random string method.
		

	       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.get("https://kite.zerodha.com/");
			
			driver.manage().window().maximize();
			
			String A2 = "KiteLogo1";
			
			Zerodha3.TakeSS(A2);
			Thread.sleep(3000);
			Zerodha3.TakeSS(A2+"1");
			Thread.sleep(3000);
			Zerodha3.TakeSS(A2+"2");
			

	}
	
	public static void TakeSS(String Zerodha) throws InterruptedException, IOException {
		
		WebElement Logo1 = driver.findElement(By.xpath("//div[@class=\"form-header text-center\"]"));
		
		Thread.sleep(3000);
		
		File A1 = ((TakesScreenshot) Logo1).getScreenshotAs(OutputType.FILE);
		
		String Random = RandomString.make(2);
		
		File A2 = new File("C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Screenshot\\"+Zerodha+" "+Random+".jpg");
		
		Files.copy(A1, A2);
		
		driver.close();
		
		
		
	}

}
