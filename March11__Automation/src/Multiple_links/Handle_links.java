package Multiple_links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_links {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.Chrome.Driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> Links=driver.findElements(By.tagName("a"));
		
		System.out.println("Total links -->"+Links.size());
		
		for(WebElement L1:Links) {
			
			//System.out.println(L1.getText());
			System.out.println(L1.getAttribute("href"));
		}
		
		driver.quit();
		
	}
}
