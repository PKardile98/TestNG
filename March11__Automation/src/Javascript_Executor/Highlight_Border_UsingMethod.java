package Javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Highlight_Border_UsingMethod {

	public static void main(String[] args) {
		
		
        System.setProperty("webdriver.Chrome.Driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement D1 =driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		WebElement D2=driver.findElement(By.id("email"));
		WebElement D3=driver.findElement(By.id("pass"));
		
		Highlight_Border_UsingMethod.Highlight_Border(driver, D1);
		Highlight_Border_UsingMethod.Highlight_Border(driver, D2);
		Highlight_Border_UsingMethod.Highlight_Border(driver, D3);
		
	}
	
	public static void Highlight_Border(WebDriver driver,WebElement element) {
		
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		
		Js.executeScript("arguments[0].style.border='10px solid black'", element);
		Js.executeScript("arguments[0].style.background='yellow'", element);
	}
	

}
