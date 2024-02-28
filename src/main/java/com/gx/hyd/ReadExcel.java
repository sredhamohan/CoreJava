package com.gx.hyd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File(System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelRData.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
		XSSFWorkbook wb=  new XSSFWorkbook(fis);
		XSSFSheet sh= wb.getSheet("Sh");
		 int rowCount=sh.getLastRowNum()-sh.getFirstRowNum();
	        
	        //iterate over all the row to print the data present in each cell.
	        for(int i=0;i<=rowCount;i++){
	            
	            //get cell count in a row
	            int cellcount=sh.getRow(i).getLastCellNum();
	            
	            //iterate over each cell to print its value
	          //  System.out.println("Row"+ i+" data is :");
	            
	            for(int j=0;j<cellcount;j++){
	            	switch(sh.getRow(i).getCell(j).getCellType()){
	            		
	            		case STRING:
	            			System.out.print(sh.getRow(i).getCell(j).getStringCellValue() +",");
	            			break;
	            		case NUMERIC:
	            			System.out.print(sh.getRow(i).getCell(j).getNumericCellValue() +",");
	            	default:break;
	            	}
	                
	            }
	            System.out.println();
	        }

	}

}
 