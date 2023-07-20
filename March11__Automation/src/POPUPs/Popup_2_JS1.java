package POPUPs;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_2_JS1 {

	public static void main(String[] args) throws InterruptedException {
		
		// Java script Popup and alert pop up
		
        System.setProperty("webdriver.Chrome.Driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
        
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept(); // accept(): use to click on ok button.
		
		Thread.sleep(3000);
		
		Boolean B1= driver.findElement(By.xpath("//p[@id=\"result\"]")).isDisplayed();
		
		System.out.println(B1);
		
		driver.quit();
		
	}

}
