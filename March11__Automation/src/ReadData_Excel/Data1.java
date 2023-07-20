package ReadData_Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data1 {

	public static void main(String[] args) throws IOException {
		
		
		String Path= "C:\\Users\\Prashant\\Desktop\\Book1.xlsx";
		FileInputStream File = new FileInputStream(Path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(File);
		
		String Data = workbook.getSheetAt(0).getRow(1).getCell(0).getStringCellValue();
		String Data1 = workbook.getSheetAt(0).getRow(1).getCell(1).getStringCellValue();
		
		//String Data1 = WorkbookFactory.create(File).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		System.out.println(Data);
		System.out.print(Data1+" ");
		

	}

	
	
}
