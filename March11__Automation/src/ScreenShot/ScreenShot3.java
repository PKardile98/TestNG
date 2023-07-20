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

public class ScreenShot3 {

	public static void main(String[] args) throws IOException {
		
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement Logo= driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		
		File source = ((TakesScreenshot) Logo).getScreenshotAs(OutputType.FILE);
		
		
		String Random = RandomString.make(5);
		
		String Image = "FaceBook5";
		
		File Destination = new File("C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Screenshot\\"+Image+" "+Random+".jpg");
		
		//FileHandler.copy(source, Destination);
		
        Files.copy(source, Destination);
        
    	
           driver.quit();


	}

}
