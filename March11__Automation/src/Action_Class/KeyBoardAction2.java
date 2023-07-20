package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction2 {

	public static void main(String[] args) {


		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://text-compare.com/");
		
		WebElement Input1 = driver.findElement(By.id("inputText1"));
		WebElement Input2 = driver.findElement(By.id("inputText2"));
		
		Input1.sendKeys("Pradeep is going to be recommend in this attempt:");
		
		Actions A1 = new Actions(driver);
		
		// Crtl+a
		
		A1.keyDown(Keys.CONTROL);
		A1.sendKeys("a");
		A1.keyUp(Keys.CONTROL);
		A1.build().perform();
		

		// copy
		
		A1.keyDown(Keys.CONTROL);
		A1.sendKeys("c");
		A1.keyUp(Keys.CONTROL);
		A1.build().perform();
		
		// tab shift 
		
		A1.sendKeys(Keys.TAB);
		A1.perform();
		
		A1.keyDown(Keys.CONTROL);
		A1.sendKeys("v");
		A1.keyUp(Keys.CONTROL);
		A1.build().perform();
		
		if(Input1.getAttribute("value").equals(Input2.getAttribute("value"))) {
			
			System.out.println("Copied correctly");
		}
		
		else {
			
			System.out.println("Copied correctly");
			
		}
		
		
	}

}
