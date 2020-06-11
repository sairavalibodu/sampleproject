package com.tmScreenPages;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.weblibraries.RadioButton;

public class StatusChecking extends RadioButton {
	public static WebDriver driver;

	public static void launchApp(){
     System.setProperty("webdriver.gecko.driver","c:\\selenium\\Drivers\\geckodriver.exe");
       driver=new FirefoxDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
       driver.get("http://testingmasters.com/hrm/");
	}
	 public static void loginApp(){
            driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("user02");
	        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("TM1234");
	        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}
    
    public static void navMyleave(){
    Actions act=new Actions(driver);
    WebElement leave=driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']"));
    act.moveToElement(leave).build().perform();
    driver.findElement(By.xpath("//a[@id='menu_leave_viewMyLeaveList']")).click();
    }
    
    public static void addDate(){
    String fromdate="2019-10-01";
    WebElement frmdat = driver.findElement(By.xpath("//input[@id='calFromDate']"));
    frmdat.clear();
    frmdat.sendKeys(fromdate);
    frmdat.sendKeys(Keys.ESCAPE);
   
    String todate="2020-12-31";
    WebElement todat= driver.findElement(By.xpath("//input[@id='calToDate']"));
    todat.clear();
    todat.sendKeys(todate);
    todat.sendKeys(Keys.ESCAPE);
    }
    
   public static void statusAllCheck(){
    WebElement allcheckbox =driver.findElement(By.xpath("//input[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']"));
    statusVerify();
    allcheckbox.click();
    }
   
    public static void statusRejectedCheck(){
     driver.findElement(By.xpath("//label[text()='Rejected']/following-sibling::input")).click();
     driver.findElement(By.xpath("//input[@id='btnSearch']")).click();
     statusVerify();
     driver.findElement(By.xpath("//label[text()='Rejected']/following-sibling::input")).click();
     }
    
    public static void statusCancelledCheck(){
    driver.findElement(By.xpath("//label[text()='Cancelled']/following-sibling::input")).click();
    driver.findElement(By.xpath("//input[@id='btnSearch']")).click();
    statusVerify();
    driver.findElement(By.xpath("//label[text()='Cancelled']/following-sibling::input")).click();
    }
    
    public static void statusPendingapprovalCheck(){
     driver.findElement(By.xpath("//label[text()='Pending Approval']/following-sibling::input")).click();
     driver.findElement(By.xpath("//input[@id='btnSearch']")).click();
     statusVerify();
     driver.findElement(By.xpath("//label[text()='Pending Approval']/following-sibling::input")).click();
    }
    
     public static void statusScheduledCheck(){
    driver.findElement(By.xpath("//label[text()='Scheduled']/following-sibling::input")).click();
    driver.findElement(By.xpath("//input[@id='btnSearch']")).click();
    statusVerify();
    driver.findElement(By.xpath("//label[text()='Scheduled']/following-sibling::input")).click();
     }
     
    public static void statusTakenCheck(){
    driver.findElement(By.xpath("//label[text()='Taken']/following-sibling::input")).click();
    driver.findElement(By.xpath("//input[@id='btnSearch']")).click();
    statusVerify();
    driver.findElement(By.xpath("//input[@id='btnReset']")).click();
    driver.close();
    }
    
    public static void statusVerify(){
    int rowsize=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
    System.out.println(rowsize);
    String rowtext=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr")).getText();
       if(rowtext.contains("No Records Found"))
        {
       	 System.out.println("Records not found");
       
        }	        
           else
           {
    		 boolean b=true;
    		 for(int i=1; i<=rowsize;i++)
    		    {
            	 String status= driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[6]")).getText();
       	          System.out.println(status);
                 if(!(status.contains("Rejected"))&&!(status.contains("Cancelled"))&&!(status.contains("Pending Approval"))&&!(status.contains("Scheduled"))&&!(status.contains("Taken")))
                  b=false;
                 break;
    		    }
               if(b)
     	       System.out.println("status  is verified");
     	       else
     	         System.out.println("status is not verified");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
           }
       }
        
        public static void main(String[] args){
          launchApp();
          loginApp();
          navMyleave();
          addDate();
          statusAllCheck();
          statusRejectedCheck();
          statusCancelledCheck();
          statusPendingapprovalCheck();
          statusScheduledCheck();
          statusTakenCheck();    
    }
	
	

}
