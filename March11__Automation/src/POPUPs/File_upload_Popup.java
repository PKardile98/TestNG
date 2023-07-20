package POPUPs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_upload_Popup {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.Chrome.Driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		driver.findElement(By.xpath("//input[@id=\"file-upload\"]")).sendKeys("D:\\Pradeep\\Software Testing\\Automation Testing");

		
		driver.findElement(By.xpath("//input[@class=\"button\"]")).click();
		
		Thread.sleep(4000);
		
	}

}
