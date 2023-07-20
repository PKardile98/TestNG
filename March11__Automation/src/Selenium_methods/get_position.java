package Selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_position {

	public static void main(String[] args) throws InterruptedException {
		/*check the position of the browser in terms of x and y coordinates
		 to get this coordinate so to call the printing statement and inside the printing statement to call the function
		driver.manage().window().getPosition()
		 return point arguments in terms of x and y arguments*/
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("Prashant@123");
		
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("123459");
		
		driver.findElement(By.xpath("//i18n-string[text()='Log in']")).click();
		
		Thread.sleep(5000);
		
		//System.out.println(driver.manage().window().getPosition());
		
		
		
		driver.close();
		

	}

}
