package com.tmScreenPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.tm.BaseClass.Baseclass;

public class Login extends Baseclass {

	/*
	 * public static void main(String[] args) throws InterruptedException {
	 * 
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\Sai Ravali\\Desktop\\chromedriver.exe"); WebDriver driver=new
	 * ChromeDriver();
	 * driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
	 * driver.manage().window().maximize(); WebElement username=
	 * driver.findElement(By.xpath("//input[@id='txtUsername']"));
	 * username.sendKeys("user02"); WebElement password=
	 * driver.findElement(By.xpath("//input[@id='txtPassword']"));
	 * password.sendKeys("TM1234");
	 * driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	 * Thread.sleep(1000); }
	 */
	
	
	
	
	
	
	public void chklogin() throws InterruptedException {
		
		Baseclass myclass = new Baseclass();
		
		WebDriver driver = myclass.myDriver();
		
		System.out.println("I am Accessing :: "+driver);
		
		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		WebElement username= driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.sendKeys("user02");
		WebElement password= driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.sendKeys("TM1234");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(1000);
		
		System.out.println("Succesfully Logged");
		
		System.out.println("Now moving to time sheets");
		
		TimeSheets tmsht=new TimeSheets();
		tmsht.chkTimeSheets();
		
		
	}
	
	
	

}
