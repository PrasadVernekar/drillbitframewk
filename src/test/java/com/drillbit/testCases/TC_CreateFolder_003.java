package com.drillbit.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import com.drillbit.pageObjects.*;

public class TC_CreateFolder_003 extends BaseClass {
	
 @Test (enabled = true)
 public void CreateFolder() throws InterruptedException {
	 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 LoginPage lp = new LoginPage(driver);
	 JavascriptExecutor js = (JavascriptExecutor) driver;
		
	 lp.setUserName(username);
	 lp.setPassword(password);
	 lp.clickSubmit();
	 
	 Thread.sleep(3000);
	 createFolder cf = new createFolder(driver); 
	 cf.addbtn();
	 cf.fname("Mathematics");
	 js.executeScript("window.scrollBy(0,500)");
	 cf.fsubmit();
}
}