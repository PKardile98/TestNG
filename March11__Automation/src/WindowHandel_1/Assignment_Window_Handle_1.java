package WindowHandel_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Window_Handle_1 {

	public static void main(String[] args) {
		
		// 1.Get the current window’s handle and write to the console window. It must be the first window handle.
		
		    System.setProperty("webdriver.Chrome.Driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
	        
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
			
			String WindowID = driver.getWindowHandle();
			
			System.out.println(WindowID);
			//C2E256A0038580A5F30DE321FFD541C8

	}

}
