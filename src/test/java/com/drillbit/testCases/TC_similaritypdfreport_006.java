package com.drillbit.testCases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.drillbit.pageObjects.*;

public class TC_similaritypdfreport_006 extends BaseClass {
	@Test (enabled = false, invocationCount = 10, invocationTimeOut= 1200000)
	public void similaritypdfreport() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		LoginPage lp = new LoginPage(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();

		similarityReport sr = new similarityReport(driver);
		sr.forwardbtn();
		sr.Percentage();
		Set<String> windowHandles = driver.getWindowHandles();
		String mainWindowHandle = driver.getWindowHandle();
		for (String windowHandle : windowHandles) {
		    if (!windowHandle.equals(mainWindowHandle)) {
		        driver.switchTo().window(windowHandle);
		        break;
		    }
		}
		Thread.sleep(15000);
		sr.download();
		sr.pdfReport();
		driver.quit();
	}
}
