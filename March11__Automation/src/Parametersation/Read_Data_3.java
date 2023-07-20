package Parametersation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_3 {

	public static void main(String[] args) throws IOException {
		
		String File = "C:\\Users\\Prashant\\Desktop\\StudentInfo.xlsx";
		
		FileInputStream File1 = new FileInputStream(File);
		
		XSSFWorkbook Workbook = new XSSFWorkbook(File1);
		
		XSSFSheet Sheet = Workbook.getSheetAt(3);
		
		int Row = Sheet.getLastRowNum();
		System.out.println(Row);
		int Col = Sheet.getRow(1).getLastCellNum();
		System.out.println(Col);
		
		for(int R=0; R<Row; R++) {
			
			XSSFRow Row1 = Sheet.getRow(R);
			
			for(int C=0; C<Col; C++) {
				
				XSSFCell Cell = Row1.getCell(C);
				
				switch(Cell.getCellType()) {
				
				case STRING:
					System.out.println(Cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.println(Cell.getNumericCellValue());
					break;
				case BOOLEAN:
					System.out.println(Cell.getBooleanCellValue());
					break;
				default:
					break;
				}
				System.out.println(" || ");
					
			}
		    System.out.println();
			
		}
		

	}

}
