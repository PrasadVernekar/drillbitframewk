package com.drillbit.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createFolder {
WebDriver ldriver;
	
	public createFolder (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath = "//*[@data-testid='AddIcon']")
	WebElement addButton;
	
	@FindBy(name = "folder_name")
	WebElement foldername;
	
	@FindBy(xpath="//*[text()='Submit']")
	WebElement foldersubmit;
	
	@FindBy(xpath="//*[@aria-label='close']")
	WebElement close;
	
	@FindBy(xpath="//tbody/tr[1]/td[5]/button[2]")
	WebElement Delete;
	
	@FindBy(xpath="//*[text()='Yes']")
	WebElement deleteyes;
	
	@FindBy(xpath="//*[@class='MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-1lsgdco']")
	WebElement logodropdown;
	
	@FindBy(xpath="//*[text()='Log out']")
	WebElement logout;
	
	public void addbtn() {
		addButton.click();
	}
	
	public void fname(String folder) {
		foldername.sendKeys(folder);
	}
	
	public void fsubmit() {
		foldersubmit.click();
	}
	
	public void Close() {
		close.click();
	}
	
	public void delete() {
		Delete.click();
	}
	
	public void yes() {
		deleteyes.click();
	}
	
	public void logo() {
		logodropdown.click();
	}
	
	public void logout() {
		logout.click();
	}
	
}
