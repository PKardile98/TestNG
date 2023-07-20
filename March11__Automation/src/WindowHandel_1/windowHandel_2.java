package WindowHandel_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandel_2 {

	public static void main(String[] args) throws InterruptedException {
		
		
        System.setProperty("webdriver.Chrome.Driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		
		Thread.sleep(2000);
		
		Set<String> WDID_1 = driver.getWindowHandles();
		// It is used to store all opened Windows ID in set data.
		
		// 1. Method using Iterator
		
		Iterator<String> IT = WDID_1.iterator();
		
		String Parentwindow = IT.next();
		String Childwindow = IT.next();
		
		System.out.println("Parent Window-->"+Parentwindow);
		System.out.println("Child Window-->"+Childwindow);
		
		System.out.println();
		
		// 2. Another Way using List
		
		List<String> WindowList = new ArrayList(WDID_1);
		
		String Parent = WindowList.get(0);
		String Child = WindowList.get(1);
		
		System.out.println("Parent -->"+Parent);
		System.out.println("Child  -->"+Child);
		
		System.out.println();
		
		//how to switch selenium focus to child window 
		
		driver.switchTo().window(Parentwindow);
		System.out.println("Parentwindow-->"+driver.getTitle());
		
		driver.switchTo().window(Childwindow);
		System.out.println("ChildWindow-->"+driver.getTitle());
		
		driver.quit();
		
		
		
		
		
		

	}

}
