package Selenium_methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_position {

	public static void main(String[] args) throws InterruptedException {
		/* This method is use to change position of the browser which accept point argument
		 Before using setPosition() method we need to create the object of the point class and then pass the x and y coordinate of the browser in the constructor of the point class
		 point class present in the selenium
		 Type poi----use control+space*/
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/bus-tickets");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		org.openqa.selenium.Point P1= new Point(50,140); // set position
		
		driver.manage().window().setPosition(P1);
		
		Thread.sleep(5000);
		
		driver.close();
		

	}

}
