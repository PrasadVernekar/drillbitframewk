package com.drillbit.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class similarityReport {
WebDriver ldriver;
	
	public similarityReport(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath = "//tbody/tr[1]/td[5]/button[3]//*[name()='svg']//*[name()='path' and contains(@d,'m12 4-1.41')]")
	WebElement Forwardbtn;

	@FindBy(xpath="//*[text()='1%']")
	WebElement percentage;
	
	@FindBy(xpath="//*[@title='Download']")
	WebElement download;
	
	@FindBy(xpath="//*[text()='PDF Report']")
	WebElement pdfreport;
	
	public void forwardbtn() {
		Forwardbtn.click();
	}
	
	public void Percentage() {
		percentage.click();
	}
	
	public void download() {
		download.click();
	}
	
	public void pdfReport() {
		pdfreport.click();
	}
	
	
}
