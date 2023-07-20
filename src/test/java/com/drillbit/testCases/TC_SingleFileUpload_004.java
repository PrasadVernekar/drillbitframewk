package com.drillbit.testCases;

import java.util.concurrent.TimeUnit;
import java.awt.AWTException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.Robot;
import java.awt.Toolkit;
import com.drillbit.pageObjects.*;

public class TC_SingleFileUpload_004 extends BaseClass {

	@Test(enabled = true)
	public void SingleFileUpload() throws InterruptedException, AWTException {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		LoginPage lp = new LoginPage(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();

		SingleFileUpload sf = new SingleFileUpload(driver);
		sf.addbtn();
		sf.fname("Geopolitics");
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		sf.fsubmit();
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(5000);
		sf.close();
		Thread.sleep(5000);
		sf.forwardbtn();
		sf.AddIcon();
		sf.English();
		sf.browseyourfile();

		Robot rb = new Robot();
		StringSelection str = new StringSelection("C:\\Users\\Lenovo\\Downloads\\Testing.pdf");
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
		sf.AuthorName("S Jaishankar");
		sf.TitleName("External Affair");
		rb.delay(2000);
		sf.document_type("e-Book");
		rb.delay(2000);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.delay(2000);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.delay(2000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.delay(2000);
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.delay(2000);
		sf.submit();

	}
}