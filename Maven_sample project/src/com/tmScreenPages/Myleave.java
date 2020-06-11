package com.tmScreenPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.weblibraries.RadioButton;

public class Myleave extends RadioButton{
	@FindBy(xpath="//a[@id='menu_leave_viewLeaveModule']")
	private static WebElement myLeave;
	@FindBy(xpath="//a[@class='toggle tiptip']]")
	private static WebElement myLeave_list;
	@FindBy(xpath="//input[@name='leaveList[calFromDate]']")
	private static WebElement fromDate;
	@FindBy(xpath="//input[@name='leaveList[calToDate]']")
	private static WebElement toDate;
	@FindBy(xpath="//input[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']")
	private static WebElement all_Checkbox;
	@FindBy(xpath="//label[text()='Rejected']")
	private static WebElement rejected_checkbox;
	@FindBy(xpath="//input[@id='leaveList_chkSearchFilter_0']")
	private static WebElement cancelled_checkbox;
	@FindBy(xpath="//input[@id='leaveList_chkSearchFilter_1']")
	private static WebElement pendingapproval_checkbox;
	@FindBy(xpath="//input[@id='leaveList_chkSearchFilter_2']")
	private static WebElement shedulled_checkbox;
	@FindBy(xpath="//input[@id='leaveList_chkSearchFilter_3']")
	private static WebElement taken_checkbox;
	@FindBy(xpath="//input[@id='btnSearch']")
	private static WebElement search_button;
	@FindBy(xpath="//input[@id='btnReset']")
	private static WebElement reset_button;
	@FindBy(xpath="//table[@id='resultTable']")
	private static WebElement result_table;
	@FindBy(xpath="//table[@id='resultTable']/thead/tr[1]")
	private static WebElement table_header;
	@FindBy(xpath="//input[@id='btnSave']")
	private static WebElement save_button;
	

/*//////////////////////////////////////////////*/
    public static WebElement getMyLeave() {
		return myLeave;
	}
	public static WebElement getMyLeave_list() {
		return myLeave_list;
	}
	public static WebElement getFromDate() {
		return fromDate;
	}
	public static WebElement getToDate() {
		return toDate;
	}
	public static WebElement getAll_Checkbox() {
		return all_Checkbox;
	}
	public static WebElement getRejected_checkbox() {
		return rejected_checkbox;
	}
	public static WebElement getCancelled_checkbox() {
		return cancelled_checkbox;
	}
	public static WebElement getPendingapproval_checkbox() {
		return pendingapproval_checkbox;
	}
	public static WebElement getShedulled_checkbox() {
		return shedulled_checkbox;
	}
	public static WebElement getTaken_checkbox() {
		return taken_checkbox;
	}
	public static WebElement getSearch_button() {
		return search_button;
	}
	public static WebElement getReset_button() {
		return reset_button;
	}
	public static WebElement getResult_table() {
		return result_table;
	}
	public static WebElement getTable_header() {
		return table_header;
	}
	public static WebElement getSave_button() {
		return save_button;
	}
	
	//=======================================//
	public static void Leave()
	{
		boolean  status;
		status=click( getMyLeave());
		logEvent(status,"clicked the element","not clicked on the element");
	
		status=click( getMyLeave_list());
		logEvent(status,"clicked the element","not clicked on the element");
		
		status=text( getFromDate(),"11-03-20");
		logEvent(status,"text is entered","text is not on the entered");
		
		status=click( getAll_Checkbox());
		logEvent(status,"clicked the element","not clicked on the element");
		
		status=click( getRejected_checkbox());
		logEvent(status,"clicked the element","not clicked on the element");
		
		status=click( getCancelled_checkbox());
		logEvent(status,"clicked the element","not clicked on the element");
		
		status=click( getShedulled_checkbox());
		logEvent(status,"clicked the element","not clicked on the element");
		
		status=click( getTaken_checkbox());
		logEvent(status,"clicked the element","not clicked on the element");
		
		status=click( getSearch_button());
		logEvent(status,"clicked the element","not clicked on the element");
		
		status=click( getSave_button());
		logEvent(status,"clicked the element","not clicked on the element");
		
		
		
	}
}

    
