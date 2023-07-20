package Parametersation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assignment_Reading_Data_6 {

	public static void main(String[] args) throws IOException {
		
		String Path ="C:\\Users\\Prashant\\Desktop\\StudentInfo.xlsx";
		FileInputStream File = new FileInputStream(Path);
		
		XSSFWorkbook Workbook = new XSSFWorkbook(File);
		
		// 4. Print Last row and Cell number.
		
		XSSFSheet Sheet = Workbook.getSheetAt(4);
		int row = Sheet.getLastRowNum();
		
		System.out.println("Last Row-->"+row);
		
		int cell = Sheet.getRow(1).getLastCellNum();
		
		System.out.println("Last Cell Number-->"+cell);
		
		System.out.println();
		
		// Printing All data using if else Statement 
		
		for(int R=0; R<row; R++) {
			
			XSSFRow R1 = Sheet.getRow(R);
			
			for(int C=0; C<cell; C++) {
				
				XSSFCell C1 = R1.getCell(C);
				
				if(C1.getCellType()==CellType.NUMERIC) {
					
					double V1 = C1.getNumericCellValue();
					System.out.println(V1);
					
				}
				else 
					if(C1.getCellType()== CellType.STRING) {
						
						String S1 = C1.getStringCellValue();
						System.out.println(S1);
						
					}
				System.out.println(" || ");
				
				
				
			}
			System.out.println();	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
