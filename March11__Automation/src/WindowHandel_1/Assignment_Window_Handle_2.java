package WindowHandel_1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Window_Handle_2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.Chrome.Driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		
		Thread.sleep(5000);
		
		// 2.Locate the “Visit W3Schools.com!” link and click it.
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//a[contains(text(),'Visit W3Schools.com!')]")).click();
		Thread.sleep(5000);
		
		// 3.Get all window handles and hold them in a list.
		
		Set<String> WDID1 = driver.getWindowHandles();
		
		// 4. Write to total window handle number to the console. It must be 2.
		
		System.out.println("Total window size handled:"+WDID1.size());
		System.out.println();
		
		Iterator<String> P1 = WDID1.iterator();
		String Parent = P1.next();
		String Child = P1.next();
		
		System.out.println("Parent Window-->"+Parent);
		System.out.println("Child Window-->"+Child);
		System.out.println();
		
		// 5.Switch t0 the second window.
		
		driver.switchTo().window(Parent);
		//System.out.println("Parent window-->"+driver.getTitle());
		
		driver.switchTo().window(Child);
		
		// 6.Get the current window’s handle and write to the console window. It must be a second window handle.
		System.out.println("Child window Title-->"+driver.getTitle());
		
		// 7.Check the upper left side logo in the second window.
		
		Boolean B1=driver.findElement(By.xpath("//i[@class=\"fa fa-logo ws-hover-text-green\"]")).isDisplayed();
		System.out.println("Check the Left Handside Logo:"+B1);
		System.out.println();
		
		// 8.Go back (Switch) to the first window.
		
		driver.switchTo().window(Parent);
		
		// 9. 10.Get the current window’s handle and write to the console window. It must be the first window handle.
		System.out.println("Parent window Title-->"+driver.getTitle());
		
		// 10.Check the See Run Button Text. It must contain “Run >” text.
		
		String S1=driver.findElement(By.xpath("//button[contains(text(),'Run ❯')]")).getText();
		System.out.println("Check the Run text:"+S1);
		
        Thread.sleep(3000);
        
        driver.quit();
		
		
	}

}
