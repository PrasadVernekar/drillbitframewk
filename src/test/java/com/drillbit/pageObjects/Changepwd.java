package com.drillbit.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Changepwd {
	WebDriver ldriver;
	
	public Changepwd (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	
	@FindBy(xpath="//*[@aria-label='open dr awer']")
	@CacheLookup
	WebElement dropdown;
	
	@FindBy(xpath="//*[text()='Change password']")
	@CacheLookup
	WebElement Changepwd;
	
	@FindBy(name="oldPassword")
	@CacheLookup
	WebElement oldpd;
	
	@FindBy(name="newPassword")
	@CacheLookup
	WebElement newpd;

	@FindBy(name="confirmPassword")
	@CacheLookup
	WebElement cnfpd;
	
	@FindBy(xpath="//*[text()='Change Password']")
	@CacheLookup
	WebElement chanpd;
	
	@FindBy(xpath="//*[@class='MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-1lsgdco']")
	WebElement logo;
	
	@FindBy(xpath="//*[text()='Log out']")
	WebElement logout;
	
	public void dropDown() {
		dropdown.click();
	}
	
	public void changepwd() {
		Changepwd.click();
	}
	
	public void oldpassword(String oldpwd) {
		oldpd.sendKeys(oldpwd); 
	}
	
	public void newPassword(String newpwd) {
		newpd.sendKeys(newpwd);
	}
	
	public void confirmPassword(String cnfpwd) {
		cnfpd.sendKeys(cnfpwd);
	}
	
	public void chanpd() {
		chanpd.click();
	}
	
	public void DropDown() {
		logo.click();
	}
	public void logout() {
		logout.click();
	}
	
	
}
