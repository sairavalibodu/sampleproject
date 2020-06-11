package com.ravali.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Xpath {
	
	public static void main(String[] args) throws InterruptedException, IOException {

			//Runtime.getRuntime().exec("https://www.facebook.com/");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sai Ravali\\Desktop\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://testingmasters.com/hrm/symfony/web/index.php/leave/viewMyLeaveList");
			WebElement user = driver.findElement(By.xpath("//input[@id='txtUsername']"));
			user.sendKeys("user02");
			
			WebElement password= driver.findElement(By.xpath("//input[@id='txtPassword']"));
			password.sendKeys("TM1234");
			WebElement element = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr/td[text()='Annual Leave']"));
			//element.sendKeys("sairavali");
			//WebElement lstnm = driver.findElement(By.xpath("//input[@name='lastname']"));
			//	lstnm.sendKeys("pasula.0" + "");
			//element.sendKeys("Please select Month");
		//	JavascriptExecutor js=(JavascriptExecutor )  driver;
		//	js.executeScript("arguments[0].click();",element);
			
						
			
		}

}

