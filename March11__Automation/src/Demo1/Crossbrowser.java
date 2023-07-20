package Demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser {

	public class CrossBrowser1 {

		WebDriver driver;

		@SuppressWarnings("deprecation")
		@Parameters("Browsername")

		@Test

		public void OrangeHRM(String Browsername) {

			if (Browsername.equalsIgnoreCase("Chrome")) {

				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");

				driver = new ChromeDriver();
			}

			else if (Browsername.equalsIgnoreCase("FireFox")) {

				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\geckodriver.exe");

				driver = new FirefoxDriver();

			}

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		}

	}
}