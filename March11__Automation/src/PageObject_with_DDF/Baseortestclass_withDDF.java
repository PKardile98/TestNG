package PageObject_with_DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseortestclass_withDDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		

        System.setProperty("webdriver.Chrome.Driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Login_page LP = new Login_page(driver);
		
		// to fetch the data from Sheet
		
		String Path ="C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\TestData\\Task1.xlsx";
		
		FileInputStream File = new FileInputStream(Path);
		
		Sheet Data=WorkbookFactory.create(File).getSheet("Sheet2");
		
		LP.Goto1();
		
		String Name= Data.getRow(1).getCell(0).getStringCellValue(); // UserName
        LP.User_N(Name);
        
        String Pas_ID= Data.getRow(1).getCell(1).getStringCellValue(); // Password
        LP.Pass_1(Pas_ID);
        
        LP.Login_button();
        
        Dashboard_1 DP_1= new Dashboard_1(driver);
        DP_1.usernamevalidation();
        DP_1.At_time();
		
	}

}
