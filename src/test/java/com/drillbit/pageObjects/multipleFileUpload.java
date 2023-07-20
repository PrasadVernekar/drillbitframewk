package com.drillbit.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class multipleFileUpload {
WebDriver ldriver;
	
	public multipleFileUpload (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath = "//*[@data-testid='AddIcon']")
	WebElement maddButton;
	
	@FindBy(name = "folder_name")
	WebElement mfoldername;
	
	@FindBy(xpath="//*[text()='Submit']")
	WebElement mfoldersubmit;
	
	@FindBy(xpath="//*[@aria-label='close']")
	WebElement mClose;
	
	@FindBy(xpath="//tbody/tr[1]/td[5]/button[3]//*[name()='svg']//*[name()='path' and contains(@d,'m12 4-1.41')]")
	WebElement mForwardbtn;
	
	@FindBy(xpath="//*[@data-testid='AddIcon']")
	WebElement mAdd_Icon;
	
	@FindBy(xpath="//span[text()='English']")
	WebElement meng;
	
	@FindBy(xpath="//*[text()='Browse your file here']")
	WebElement mBrowseyourfile;
	
	@FindBy(name="authorName0")
	WebElement mAuthorName;
	
	@FindBy(name="title0")
	WebElement mTitleName;
	
	@FindBy(name="documentType0")
	WebElement mDocument_type;
	
	@FindBy(name="authorName1")
	WebElement mAuthorName1;
	
	@FindBy(name="title1")
	WebElement mTitleName1;
	
	@FindBy(name="documentType1")
	WebElement mDocument_type1;
	
	@FindBy(xpath="//*[text()='Submit']")
	WebElement mSubmit;
	
	public void addbtn() {
		maddButton.click();
	}
	
	public void fname(String folder) {
		mfoldername.sendKeys(folder);
	}
	
	public void fsubmit() {
		mfoldersubmit.click();
	}
	
	public void close() {
	 mClose.click();
	}
	
	public void forwardbtn() {
		mForwardbtn.click();
	}
	
	public void AddIcon() {
		mAdd_Icon.click();
	}
	
	public void English() {
		meng.click();
	}
	
	public void browseyourfile() {
	mBrowseyourfile.click();
	}
	
	public void AuthorName(String aname) {
	mAuthorName.sendKeys(aname);
	}

	public void TitleName(String tname) {
	mTitleName.sendKeys(tname);
	}
	
	public void document_type(String documenttype) {
	mDocument_type.sendKeys(documenttype);
	}
	
	public void AuthorName1(String aname) {
		mAuthorName1.sendKeys(aname);
		}

		public void TitleName1(String tname) {
		mTitleName1.sendKeys(tname);
		}
		
		public void document_type1(String documenttype) {
		mDocument_type1.sendKeys(documenttype);
		}
	
	public void submit() {
	mSubmit.click();
	}

}
