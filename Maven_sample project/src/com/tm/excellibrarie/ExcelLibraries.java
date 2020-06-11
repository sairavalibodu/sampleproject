package com.tm.excellibrarie;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibraries {
	
	public static void main(String[] args){
		getRowCount();
	}
	
	public static void  getRowCount(){
		try
		{
			
			XSSFWorkbook workbook = new XSSFWorkbook("C:\\Users\\Sai Ravali\\Documents\\sampleproject\\Hello World\\test.xlsx");
			XSSFSheet sheet = workbook.getSheet("sheet1");
			sheet.getRow(2);
			int rowcount=sheet.getPhysicalNumberOfRows();
			System.out.println("no of rows"+rowcount);
			
			
	}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
	

}
