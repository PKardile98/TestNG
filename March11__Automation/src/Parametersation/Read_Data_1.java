package Parametersation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Data_1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// To pass the value from Excel sheet to Facebook page.
		
		
		
		String Path= "C:\\Users\\Prashant\\Desktop\\Book1.xlsx";
		FileInputStream File = new FileInputStream(Path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(File);
		
		String Data = workbook.getSheetAt(0).getRow(1).getCell(0).getStringCellValue();
		String Data1 = workbook.getSheetAt(0).getRow(1).getCell(1).getStringCellValue();
		
		//String Data1 = WorkbookFactory.create(File).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		System.out.println(Data);
		System.out.print(Data1+" ");
		
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\Resources\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.id("email")).sendKeys(Data);
			Thread.sleep(3000);
			driver.findElement(By.id("pass")).sendKeys(Data1);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
			Thread.sleep(3000);
			
			driver.close();
			
		

	}

}
