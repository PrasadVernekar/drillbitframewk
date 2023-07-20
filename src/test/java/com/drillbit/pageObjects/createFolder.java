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
	
	public void addbtn() {
		addButton.click();
	}
	
	public void fname(String folder) {
		foldername.sendKeys(folder);
	}
	
	public void fsubmit() {
		foldersubmit.click();
	}

}
