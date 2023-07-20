package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import net.bytebuddy.utility.RandomString;

public class Zerodha2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// 2.Take a screenshot of the  "Kite to login" text and store it in the project folder.
		
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://kite.zerodha.com/");
			
			driver.manage().window().maximize();
			
			WebElement Logo1 = driver.findElement(By.xpath("//div[@class=\"form-header text-center\"]"));
			
			Thread.sleep(3000);
			
			File SS1 = ((TakesScreenshot) Logo1).getScreenshotAs(OutputType.FILE);
			
			String Image = "Zerodha";
			
			String Random = RandomString.make(5);
			
			File SS2 = new File("C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Screenshot\\"+Image+" "+Random+".jpg");
			
			Files.copy(SS1, SS2);
			
			driver.close();

	}

}
