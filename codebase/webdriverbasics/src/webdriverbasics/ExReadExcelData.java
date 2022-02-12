package webdriverbasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExReadExcelData {

	public static void main(String[] args) throws IOException{
		
		File file = new File("D:\\work\\codebase\\webdriverbasics\\resources\\TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wrkbook = new XSSFWorkbook(fis);
		
		Sheet sheet = wrkbook.getSheet("TestData");
		
		Cell cell = sheet.getRow(1).getCell(2);
		String s = cell.getStringCellValue();
		System.out.println(s);
		
		wrkbook.close();

	}

}
