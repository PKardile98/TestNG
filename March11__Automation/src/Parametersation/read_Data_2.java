package Parametersation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class read_Data_2 {

	public static void main(String[] args) throws IOException {
		
		
		String File = "C:\\Users\\Prashant\\eclipse-workspace\\March11__Automation\\TestData\\Book1.xlsx";
		
		FileInputStream Data = new FileInputStream(File);
		
		XSSFWorkbook Workbook = new XSSFWorkbook(File);
		
		String D1 = Workbook.getSheetAt(0).getRow(1).getCell(0).getStringCellValue();
		System.out.println(D1);
		String D2 = Workbook.getSheetAt(0).getRow(1).getCell(1).getStringCellValue();
		System.out.println(D2);
		
		

	}

}
