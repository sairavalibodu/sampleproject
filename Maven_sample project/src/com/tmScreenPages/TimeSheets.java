package com.tmScreenPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.tm.BaseClass.Baseclass;

public class TimeSheets extends Baseclass {

	public static WebDriver driver;
	
	public void chkTimeSheets()
	{
		
		Baseclass myclass = new Baseclass();
		
		WebDriver driver = myclass.myDriver();
		
		//driver.SwitchTo().Window(driver.WindowHandles.Last());
		
	System.out.println("i am inside time sheets");	
	
	System.out.println("I am Accessing :: "+driver);
	
		//driver.findElement(By.xpath("//b[text()='Time']")).click();
		driver.findElement(By.xpath("//a[@id='menu_time_viewMyTimesheet']]")).click();
		driver.findElement(By.xpath("Add Timesheet")).isDisplayed();
		String timeshtheader=driver.findElement(By.xpath("//table/thead/tr[1]")).getText();
		System.out.println("time sheet header text is:"+timeshtheader);
		if(!(timeshtheader.contains(	"Activity Name"))&&!(timeshtheader.contains("Project Name")))
				{
			System.out.println("they are displayed");
				}
        driver.findElement(By.xpath("//select[@id='startDates']/option[text()='2020-03-11 to 2020-03-17']")).click();
		driver.findElement(By.xpath("//a[text()='Add Timesheet']")).click();
		driver.findElement(By.xpath("//input[@name='time[date]']")).sendKeys("2020-03-15");
		driver.findElement(By.xpath("//input[@id='btnEdit']")).isDisplayed();
		driver.findElement(By.xpath("//input[@id='btnEdit']")).click();
		driver.findElement(By.xpath("//input[@id='initialRows_0_projectName']")).sendKeys("orangeHRM");
		driver.findElement(By.xpath("//select[@id='initialRows_0_projectActivityName']"));
		driver.findElement(By.xpath("//input[@name='initialRows[0][0]']")).sendKeys("10:20");
		driver.findElement(By.xpath("//input[@id='submitSave']")).click();
		
		
		
		
	}
	
	
	

}
