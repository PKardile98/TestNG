package POPUPs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Permission_Popups {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
			
        System.setProperty("webdriver.Chrome.Driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
        
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.hdfcbank.com/");
		
		Thread.sleep(5000);
		
		driver.close();
		
		
	}

}
