package Chromedriver1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class XLSXwriter {

	public static void main(String[] args) {
		try {
			File fs = new File("C:Users/user/Desktop/DTest/DataSheet.xlsx");
			FileInputStream fins = new FileInputStream(fs);
			XSSFWorkbook xssf_wb = new XSSFWorkbook(fins);
			XSSFSheet xssf_sheet = xssf_wb.getSheetAt(0);
			
			System.out.println(xssf_sheet.getRow(0).getCell(0).getStringCellValue());
			xssf_sheet.getRow(0).createCell(3).setCellValue("Mobile");
			xssf_sheet.getRow(1).createCell(3).setCellValue("9876543210");
			
			
			FileOutputStream fout = new FileOutputStream(fs);
			xssf_wb.write(fout);
			
			
			
		} catch (Exception e) {
		System.out.println("Exception raised"+ e);
		}

	}

}
