package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Zerodha1 {

	public static void main(String[] args) throws IOException {
		
		// 1. Take a screenshot of the entire page and store it on the desktop.
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
		
		File Source1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		File Dest = new File("C:\\Users\\Prashant\\Desktop\\SS1\\Zerodha1.jpg");
		
		Files.copy(Source1, Dest);
		
		driver.close();
		
		

	}

}
