package WindowHandel_1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle_3 {

	public static void main(String[] args) throws InterruptedException {
		
		
        System.setProperty("webdriver.Chrome.Driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		Thread.sleep(2000);
		
		Set<String> WD1 = driver.getWindowHandles();
		// Using Itertor
		Iterator<String> A1 = WD1.iterator();
		
		String Parent = A1.next();
		String Child = A1.next();
		
		System.out.println("Parentwindow-->"+Parent);
		System.out.println("Child-->"+Child);
		
		System.out.println();
		
		// Switch Focus 
		
		driver.switchTo().window(Parent);
		System.out.println("ParentWindow-->"+driver.getTitle());
		
		driver.switchTo().window(Child);
		System.out.println("ChildWindow-->"+driver.getTitle());
		
		driver.findElement(By.id("Form_submitForm_EmailHomePage")).sendKeys("Pradeep@gmail.com");
		driver.findElement(By.id("Form_submitForm_action_request")).click();
		
		driver.switchTo().window(Parent);
		
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Pradeep@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("1234567");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		Thread.sleep(3000);
		driver.quit();

	}

}
