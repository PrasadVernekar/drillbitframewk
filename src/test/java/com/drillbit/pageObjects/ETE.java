package com.drillbit.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ETE {
WebDriver ldriver;
	
	public ETE(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath = "//*[@data-testid='AddIcon']")
	WebElement eaddButton;
	
	@FindBy(name = "folder_name")
	WebElement efoldername;
	
	@FindBy(xpath="//*[text()='Submit']")
	WebElement efoldersubmit;
	
	@FindBy(xpath="//*[@aria-label='close']")
	WebElement eclose;
	
	@FindBy(xpath="//tbody/tr[1]/td[5]/button[3]//*[name()='svg']//*[name()='path' and contains(@d,'m12 4-1.41')]")
	WebElement eForwardbtn;
	
	@FindBy(xpath="//*[@data-testid='AddIcon']")
	WebElement eAdd_Icon;
	
	@FindBy(xpath="//*[text()='English']")
	WebElement eeng;
	
	@FindBy(xpath="//*[text()='Browse your file here']")
	WebElement eBrowseyourfile;
	
	@FindBy(name="authorName0")
	WebElement eAuthorName;
	
	@FindBy(name="title0")
	WebElement eTitleName;
	
	@FindBy(name="documentType0")
	WebElement eDocument_type;
	
	@FindBy(xpath="//*[text()='Submit']")
	WebElement eSubmit;
	
	@FindBy(xpath="//*[@aria-label='Delete']")
	WebElement edelete;
	
	@FindBy(xpath="//*[text()='Yes']")
	WebElement eyes;
	
	@FindBy(xpath="//*[text()='My folder']")
	WebElement emyfolder;
	
	@FindBy(xpath="//button[@aria-label='Delete']//*[name()='svg']")
	WebElement emyfolddelte;
	
	@FindBy(xpath="//*[text()='Yes']")
	WebElement edeltyes;
	
	@FindBy(xpath="//*[text()='P']")
	WebElement elogodropdown;
	
	@FindBy(xpath="//*[text()='Log out']")
	WebElement elogout;
	
	public void addbtn() {
		eaddButton.click();
	}
	
	public void fname(String folder) {
		efoldername.sendKeys(folder);
	}
	
	public void fsubmit() {
		efoldersubmit.click();
	}
	
	public void close() {
	 eclose.click();
	}
	
	public void forwardbtn() {
		eForwardbtn.click();
	}
	
	public void AddIcon() {
		eAdd_Icon.click();
	}
	
	public void English() {
		eeng.click();
	}
	
	public void browseyourfile() {
	eBrowseyourfile.click();
	}
	
	public void AuthorName(String aname) {
	eAuthorName.sendKeys(aname);
	}

	public void TitleName(String tname) {
	eTitleName.sendKeys(tname);
	}
	
	public void document_type(String documenttype) {
	eDocument_type.sendKeys(documenttype);
	}
	
	public void submit() {
	eSubmit.click();
	}
	
	public void Delete() {
	edelete.click();
	}
	
	public void Yes() {
		eyes.click();
	}
	
	public void myfold() {
		emyfolder.click();
	}
	
	public void myfolddelte() {
		emyfolddelte.click();
	}
	
	
	public void myfoldyes() {
		edeltyes.click();
	}
	
	public void logo() {
		elogodropdown.click();
	}
	
	public void Logout() {
		elogout.click();
	}
}
