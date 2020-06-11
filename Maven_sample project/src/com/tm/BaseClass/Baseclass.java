package com.tm.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {

	public WebDriver myDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sai Ravali\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		return driver;
	}

}
