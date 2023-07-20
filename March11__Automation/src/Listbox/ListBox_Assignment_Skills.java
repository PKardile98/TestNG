package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_Assignment_Skills {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Pradeep");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@ng-model=\"LastName\"]")).sendKeys("Kardile");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys("Sai park-2, teleranwadi road,kesnand,pune14");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@ng-model=\"EmailAdress\"]")).sendKeys("pradeepkardile97@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@ng-model=\"Phone\"]")).sendKeys("8975725507");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@ng-model=\"radiovalue\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id=\"msdd\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='English']")).click();
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//input[@value=\"Movies\"]")).click();
		
		
		
		// Handling the list Box
		
		WebElement Skills = driver.findElement(By.id("Skills"));
		
		// Using the select class
		
		Select A1 = new Select(Skills);
		List<WebElement> ListSkills = A1.getOptions();
		System.out.println("Total no. of Skills-->"+ListSkills.size());
		
		for (int i=0; i<ListSkills.size(); i++) {
			
			String SkillsValues = ListSkills.get(i).getText();
			
			System.out.println(SkillsValues);
			
			if(SkillsValues.equals("APIs")) {
				
				ListSkills.get(i).click();
			}
			
			
		}
		
		Thread.sleep(5000);
		driver.close();
		
	
		
		
		
		
				

	}

}
