package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.ExtentTest;

public class AccountPages extends HeaderPage {

	public AccountPages(WebDriver driver, ExtentTest log) {
		super(driver, log);		
	}
	
	@FindBy(name="accountname")
	WebElement tb_accountname;
	
	@FindBy(name="button")
	WebElement btn_save;
	
	@FindBy(name="Edit")
	WebElement btn_Edit;
	
	@FindBy(name="Duplicate")
	WebElement btn_Duplicate;
	
	@FindBy(xpath="//td[text()='Account Name:']/following-sibling::td[1]")
	WebElement dt_accountNameValue;
	
	public void createAccount(String value)
	{
		gm.enterValue(tb_accountname, value, "Account field");
		gm.clickElement(btn_save, "button save");
	}
	
		
	public void ClickEditButton()
	{
		gm.clickElement(btn_Edit, "button Edit");
	}
	
	public void verifyAccountName(String value)
	{
		gm.elementDisplay(dt_accountNameValue, "Account Name data");
	}
	
	public void createduplicateaccount()
	{
		gm.clickElement(btn_Duplicate, "Duplicate button");
		gm.clickElement(btn_save, "save button");
	}
	

}
