package com.drillbit.testCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.drillbit.pageObjects.LoginPage;
import com.drillbit.pageObjects.*;
import com.drillbit.pageObjects.createFolder;

public class TC_ETE_007 extends BaseClass {

	@Test(enabled = false, invocationCount = 5, invocationTimeOut = 1200000)
	public void ETE() throws InterruptedException, AWTException {

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		LoginPage lp = new LoginPage(driver);
		ETE ete = new ETE(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();

		Thread.sleep(3000);
		
		ete.addbtn();
		ete.fname("Mathematics");
		js.executeScript("window.scrollBy(0,500)");
		ete.fsubmit();
		js.executeScript("window.scrollBy(0,-500)");
		ete.close();
		Thread.sleep(5000);
		ete.forwardbtn();
		ete.AddIcon();
		ete.English();
		ete.browseyourfile();

		Robot rb = new Robot();
		StringSelection str = new StringSelection("F:\\Testing(1).pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.delay(2000);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(2000);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.delay(2000);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(2000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.delay(2000);
		rb.keyRelease(KeyEvent.VK_ENTER);
		ete.AuthorName("S Jaishankar");
		ete.TitleName("External Affair");
		rb.delay(2000);
		ete.document_type("e-Book");
		rb.delay(2000);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.delay(2000);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.delay(2000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.delay(2000);
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.delay(2000);
		ete.submit();
		rb.delay(2000);
		ete.Delete();
		rb.delay(2000);
		ete.Yes();
		
		rb.delay(2000);
		ete.myfold();
		
		rb.delay(2000);
		ete.myfolddelte();
		
		rb.delay(2000);
		ete.myfoldyes();
		
		rb.delay(25000);
		ete.logo();
		rb.delay(2000);
		ete.Logout();
	}
}
