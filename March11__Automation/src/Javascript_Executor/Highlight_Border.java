package Javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Highlight_Border {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.Chrome.Driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement D1 =driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		WebElement D2=driver.findElement(By.id("email"));
		
		JavascriptExecutor Js = (JavascriptExecutor) driver;

		Js.executeScript("arguments[0].style.border='10px solid red'",D1 );
		Js.executeScript("arguments[0].style.border='10px solid red'", D2);
	}

}
