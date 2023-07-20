package POPUPs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_4_JS1 {

	public static void main(String[] args) throws InterruptedException {
		 // Java script Popup and alert pop up
		
        System.setProperty("webdriver.Chrome.Driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
        
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		
		Alert Text = driver.switchTo().alert();
		
		System.out.println("Alert Msg-->"+Text.getText()); //getText(): use to get text present present in an alert popup.
		Thread.sleep(3000);
		
		Text.sendKeys("Welcome");
		Thread.sleep(3000);
		Text.accept();
		Thread.sleep(3000);
		driver.close();
		
		
		
		

	}

}
