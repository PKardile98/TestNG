package POPUPs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_5_JS1 {

	public static void main(String[] args) throws InterruptedException {
	
		
          // Java script Popup and alert pop up
		
        System.setProperty("webdriver.Chrome.Driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
        
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Pradeep kardile");
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		String ExpectedMsg = "Please Enter your password";
		
		Alert A1 = driver.switchTo().alert();
		
		String AlertMsg = A1.getText();
		
		if(ExpectedMsg.equals(AlertMsg)) {
			
			System.out.println("Correct Alert Msg");
		}
		else {
			
			System.out.println("InCorrect Alert Msg");
			
		}
		
		Thread.sleep(3000);
		A1.accept();
		Thread.sleep(3000);
		driver.close();
		

	}

}
