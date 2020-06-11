package com.ravali.selenium;
import java.io.IOException;
//import java.util.List;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Myinfo {
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
	WebElement myinfo=driver.findElement(By.xpath("//b[text()='My Info']"));
	myinfo.click();
	WebElement dependent=driver.findElement(By.xpath("//a[text()='Dependents']"));
	dependent.click();
	Thread.sleep(1000);
	WebElement add=driver.findElement(By.xpath("//input[@value='Add']"));
	add.click();
	WebElement name=driver.findElement(By.xpath("//input[@name='dependent[name]']"));
	name.sendKeys("anusha");
	WebElement relation=driver.findElement(By.xpath("//select[@id='dependent_relationshipType']"));	
    Select option = new Select(relation);
    option.selectByValue("child");
    WebElement dob =driver.findElement(By.xpath("//input[@name='dependent[dateOfBirth]']"));
    dob.click();
   driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]/div[1]/select[1]/option[text()='Mar']")).click();
   driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]/div[1]/select[2]/option[text()='1920']")).click();
   driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//table/tbody/tr/td/a[text()='1']")).click();
     driver.findElement(By.xpath("//input[@id='btnSaveDependent']")).click();
   List<WebElement> row=driver.findElements(By.xpath("//table[@id='dependent_list']/tbody/tr"));
	System.out.println("no of rows:"+row.size());
	
		for(int r=1;r<=row.size();r++)
		{
			WebElement celldata=driver.findElement(By.xpath("//table[@id='dependent_list']/tbody/tr["+r+"]/td[2]"));
			String data=celldata.getText();
			//System.out.println(data);
			if(data.equalsIgnoreCase("sairavali"))
			{
				System.out.println(" is found at row : "+r);
			}
		}
		
	
		driver.close();

	}
	}


