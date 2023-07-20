package Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes_Assignment {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.Chrome.Driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		
		Thread.sleep(4000);
		//driver.switchTo().frame("frame1Wrapper");
		
		driver.switchTo().frame("frame1");
		
		// Printing the Text
		
		WebElement T1=driver.findElement(By.xpath("//h1[@id=\"sampleHeading\"]"));
        String T2 =T1.getText();
        System.out.println(T2);
		
		
        Thread.sleep(5000);
        
        driver.switchTo().defaultContent();
        
        driver.findElement(By.xpath("//div[@class=\"header-wrapper\"]")).click();
        
        Thread.sleep(5000);
        driver.close();

	}

}
