package webdriverbasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExWriteExcelData {

	public static void main(String[] args) throws IOException{
		
		File file = new File("D:\\work\\codebase\\webdriverbasics\\resources\\TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wrkbook = new XSSFWorkbook(fis);
		
		Sheet sheet = wrkbook.getSheet("TestData");
		
		Cell cell = sheet.getRow(1).createCell(4);
		cell.setCellValue("HariKrishna");
		
		FileOutputStream fos = new FileOutputStream(file);
		wrkbook.write(fos);
		

	}

}
