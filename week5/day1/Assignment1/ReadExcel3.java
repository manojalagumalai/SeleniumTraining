package week5.day1.assignment;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel3 {
	public String[][] readDatafromExcel() throws IOException{
		//create object and set the file path
		XSSFWorkbook book = new XSSFWorkbook("./Data/w3school_assignment.xlsx");
		
		//get sheet name
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		int rowCount = sheet.getLastRowNum();	
		short colCount = sheet.getRow(0).getLastCellNum();
					
		String data[][]=new String[rowCount][colCount];
		
		for(int i=1;i<=rowCount;i++) {
			for(int j=0;j<colCount;j++) {
				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
				data[i-1][j]=stringCellValue;
			}
		}
		book.close();
		return data;
	}

}
