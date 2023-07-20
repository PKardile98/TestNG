package WindowHandel_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle_1 {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.Chrome.Driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String WID1= driver.getWindowHandle();
		
		// By using the getwindowHandle method we can get ID of the browser window.
		
		System.out.println(WID1);
		//39B3B63CB7C4BE66F451E45794BF3237
		Thread.sleep(4000);
		driver.close();
		
		/*driver.get("https://www.w3schools.com/");
		
		Boolean B1=driver.findElement(By.xpath("//i[@class=\"fa fa-logo ws-hover-text-green\"]")).isDisplayed();
		System.out.println(B1);
		
		Thread.sleep(3000);
		
		driver.close();*/
		
		
		

	}

}
