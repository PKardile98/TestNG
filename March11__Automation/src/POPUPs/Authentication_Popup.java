package POPUPs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_Popup {

	public static void main(String[] args) throws InterruptedException {
		    System.setProperty("webdriver.Chrome.Driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
	        
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
			
		    String Text	= driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credentials.')]")).getText();
			System.out.println(Text);
			Thread.sleep(3000);
			
			driver.close();
			
			
			
			

	}

}
