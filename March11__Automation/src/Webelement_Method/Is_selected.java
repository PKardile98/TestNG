package Webelement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_selected {

	public static void main(String[] args) throws InterruptedException 
	
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		
		Thread.sleep(5000);
		
        driver.findElement(By.xpath("//input[@type=\"radio\"]")).click();
        
        Boolean Button = driver.findElement(By.xpath("//input[@type=\\\"radio\\")).isSelected();
        
        System.out.println(Button);
        
        Boolean Button1 = driver.findElement(By.xpath("(//input[@type=\"radio\"])[2]")).isSelected();
        
        System.out.println(Button1);
	}

}
