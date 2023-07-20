package Selenium_methods;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Set_Size {

	public static void main(String[] args) throws InterruptedException {
		/* This method is use to change size of the browser which accepts
		dimensions arguments
•	setSize() method can’t accept directly the width and height of the browser. This method accept only dimension arguments.
•	Before using setSize() method we need to create the object of the dimension class and then pass the width and height of the browser in the constructor of the dimension class
•	Dimension class present in the selenium
•	Type dime    use control+space
•	To enter width and height value is the browser resolution or physical value*/
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.redbus.in/bus-tickets");
			
		   Dimension D1 = new Dimension(200,500);
		   
		   driver.manage().window().setSize(D1);
		   
		   Thread.sleep(5000);
		   
		   driver.close();		   
		   
			
			
			
			


	}

}
