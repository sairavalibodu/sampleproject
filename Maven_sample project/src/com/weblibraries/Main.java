package com.weblibraries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main extends RadioButton {
	public static void main(String[]args) {
		int value=1;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sai Ravali\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.get("https://www.facebook.com");
		switch(value) {
		case 1:
			WebElement female = driver.findElement(By.xpath("//label[text()='Female']/preceding-sibling::input"));
			radioBtn(female);
			break;
		case 2:
		    WebElement male =	driver.findElement(By.xpath("//label[text()='Male']/preceding-sibling::input"));
		    radioBtn(male);
		break;
		case 3:
		     WebElement custom=	driver.findElement(By.xpath("//label[text()='Custom']/preceding-sibling::input"));
		     radioBtn(custom);
		break;
			default:
				break;
			
			
		
		}
	}
}
	
		
		


