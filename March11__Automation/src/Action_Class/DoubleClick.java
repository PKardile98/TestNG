package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.Chrome.Driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement Double =driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
		
		Actions Act = new Actions(driver);
		
		Act.doubleClick(Double).build().perform();
		
		Thread.sleep(4000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		
		driver.close();
		
		
		

	}

}
