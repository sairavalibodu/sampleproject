package com.ravali.selenium;

import java.io.IOException;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
		public static WebDriver driver;
			public static void main(String[] args) throws InterruptedException, IOException 
			{
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sai Ravali\\Desktop\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
					WebElement Email= driver.findElement(By.xpath("//input[@name='email']"));
					if(Email.isDisplayed())
					{
						System.out.println("email is displayed");
					}
					else
					{
						System.out.println("is not displayed");
					}
						
					
					WebElement password= driver.findElement(By.xpath("//input[@name='pass']"));
					if(password.isDisplayed())
					{
						System.out.println("passwor is displayed");
					}
					else
					{
						System.out.println("is not displayed");
					}
					
				//	WebElement element = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr/td[text()='Annual Leave']"));
					
					WebElement login= driver.findElement(By.xpath("//label[@id='loginbutton']"));	
					if(login.isDisplayed())
					{
						System.out.println("login is displayed");
					
				}
					else
					{
						System.out.println("is not displayed");
					}

		
			
			WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"))	;
			
			if(firstname.isDisplayed())
			{
				System.out.println("firstname is displayed");
			
		}
			else
			{
				System.out.println("is not displayed");
			}
			WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
			if(lastname.isDisplayed()){
				System.out.println("lastname is displayed");
			}
			else
			{
				System.out.println("is not displayed");
			}
			
WebElement mobileno=driver.findElement(By.xpath("//input[@name='reg_email__']"))	;
			
			if(mobileno.isDisplayed())
			{
				System.out.println("mobileno is displayed");
			
		}
			else
			{
				System.out.println("is not displayed");
			}
			WebElement newpassword=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
			if(newpassword.isDisplayed()){
				System.out.println("newpassword is displayed");
			}
			else
			{
				System.out.println("is not displayed");
			}
WebElement bday=driver.findElement(By.xpath("//select[@id='day']"))	;
			
			if(bday.isDisplayed())
			{
				System.out.println("bday is displayed");
			
		}
			else
			{
				System.out.println("is not displayed");
			}
			WebElement bmonth=driver.findElement(By.xpath("//select[@id='month']"));
			if(bmonth.isDisplayed()){
				System.out.println("bmonth is displayed");
			}
			else
			{
				System.out.println("is not displayed");
			}
WebElement byear=driver.findElement(By.xpath("//select[@id='year']"))	;
			
			if(byear.isDisplayed())
			{
				System.out.println("byear is displayed");
			
		}
			else
			{
				System.out.println("is not displayed");
			}
			WebElement gender=driver.findElement(By.xpath("//label[text()='Female']"));
			if(gender.isDisplayed()){
				System.out.println("female is displayed");
			}
			else
			{
				System.out.println("is not displayed");
			}
			WebElement signup=driver.findElement(By.xpath("//button[@name='websubmit']"));
			if(signup.isDisplayed()){
				System.out.println("signup is displayed");
			}
			else
			{
				System.out.println("is not displayed");
			}
			driver.close();
}
			
	}


