package com.drillbit.testCases;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.*;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.drillbit.pageObjects.*;

public class TC_LoginTest_001 extends BaseClass {

	@Test(enabled = false, invocationCount = 10, invocationTimeOut= 60000)
	public void loginTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		String actual_text =lp.Name();
		String expected_text="Prasad";
		Assert.assertEquals(actual_text,expected_text);
		lp.dropdown();
		Thread.sleep(5000);
		lp.logout();
	}
}
//}
//Assert.assertTrue(actual_text.contains("Prasad"));