package Webelement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdisplayed {

	public static void main(String[] args) 
	
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		// Return type of isDisplayed function is boolean.
		//If element is present then it returns true otherwise it returns exception.
		
		
		WebElement Input = driver.findElement(By.xpath("//img[@src=\"https://static.xx.fbcdn.net/rsrc.php/y8/r/dF5SId3UHWd.svg\"]"));
		
		System.out.println(Input.isDisplayed());

	}

}
