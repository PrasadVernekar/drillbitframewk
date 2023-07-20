package com.drillbit.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SingleFileUpload {
WebDriver ldriver;
	
	public SingleFileUpload (WebDriver rdriver) {
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
	WebElement Close;
	
	@FindBy(xpath="//tbody/tr[1]/td[5]/button[3]//*[name()='svg']//*[name()='path' and contains(@d,'m12 4-1.41')]")
	WebElement Forwardbtn;
	
	@FindBy(xpath="//*[@data-testid='AddIcon']")
	WebElement Add_Icon;
	
	@FindBy(xpath="//*[text()='English']")
	WebElement eng;
	
	@FindBy(xpath="//*[text()='Browse your file here']")
	WebElement Browseyourfile;
	
	@FindBy(name="authorName0")
	WebElement AuthorName;
	
	@FindBy(name="title0")
	WebElement TitleName;
	
	@FindBy(name="documentType0")
	WebElement Document_type;
	
	@FindBy(xpath="//*[text()='Submit']")
	WebElement Submit;
	
	public void addbtn() {
		addButton.click();
	}
	
	public void fname(String folder) {
		foldername.sendKeys(folder);
	}
	
	public void fsubmit() {
		foldersubmit.click();
	}
	
	public void close() {
	 Close.click();
	}
	
	public void forwardbtn() {
		Forwardbtn.click();
	}
	
	public void AddIcon() {
		Add_Icon.click();
	}
	
	public void English() {
		eng.click();
	}
	
	public void browseyourfile() {
	Browseyourfile.click();
	}
	
	public void AuthorName(String aname) {
	AuthorName.sendKeys(aname);
	}

	public void TitleName(String tname) {
	TitleName.sendKeys(tname);
	}
	
	public void document_type(String documenttype) {
	Document_type.sendKeys(documenttype);
	}
	
	public void submit() {
	Submit.click();
	}
}
