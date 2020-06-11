package com.ravali.selenium;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Orngehrm {
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sai Ravali\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		WebElement username= driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.sendKeys("user02");
		WebElement password= driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.sendKeys("TM1234");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//b[text()='Leave']")).click();
		driver.findElement(By.xpath("//a[@id='menu_leave_viewMyLeaveList']")).click();
		driver.findElements(By.xpath("//label[text()='Show Leave with Status']"));
		WebElement all=driver.findElement(By.xpath("//input[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']"));
		all.click();
			 Thread.sleep(3000);
			WebElement cancelled= driver.findElement(By.xpath("//input[@id='leaveList_chkSearchFilter_0']"));
			cancelled.click();
			 driver.findElement(By.xpath("//input[@name='btnSearch']")).click();
			   List<WebElement> row=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
			System.out.println("no of rows:"+row.size());
			
		 		for(int r=1;r<=row.size();r++)
				{
					WebElement celldata=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+r+"]/td[6]"));
					String data=celldata.getText();
					String mystring = data.substring(0,data.length()-6);
					System.out.println(mystring);
					if(mystring.equals("Cancelled"))
					{
						System.out.println("["+mystring+"] is displayed " );
						
					}
					else {
						System.out.println("["+mystring+"] is not displayed " );
						
					}
					
				}
			
			  driver.close();
			  }

}
