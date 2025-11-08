package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcelFile {
	
	static String path = "./src/main/resources/TestData/DemoDataTest.xlsx";
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream(path);
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheet("Sheet1");
//		Row row = sheet.getRow(1);
//		
//		Cell cell = row.getCell(0);
//		String url = cell.getStringCellValue();
//		System.out.println(url);
//		
//		Cell us = row.getCell(1);
//		String us1 = us.getStringCellValue();
//		System.out.println(us1);
//		
//		Cell pw = row.getCell(2);
//		String pw1 = pw.getStringCellValue();
//		System.out.println(pw1);
		
		String url = sheet.getRow(1).getCell(0).getStringCellValue();
		String us = sheet.getRow(1).getCell(1).getStringCellValue();
		String pw = sheet.getRow(1).getCell(2).getStringCellValue();
		
		System.out.println(url+" "+us+" "+pw);
	}

}
