package POPUPs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childwindowpopup {

	public static void main(String[] args) throws InterruptedException {
		
		
        System.setProperty("webdriver.Chrome.Driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.xpath("//a[contains(text(),'Open New Seperate Windows')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		
		String ParentWindow = driver.getWindowHandle();
		
		System.out.println(ParentWindow);
		//1519AC09F007B903B31A97D7D09DD76E
		
		Set<String> Childwindows = driver.getWindowHandles();
		System.out.println(Childwindows);
		
		for(String Childwindow:Childwindows) {
			
			//System.out.println(Childwindows);
			// Object Obj:varname
			if(!ParentWindow.equalsIgnoreCase(Childwindow)) {
				
				driver.switchTo().window(Childwindow);
				
				String S1=driver.findElement(By.xpath("//h1[contains(text(),'Selenium automates browsers. ')]")).getText();
				System.out.println(S1);
				driver.close();
			}
		}
		
		driver.switchTo().window(ParentWindow);
		
		String S2 =driver.findElement(By.xpath("//h1[contains(text(),'Automation Demo Site ')]")).getText();
		
		System.out.println(S2);
		driver.quit();

	}

}
