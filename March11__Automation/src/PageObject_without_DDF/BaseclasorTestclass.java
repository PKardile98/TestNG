package PageObject_without_DDF;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseclasorTestclass {

	public static void main(String[] args) {
		
		
        System.setProperty("webdriver.Chrome.Driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Login_Page LP = new Login_Page(driver); // Object of the login page
		
		LP.Goto();
		LP.username("Admin");
		LP.Pass("admin123");
		LP.Login();
		
		Dashboard DP = new Dashboard(driver);
		DP.usernamevalidation();
		DP.At_time();
		

	}	

}
