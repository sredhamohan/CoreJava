package com.gx.hyd;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook wb= new XSSFWorkbook();
		XSSFSheet sh= wb.createSheet("Sheet1");
		
		Row r0= sh.createRow(0);
		Cell c0=r0.createCell(0);
		Cell c1=r0.createCell(1);
		
		c0.setCellValue("Header");
		
		c1.setCellValue("Header2");
		
		FileOutputStream fos=new FileOutputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelData.xls");
		
		wb.write(fos);
		fos.close();
		wb.close();

	}

}
