package com.tmScreenPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyleaveStatus {

	public static void main(String[] args) throws InterruptedException {
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
		WebElement frmdate=driver.findElement(By.xpath("//input[@id='calFromDate']"));
		frmdate.clear();
		frmdate.sendKeys("2020-03-12");
		WebElement todate=driver.findElement(By.xpath("//input[@id='calToDate']"));
		todate.clear();
		todate.sendKeys("2020-03-14");
		
	}

}
