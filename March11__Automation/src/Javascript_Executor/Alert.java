package Javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		
       System.setProperty("webdriver.Chrome.Driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement Account1 =driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"));
		
		Actions Act = new Actions(driver);
		
		Act.moveToElement(Account1).build().perform();
		
		driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("Pradeep@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
		Thread.sleep(3000);
		Boolean B1=driver.findElement(By.xpath("//span[contains(text(),'We cannot find an account')]")).isDisplayed();
		System.out.println(B1);
		
		
		// Calling the Generate Alert Message Pop Up
		
		Alert.GenerateAlert(driver, "There is issue with the EmailId Enter Valid one");

		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		
		driver.close();
		
	}
	
	public static void GenerateAlert(WebDriver driver, String Message) {
		
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		
		Js.executeScript("alert('"+Message+"')");
		
		
	}

}
