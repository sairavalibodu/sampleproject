package com.tm.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFChartSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelData {

	public static void main(String[] args)throws IOException,InterruptedException {
		WebDriver driver;
		XSSFWorkbook workbook;
		XSSFSheet sheet;
		XSSFCell cell=null;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sai Ravali\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4000,TimeUnit.MILLISECONDS);
		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
		File f=new File("C:\\Users\\Sai Ravali\\Desktop\\testdata.xlsx");
		try {
			FileInputStream fis=new FileInputStream(f);
			workbook=new XSSFWorkbook(fis);
			sheet=workbook.getSheet("sheet1");
			for(int i=1;i<=sheet.getLastRowNum();i++)
			{
				cell=sheet.getRow(i).getCell(1);
				//cell.setCellType(cell.CELL_TYPE_STRING);
			   driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(cell.getStringCellValue());
			     cell=sheet.getRow(i).getCell(2);
			    driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(cell.getStringCellValue());
			    driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
			    {
			    	driver.findElement(By.xpath("//a[text()='Welcome 123456']"));
			    }
			}
		}
			
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
