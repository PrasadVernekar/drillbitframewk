package com.drillbit.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	 public LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[text()='Sign in']")
	WebElement login;
	
	@FindBy(xpath="//div[text()='Prasad']")
	WebElement Name;
	
	
	public void setUserName(String uname) {
		username.sendKeys("prasad.v@drillbit.com");
	}
	
	public void setPassword(String pwd) {
		password.sendKeys("Classmate@27");
	}
	
	public void clickSubmit() {
		login.click();
	}
	
	public String Name() {
		return Name.getText(); 
	}
	

	
}
