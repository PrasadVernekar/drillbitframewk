package com.drillbit.testCases;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import java.awt.Robot;
import java.awt.Toolkit;

import com.drillbit.pageObjects.*;

public class TC_multipleFileUpload_005 extends BaseClass {

	@Test(enabled = true)
	public void multipleFileUpload() throws InterruptedException, AWTException, IOException {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Robot rb = new Robot();

		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();

		multipleFileUpload mf = new multipleFileUpload(driver);
		mf.forwardbtn();
		mf.AddIcon();
		mf.English();

		// String[] filepath
		// ={"C:\\Users\\Lenovo\\Downloads\\Testing.pdf","C:\\Users\\Lenovo\\Downloads\\AWS.pdf"};
		// or (String filePaths : filepath) {
		mf.browseyourfile();
		rb.delay(5000);
		StringSelection str1 = new StringSelection("F:\\Files");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str1, null);
		// autoit
		// //Runtime.getRuntime().exec("C://Users//Lenovo//Desktop//multiplefiles.exe");
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

		int x = 500; // X coordinate
		int y = 300; // Y coordinate

		// Move the mouse to the specified coordinate
		rb.mouseMove(x, y);

		// Simulate pressing and releasing the left mouse button
		rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);

		rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.delay(2000);
		rb.keyPress(KeyEvent.VK_A);
		rb.delay(2000);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.delay(2000);
		rb.keyRelease(KeyEvent.VK_A);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.delay(2000);
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.delay(2000);
		/*
		 * rb.keyPress(KeyEvent.VK_CONTROL); rb.delay(2000); rb.keyPress(KeyEvent.VK_V);
		 * rb.delay(2000); rb.keyRelease(KeyEvent.VK_CONTROL);
		 * rb.keyRelease(KeyEvent.VK_V);
		 * 
		 * 
		 * rb.keyPress(KeyEvent.VK_ENTER); rb.delay(2000);
		 * rb.keyRelease(KeyEvent.VK_ENTER); rb.delay(2000);
		 */

		mf.AuthorName("Michael Scott");
		rb.delay(2000);
		mf.TitleName("Management");
		rb.delay(2000);
		mf.document_type("Thesis");
		rb.delay(2000);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.delay(2000);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.delay(2000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.delay(2000);
		rb.keyRelease(KeyEvent.VK_ENTER);

		mf.AuthorName1("Chandler Bing");
		rb.delay(2000);
		mf.TitleName1("Data Analyst");
		rb.delay(2000);
		mf.document_type1("e-Book");
		rb.delay(2000);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.delay(2000);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.delay(2000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.delay(2000);
		rb.keyRelease(KeyEvent.VK_ENTER);
		mf.submit();

	}
}