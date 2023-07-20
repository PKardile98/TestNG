package ScreenShot;

import java.io.File;

import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;



public class SS1 {

	public static void main(String[] args) throws IOException  {
		
		
		//C:\Users\Prashant\Desktop\SS1
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		File Destination = new File("C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Screenshot\\pk1.jpg");
		
		//FileHandler.copy(source, Destination);
		
        Files.copy(source, Destination);
        
    	
           driver.quit();
    	}

    
		

	}

	
		
	

