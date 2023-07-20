package Webelement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext {

	public static void main(String[] args) 
	
	{
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
	    String Expectedtext="Facebook helps you connect and share with the people in your life.";
	    
	    String Actualtext= driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you')]")).getText();
	    
	    if(Expectedtext.equals(Actualtext)) {
	    	
	    	System.out.println("Correct Text");
	    }
	    
	    else {
	    	
	    	System.out.println("Incorrect Text");
	    	
	    }

	}

}
