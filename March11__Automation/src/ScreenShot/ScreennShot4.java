package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

import Selenium_methods.Quit;
import net.bytebuddy.utility.RandomString;

public class ScreennShot4 {
	
	 static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//File Source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		String File = "FaceBook1";
		
		ScreennShot4.TakeSS(File);
		
		ScreennShot4.TakeSS("1"+File);
		ScreennShot4.TakeSS(File+"2");

	}
	
	public static void  TakeSS(String Filename) throws IOException {
		
		File Source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		String Random = RandomString.make(2);
		
	    File Dest = new File("C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Screenshot\\"+Filename+" "+Random+".jpg");
		
	    Files.copy(Source, Dest);
	    
	    driver.quit();
	    
	}

}
